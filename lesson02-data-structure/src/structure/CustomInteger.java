package structure;

public class CustomInteger {
	public int value;

	// constructor
	public CustomInteger(int param) {
		this.value = param;
	}

	@Override
	public String toString() {
		return "" + this.value;
	}
}
