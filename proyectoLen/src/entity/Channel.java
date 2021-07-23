package proyectoLen.src.entity;

import java.util.ArrayList;

public class Channel<T> {
	
	protected ArrayList<T> path = new ArrayList<>();

	public Channel() {}

	public T getValue() {
		return path.get(0);
	}

	public void sendValue(T value) {
		path.add(value);
	}
}
