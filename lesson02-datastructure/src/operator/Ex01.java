package operator;

public class Ex01 {
	public static void main(String[] args) {
		// ++ -- !
		int i=5;
		i++; // <=> i+=1 <=> i=i+1
		System.out.println("i:"+i);
		
		boolean isPowerOf = isPowerOf3(i);
		// nếu i không phải là bội của 3 thì in ra, ngược lại thì không
		//if(isPowerOf) >>> if (isPowerOf ==true)
		if(!isPowerOf) {
			System.out.println("i: "+i);
		}

	}
	// kiểm tra 1 số có phải là bội của 3 hay không
	// ==: Kiểm tra biểu thức đúng sai >> true, false
	private static boolean isPowerOf3(int number) {
		return number % 3==0;
	}
}
