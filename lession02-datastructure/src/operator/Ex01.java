package operator;

public class Ex01 {
	public static void main(String[] args) {
		// ++ --
		int i = 5;
		i++; // <=> i=i+1
		System.out.println("i " + i);
		if(isPowerOf3(i)) {
			System.out.println(i);
		}

	}

	// check a number is power of 3
	private static boolean isPowerOf3(int number) {
		return number % 3 == 0;
	}
}
