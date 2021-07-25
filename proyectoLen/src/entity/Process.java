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
		String[] secArray = aux.split("[\\(||\\)]");
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
      // System.out.println("Send...");
		c.sendValue((Object) value);
	}

	protected void read(String name, Channel c) {
		if (localVar.containsKey(name))
			localVar.compute(name, (k, v) -> v = c.getValue());
		else
			localVar.put(name, c.getValue());
	}

	protected void ifStat() {
		// No supported yet
	}

	protected Channel crech(String name) {
      System.out.println("Create Channel...");
		return new Channel(name);
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

	public void run(String parameters, boolean toPrint) {
      //    c[b']      	 c/f'		   if c' op s' 	[#z -> ~Int]
		HashMap<String, String> channelMap = mapParameter(parameters);
		for(String s: secuencia) {
			StringTokenizer token = new StringTokenizer(s, ".");
			while (token.hasMoreTokens()) {
            String t = token.nextToken();
            if(t.contains("/")) {
					// Llamada a funcion write usando los parametros
               String[] tAux = t.split("/");
					send(localVar.get(tAux[1]), globalChannel.get(channelMap.get(tAux[0])));
					if (token.countTokens() == 0 && toPrint) {
                  System.out.printf("Sent to Channel %s\n------------------------------\n",channelMap.get(tAux[0]));
					}
					continue;
				} 
            if(t.contains("#")) {
					// Llamada a funcion crech usando los parametros
               String[] tAux = t.split("->");
               tAux[0] = tAux[0].replace("[","").replace("#","");
					globalChannel.putIfAbsent(tAux[0], crech(tAux[0]));
					channelMap.putIfAbsent(tAux[0], tAux[0]);
               if (token.countTokens() == 0 && toPrint) {
                  System.out.printf("Created Channel %s\n------------------------------\n",crech(tAux[0]).name);
					}
					continue;
            }  
            if(t.contains("'")) {
					// Llamada a funcion read usando los parametros
					String[] tAux = t.split("\\[");
               tAux[1] = tAux[1].replace("'","").replace("]","");
					read(tAux[1], globalChannel.get(channelMap.get(tAux[0])));
               if (token.countTokens() == 0 && toPrint) {
                  System.out.printf("Read value %s from Channel %s\n------------------------------\n",localVar.get(tAux[1]),channelMap.get(tAux[0]));
					}
					continue;
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
				if (proToken.contains("Int") && !type)
					return false;
				else if (proToken.contains("String") && type)
					return false;
			} else 
            	return false;
      }
		return true;
	}
}