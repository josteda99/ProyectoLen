package proyectoLen.src.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Process {

	// X(a, v, d)
	// run X(a, e, y)

	// parametro canal c
	// parametro var a nombre - tipo
	// c:a'-s
	protected String listaParametros;

	// read(c):send(a', c):
	protected String secuencia;
	protected HashMap<String, Object> localVar = new HashMap<>();

	public Process() {
	}

	public Process(String secuencia, String listaParametros) {
		this.secuencia = secuencia;
		this.listaParametros = listaParametros;
	}

	protected <T> void send(T value, Channel<T> c) {
		c.sendValue(value);
	}

	protected <T> void read(String name, Channel<T> c) {
		if (localVar.containsKey(name))
			localVar.compute(name, (k, v) -> v = c.getValue());
		else
			localVar.put(name, c.getValue());
	}

	protected void ifStat() {
		// No supported yet
	}

	protected <T> Channel<T> crech() {
		return new Channel<>();
	}

	public void run(Map<String, Channel<Object>> channels, String parameters, boolean toPrint) {
		HashMap<String, Channel<Object>> aux = new HashMap<>(channels);
 		// No supported yet
	}

	public boolean sameParameters(String values) {
		StringTokenizer inCome = new StringTokenizer(values, ":");
		StringTokenizer inProcess = new StringTokenizer(listaParametros, ":");
		if(inCome.countTokens() != inProcess.countTokens())
			return false;
		while (inCome.hasMoreTokens()) {
			
		}
		return true;
	}
}
