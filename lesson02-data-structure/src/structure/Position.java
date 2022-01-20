package structure;

public enum Position {
	//
	INSIDE("Trong duong tron"),
	ONSIDE("Tren duong tron"),
	OUTSIDE("Ngoai duong tron");
	
	public String value;
	
	Position(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
