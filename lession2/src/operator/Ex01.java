package operator;

public class Ex01 {
	public static void main(String[] args) {
		int i = 5;
		i++;
		System.out.println("i: " + i);
		boolean isPowerOf = isPowerOf3(i);
		// neu i khong phai la boi cua 3 thi in ra, nguoc lai thi khong in
		// if(isPowerOf) >>> if(isPowerOf) == true;
		// if(!isPowerOf) >>> if(isPowerOf) == false;
 		if(!isPowerOf) {
 			System.out.println();
 		}
		
	}
	// kiem tra 1 so có phải bội của 3 hay không?
	private static boolean isPowerOf3(int number) {
		return number % 3 == 0;
	}
}
