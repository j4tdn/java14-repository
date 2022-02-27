package bean;

public class Car {
	// attributes, constructor, getter, setter, [hashcode], equals, toString
		private String serial;
		public static String model;
		private String color;
		
	
		
		// Database >> Table >> Column >> NULL/VALUE
		// JAVA 1.5 >> Generic, Collection
		
		public Car() {
		}
		
		
		public Car(String serial, String color) {
			this.serial = serial;
		
			this.color = color;
		}

		public String getSerial() {
			return serial;
		}

		public void setSerial(String serial) {
			this.serial = serial;
		}

		public String getModel() {
			return model;
		}

	

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
		
	
		
	
		

		@Override
		public String toString() {
			return serial + ", " + model + ", " + color;
		}
}
