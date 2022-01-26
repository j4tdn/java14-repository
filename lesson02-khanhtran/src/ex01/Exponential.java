package ex01;

public class Exponential {
    public static void main(String[] args) {
		int x = 8;
		if (isPowerOf2(x))
			System.out.println("x là lũy thừa của 2");
		else
			System.out.println("x không phải là lũy thừa của 2");
	}
    
    public static boolean isPowerOf2(int n) {
    	if (n==1)
    		return true;
        while (n > 0) {
        	if (n % 2 == 1)
        		return false;
        	n /= 2;
        }
        return true;
    }
}
