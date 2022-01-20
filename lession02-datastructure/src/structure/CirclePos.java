package structure;

public enum CirclePos {
	// CirclePos= new  Circle("value");
	INSIDE("inside"),
	OUTSIDE("outside"),
	ONSIDE("onside");
	
	public String value;
	// must have Constructor
	CirclePos(String value){
		this.value=value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value;
	}
}
