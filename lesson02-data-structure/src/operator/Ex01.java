package operator;

public class Ex01 {

	public static void main(String[] args) {
		int i = 5;
		i++;
		System.out.println("i: " + i);
		
		boolean isPowerOf = isPowerOf3(i);
		if(isPowerOf) {
			System.out.println(i);
		}
		if(!isPowerOf) {
			System.out.println(i);
		}
	}

	// Kiem tra 1 so co phai la boi cua 3 hay ko?
	private static boolean isPowerOf3(int number) {
		return number % 3 == 0;
	}

}
