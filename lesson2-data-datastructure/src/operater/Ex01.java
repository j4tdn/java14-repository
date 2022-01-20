package operater;

public class Ex01 {
	public static void main(String[] args) {
		// ++  --
		int i=5;
		i++; // i+=1 and i=i+1;
		System.out.println("i"+i);
		boolean isPowerOf = isPowerOf3(i);
		// Nếu i không phải là bội của 3 thì thêm dấu ! trước 
		//Nếu i là bội của 3 thì in ra ngược lai
		if(isPowerOf) {
			System.out.println("i"+i);
		}
	}
	//Kiểm tra 1 số có phải là bội của 3 hay không
	// == Kiểm ra biểu thức đúng sai >> true, false
	private static boolean isPowerOf3(int number) {
		return number%3==0;
	}
}
