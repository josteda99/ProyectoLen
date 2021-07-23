package proyectoLen.src.entity;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Process {

	// X(a, v, d)
	// run X(a, e, y)

   // parametro canal c
	// parametro var a nombre - tipo
	// c:a'-s
	protected String ListaParametros;

	// read(c):send(a', c):
   protected String secuencia;
	protected HashMap<String,Object> localVar = new HashMap<>();
	
   public Process() {}

   public Process(String secuencia,  String ListaParametros) {
      this.secuencia = secuencia;
      this.ListaParametros = ListaParametros;
   }

   protected <T> void send(T value, Channel<T> c) {
	   c.sendValue(value);
   }

   protected <T> void read(String name, Channel<T> c){
		if (localVar.containsKey(name))
			localVar.compute(name, (k, v) -> v = c.getValue());
		else
			localVar.put(name, c.getValue());
   }
   
   protected void ifStat(){
	   // No supported yet
   }

	protected <T> Channel crech() {
	  return new Channel<T>();
   }

	protected void run(HashMap<String, Channel> channels, String parameters, boolean toPrint) {
		
   }

}
