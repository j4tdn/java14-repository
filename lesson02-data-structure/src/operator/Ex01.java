package operator;

public class Ex01 {
	public static void main(String[] args) {
		
		int i = 6;
		i++; 
		
		boolean isPowerOf = isPowerOf3(i);
		
		if (!isPowerOf) {
			System.out.println("i: " + i);
		}
	}
	
	
	private static boolean isPowerOf3(int number) {
		return number % 3 == 0;
	}
	
	
}