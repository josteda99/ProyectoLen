package proyectoLen.src.entity;

import java.util.ArrayList;

public class Channel {
	
	protected ArrayList<Object> path = new ArrayList<>();

	public Channel() {}

	public Object getValue() {
		return path.remove(0);
	}

	public void sendValue(Object value) {
		path.add(value);
	}

   public ArrayList<Object> getPath() {
      return this.path;
   }

   public void setPath(ArrayList<Object> path) {
      this.path = path;
   }
}
