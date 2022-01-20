package structure;

public enum CirclePos {
	INSIDE ("Trong đường tròn"),
	ONSIDE ("Trên đường tròn"),
	OUTSIDE ("Ngoài đường tròn");
	
	public String value;
	
	CirclePos(String value){
		this.value = value;
	}
	public String toString() {
		return value;
	}
}
