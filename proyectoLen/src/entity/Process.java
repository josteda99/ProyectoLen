package proyectoLen.src.entity;
import java.util.HashMap;
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
	public static HashMap<String, Channel> globalChannel = new HashMap<>();
	public static int spam = 10;

	public Process() {
	}

	public Process(String secuencia, String listaParametros) {
		String aux = secuencia.replaceAll("\\)[.]", ")").replaceAll("[.]\\(", "(");
		String[] secArray = aux.split("[\\(|\\)]");
		StringTokenizer lista = new StringTokenizer(listaParametros, ":");
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
		for (String sec : secArray) {
			if (sec.length() != 0) {
				if (sec.contains(".&"))
					sec = sec.replace(".&", "");
				this.secuencia.add(sec);
			}
		}
	}

	protected <T> void send(T value, Channel c) {
		c.sendValue((Object) value);
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

	protected void ifStat() {
		// No supported yet
	}

	protected Channel crech(String name, String type) {
		return new Channel(type, name);
	}

	// Mapea los parametros que recive de entrada con los parametros de la declaracion
	protected HashMap<String, String> mapParameter(String inCome) {
      String[] inComeSep = inCome.split(":");
      String[] aux = this.listaParametros.split(":");
      HashMap<String, String> channelMap = new HashMap<>();
		for(int i = 0; i < inComeSep.length; i++){
			if (!aux[i].contains("'")) {
				channelMap.put(aux[i], inComeSep[i].replace("+", ""));
			} else {
				Object value = inComeSep[i].replace("+", "");
				localVar.computeIfPresent(aux[i].split("~")[0], (k,v) -> v = value);
			}
		}
      return channelMap;
	}

	protected void spam(String secuencia, HashMap<String, String> channelMap, boolean print) {
		boolean once = false;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < spam; i++) {
			StringTokenizer token = new StringTokenizer(secuencia, ".");
			while (token.hasMoreTokens()) {
				String t = token.nextToken();
				if (t.contains("/")) {
					// Llamada a funcion write usando los parametros
					String[] tAux = t.split("/");
					send(localVar.get(tAux[1]), globalChannel.get(channelMap.get(tAux[0])));
					continue;
				}
				if (t.contains("'")) {
					// Llamada a funcion read usando los parametros
					String[] tAux = t.split("\\[");
					tAux[1] = tAux[1].replace("]", "");
					read(tAux[1], globalChannel.get(channelMap.getOrDefault(tAux[0], tAux[0])));
					if (!once && print) {
						once = true;
						sb.append("Read: ");
					}
					if (print)
						sb.append(localVar.get(tAux[1])  + " ");
				}
			}
		}
		if (print) System.out.println(sb.toString());
	}

	public void run(String parameters, boolean toPrint) {
      //    c[b']      	 c/f'		   if c' op s' 	[#z -> ~Int]
		HashMap<String, String> channelMap = mapParameter(parameters);
		for(int i = 0; i < secuencia.size(); i++) {
			StringTokenizer token = new StringTokenizer(secuencia.get(i), ".");
			while (token.hasMoreTokens()) {
				String t = token.nextToken();
				if(t.contains("!")){
					//llamada a Spam
					if (t.length() == 1) 
						spam(secuencia.get(++i), channelMap, (i == secuencia.size() - 1 && toPrint));
					else 
						spam(t.replace("!", ""), channelMap, (i == secuencia.size() - 1 && toPrint));
					continue;
            }
            if(t.contains("/")) {
					// Llamada a funcion write usando los parametros
               String[] tAux = t.split("/");
					send(localVar.get(tAux[1]), globalChannel.get(channelMap.get(tAux[0])));
					if ((i == secuencia.size() - 1) && toPrint) {
						System.out.printf(
							"Sent to Channel %s\n",
							channelMap.get(tAux[0]));
					}
					continue;
				} 
            if(t.contains("#")) {
					// Llamada a funcion crech usando los parametros
               String[] tAux = t.split("->");
               tAux[0] = tAux[0].replace("[","").replace("#","");
               Channel a = crech(tAux[0], tAux[1].replace("~", "").replace("]", ""));
					globalChannel.putIfAbsent(tAux[0], a);
					channelMap.putIfAbsent(tAux[0], tAux[0]);
               if ((i == secuencia.size() - 1) && toPrint) {
						System.out.printf(
								"Created Channel %s\n",
								a.getName());
					}
					continue;
            }  
            if(t.contains("'")) {
					// Llamada a funcion read usando los parametros
					String[] tAux = t.split("\\[");
               tAux[1] = tAux[1].replace("]","");
					read(tAux[1], globalChannel.get(channelMap.getOrDefault(tAux[0], tAux[0])));
               if ((i == secuencia.size() - 1) && toPrint) {
						System.out.printf(
								"Read: value %s from Channel %s\n",
								localVar.get(tAux[1]),
								channelMap.get(tAux[0]));
					}
				}
			}
		}
	}

	public boolean sameParameters(String values) {
		StringTokenizer inCome = new StringTokenizer(values, ":");
		StringTokenizer inProcess = new StringTokenizer(listaParametros, ":");
		if(inCome.countTokens() != inProcess.countTokens())
			return false;

		while (inCome.hasMoreTokens()) {
			String passToken = inCome.nextToken();
			String proToken = inProcess.nextToken();
			if (!proToken.contains("'") && passToken.contains("+")) 
				continue;
			if (proToken.contains("'") && !passToken.contains("+")) {
				boolean type = passToken.matches("[+-]?\\d*(\\.\\d+)?");
				if (proToken.contains("Int") && !type 
					|| proToken.contains("String") && type)
					return false;
			} else 
            	return false;
      }
		return true;
	}

	public static void state() {
		System.out.println("\n-------------------------------");
		System.out.println("---------Final state-----------\n");
		globalChannel.forEach((k, c) -> {
			System.out.printf("Channel name: %s ->\n", c.getName());
			c.getPath().forEach(o -> System.out.printf("%s ", o.toString()));
			System.out.println();
		});
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
	}
}