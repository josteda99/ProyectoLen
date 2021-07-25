package proyectoLen.src.entity;

import java.util.ArrayList;

public class Channel {
	
	protected ArrayList<Object> path = new ArrayList<>();
   protected String name;
   protected String type;

	public Channel() {}

   public Channel(String type, String name) {
      // System.out.println("Channel Correct -> " + name);
      this.type = type;
      this.name = name;
   }

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

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getType() {
      return this.type;
   }

   public void setType(String type) {
      this.type = type;
   }

}
