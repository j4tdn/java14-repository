package operator;

public class Ex01 {

	public static void main(String[] args) {
		//++ -- !
		int i = 5;
		i++; // <=> i+=1 <=> i=i+1;
		System.out.println(" i = "+i);
		
		boolean isPoweOf = isPowerOf(3);
		
		
	}
	
	// Kiểm tra 1 số xem có phải là bội của 3 hay không.
	private static boolean isPowerOf(int number) {
		return number %3 == 0;
	}

}
