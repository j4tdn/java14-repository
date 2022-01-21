package structure;

public class CustomInteger {

	 public int value;
		
		public CustomInteger(int param) {
			this.value = param;
		}
		
		@Override
		public String toString() {
			return "" + this.value;
		}
}
