package condition;

public class Pair {
	//attribute
	public int min;
	public int max;
	
	public Pair(int min, int max) {
	this.min=min;
	this.max=max;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "min" + min + ",max=" +max; 
	}
}
