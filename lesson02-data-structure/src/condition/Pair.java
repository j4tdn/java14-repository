package condition;

public class Pair {
	public int min;
	public int max;
	
	//contructor
	public Pair(int min,int max) {
		this.max = max;
		this.min = min;
	}
	
	@Override
	public String toString() {
		return "min = "+  this.min + " , max : "+ this.max;
	}
}
