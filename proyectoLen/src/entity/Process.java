package proyectoLen.src.entity;

import java.util.Map;
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
	// read(c):send(a', c):
	protected ArrayList<String> secuencia = new ArrayList<>();
	protected HashMap<String, Object> localVar = new HashMap<>();

	public Process() {
	}

	public Process(String secuencia, String listaParametros) {
		String aux = secuencia.replaceAll("\\)[.]", ")").replaceAll("[.]\\(", "(");
		String[] secArray = aux.split("[\\(||\\)]");
      StringTokenizer lista = new StringTokenizer(listaParametros, ":");
		// Las variables locales del proceso
      while (lista.hasMoreTokens()) {
         String val = lista.nextToken();
         if(val.contains("'") ){
				if(val.contains("Int")){
               this.localVar.put(val.split("~")[0], Integer.MAX_VALUE);
            }else if(val.contains("String")){
               this.localVar.put(val.split("~")[0], "");
            }
         }
      }
		this.listaParametros = listaParametros;
		// Agrega la secuencia del Proceso
		for (String sec : secArray) {
			if (sec.length() != 0)
				this.secuencia.add(sec);
		}
      System.out.println("LocalVar: " + this.localVar);
	}

	protected <T> void send(T value, Channel c) {
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

	protected Channel crech() {
		return new Channel();
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

	public void run(Map<String, Channel> channels, String parameters, boolean toPrint) {
      //    c[b']      	 c/f'		   if c' op s' 	[#z]
		HashMap<String, Channel> aux = new HashMap<>(channels);
		HashMap<String, String> channelMap = mapParameter(parameters);
		for(String s: secuencia) {
			StringTokenizer token = new StringTokenizer(s, ".");
			while (token.hasMoreTokens()) {
            String t = token.nextToken();
            if(t.contains("/")){
               String[] tAux = t.split("/");
               send(localVar.get(tAux[1]), aux.get(channelMap.get(tAux[0])));
            }
            if(t.contains("#")){
               // crech();
               // System.out.println("entro a createchanel");
            }
            if(t.contains("'")){
               // read(s, null);
               // System.out.println("entro a read");
            }
			}
		}
      /* 
				M.get(y) --> xx
			sw
				case
					si el canal no esta en el mapa lo busca en los globales
					this.read(b', channel)
		*/
		
      System.out.println("llegaome");
		// No supported yet
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