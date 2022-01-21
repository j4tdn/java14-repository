package condition;

public class Pair {

	public int min;
	public int max;
	
	public Pair(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	@Override
	public String toString() {
		return "min=" + min + ", max=" + max;
	}
}