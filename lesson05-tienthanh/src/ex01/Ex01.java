package ex01;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(20, 4));
		
	}

	public static boolean isPowerOf(int a, int b) {
		if(a==0||b==0)
		{
			return false;
		}
		if(a==1||b==1) {
			return true;
		}
		if(a==b) {
			return true;
		}
		if(a>b) {
			if((a%b)==0) {
				return isPowerOf(a/b, b);
			}
			else {
				return false;
			}
		}
		else {
			if((b%a==0)) {
				return isPowerOf(a, b/a);
			}
			else {
				return false;
			}
		}
	}
}