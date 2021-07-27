package proyectoLen.src.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Process {

	// X(a, v, d)
	// run X(a, e, y)

	// parametro canal c
	// parametro var a nombre - tipo
	// c:a'~String:a
	protected String listaParametros;
	protected ArrayList<String> secuencia = new ArrayList<>();
	protected HashMap<String, Object> localVar = new HashMap<>();
	protected HashMap<String, String> channelMap = new HashMap<>();
	public static final Map<String, Channel> globalChannel = new HashMap<>();
	public static int spam = 10;

	public Process() {
	}

	public Process(String secuencia, String listaParametros) {
		String aux = secuencia.replaceAll("\\)[.]", ")").replaceAll("[.]\\(", "(");
		String[] secArray = aux.split("[\\(|\\)]");
		var lista = new StringTokenizer(listaParametros, ":");
		// Las variables locales del proceso
		while (lista.hasMoreTokens()) {
			String val = lista.nextToken();
			if (val.contains("'")) {
				if (val.contains("Int")) {
					this.localVar.put(val.split("~")[0], Integer.MAX_VALUE);
				} else if (val.contains("String")) {
					this.localVar.put(val.split("~")[0], "");
				}
			}
		}
		this.listaParametros = listaParametros;
		// Agrega la secuencia del Proceso
		for (var i = 0; i < secArray.length; i++) {
			String sec = secArray[i];
			if (sec.length() != 0 || i != 0) {
				if (sec.contains(".&"))
					sec = sec.replace(".&", "");
				this.secuencia.add(sec);
			}
		}
	}

	protected <T> void send(T value, Channel c) {
		c.sendValue((Object) value);
	}

	protected Channel crech(String name, String type) {
		return new Channel(type, name);
	}

	protected void read(String name, Channel c) {
		if (localVar.containsKey(name)) {
			Object value = c.getValue();
			localVar.computeIfPresent(name, (k, v) -> v = value);
		} else {
			Object value = c.getValue();
			localVar.put(name, value);
		}
	}

	protected int ifStat(int i, String afterThen, boolean toPrint) {
		var token = new StringTokenizer(afterThen, ".");
		while (token.hasMoreTokens()) {
			i = loopThrougthToken(i, token, toPrint);
		}
		return i;
	}

	protected boolean checkIf(String left) {
		String[] aux;
		if (left.contains("==")) {
			aux = left.split("==");
			return localVar.get(aux[1]).equals(localVar.get(aux[0]));
		}
		aux = left.split("!=");
		return !localVar.get(aux[1]).equals(localVar.get(aux[0]));
	}

	protected int jumpTo(int i) {
		for (int j = i; i < secuencia.size(); i++) {
			if (secuencia.get(j).equals(""))
				return j;
		}
		return i + 1;
	}

	protected int loopThrougthToken(int i, StringTokenizer token, boolean toPrint) {
		String t = token.nextToken();
		String[] tAux;
		if (t.contains("if")) {
			// if c' op s'
			tAux = t.split("then");
			String r  = tAux.length == 1 ? secuencia.get(++i) : tAux[1];
			i = checkIf(tAux[0])? ifStat(i, r, toPrint) :  jumpTo(i);
		} else if (t.contains("!")) {
			// llamada a Spam
			if (t.length() == 1)
				spam(secuencia.get(++i), (i == secuencia.size() - 1 && toPrint));
			else
				spam(t.replace("!", ""), (i == secuencia.size() - 1 && toPrint));
		} else if (t.contains("/")) {
			// Llamada a funcion write usando los parametros
			tAux = t.split("/");
			send(localVar.get(tAux[1]), globalChannel.get(channelMap.getOrDefault(tAux[0], tAux[0])));
			printAction(i, toPrint, "Sent to Channel %s\n", channelMap.get(tAux[0]));
		} else if (t.contains("#")) {
			// Llamada a funcion crech usando los parametros
			tAux = t.split("->");
			tAux[0] = tAux[0].replace("[", "").replace("#", "");
			Channel a = crech(tAux[0], tAux[1].replace("~", "").replace("]", ""));
			globalChannel.putIfAbsent(tAux[0], a);
			channelMap.putIfAbsent(tAux[0], tAux[0]);
			printAction(i, toPrint, "Created Channel %s\n", a.getName());
		} else if (t.contains("'")) {
			// Llamada a funcion read usando los parametros
			tAux = t.split("\\[");
			tAux[1] = tAux[1].replace("]", "");
			read(tAux[1], globalChannel.get(channelMap.getOrDefault(tAux[0], tAux[0])));
			printAction(i, toPrint, "Read: value %s from Channel %s\n", localVar.get(tAux[1]).toString(),
					channelMap.get(tAux[0]));
		}
		return i;
	}

	protected void printSpam(int i, boolean print, String msg, StringBuilder sb) {
		if (i == 0 && print)
			sb.append("Read: ");
		if (print)
			sb.append(localVar.get(msg) + " ");
	}

	// Mapea los parametros que recive de entrada con los parametros de la
	// declaracion
	protected HashMap<String, String> mapParameter(String inCome) {
		String[] inComeSep = inCome.split(":");
		String[] aux = this.listaParametros.split(":");
		for (var i = 0; i < inComeSep.length; i++) {
			if (!aux[i].contains("'")) {
				channelMap.put(aux[i], inComeSep[i].replace("+", ""));
			} else {
				Object value = inComeSep[i];
				localVar.computeIfPresent(aux[i].split("~")[0], (k, v) -> v = value);
			}
		}
		return channelMap;
	}

	protected void spam(String secuencia, boolean print) {
		var sb = new StringBuilder();
		for (var i = 0; i < spam; i++) {
			StringTokenizer token = new StringTokenizer(secuencia, ".");
			while (token.hasMoreTokens()) {
				String t = token.nextToken();
				String[] tAux;
				if (t.contains("/")) {
					// Llamada a funcion write usando los parametros
					tAux = t.split("/");
					send(localVar.get(tAux[1]), globalChannel.get(channelMap.get(tAux[0])));
				} else if (t.contains("'")) {
					// Llamada a funcion read usando los parametros
					tAux = t.split("\\[");
					tAux[1] = tAux[1].replace("]", "");
					read(tAux[1], globalChannel.get(channelMap.getOrDefault(tAux[0], tAux[0])));
					printSpam(i, print, tAux[1], sb);
				}
			}
		}
		if (print)
			System.out.println(sb.toString());
	}

	public void run(String parameters, boolean toPrint) {
		// c[b'] c/f' if c' op s' [#z -> ~Int]
		mapParameter(parameters);
		var i = 0;
		while (i < secuencia.size()) {
			var token = new StringTokenizer(secuencia.get(i), ".");
			while (token.hasMoreTokens()) {
				i = loopThrougthToken(i, token, toPrint);
			}
			i++;
		}
		channelMap.clear();
	}

	protected void printAction(int i, boolean toPrint, String action, String value, String channel) {
		if ((i == secuencia.size() - 1) && toPrint)
			System.out.printf(action, value, channel);
	}

	protected void printAction(int i, boolean toPrint, String action, String value) {
		if ((i == secuencia.size() - 1) && toPrint)
			System.out.printf(action, value);
	}

	public boolean sameParameters(String values) {
		var inCome = new StringTokenizer(values, ":");
		var inProcess = new StringTokenizer(listaParametros, ":");
		if (inCome.countTokens() != inProcess.countTokens())
			return false;

		while (inCome.hasMoreTokens()) {
			String passToken = inCome.nextToken();
			String proToken = inProcess.nextToken();
			if (!proToken.contains("'") && passToken.contains("+"))
				continue;
			if (proToken.contains("'") && !passToken.contains("+")) {
				boolean type = passToken.matches("[+-]?\\d*(\\.\\d+)?");
				if (proToken.contains("Int") && !type || proToken.contains("String") && type)
					return false;
			} else
				return false;
		}
		return true;
	}

	public static void state() {
		System.out.println("\n-------------------------------");
		System.out.println("---------Final state-----------");
		globalChannel.forEach((k, c) -> {
			System.out.printf("Channel %s ->\n", c.getName());
			c.getPath().forEach(o -> System.out.printf("%s ", o.toString()));
			System.out.println();
		});
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
	}
}