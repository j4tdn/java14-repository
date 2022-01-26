package ex01;

public class Symmetrical {
    public static void main(String[] args) {
		int n = 1313;
		if (isSymmetrical(n))
			System.out.println("n là số đối xứng!");
		else
			System.out.println("n không phải là số đối xứng");
	}
    public static int reverseNumber(int n) {
    	int reverseNumber = 0;
    	while (n > 0) {
    		reverseNumber = reverseNumber*10 + n % 10;
    		n /= 10;
    	}
    	return reverseNumber;
    }
    public static boolean isSymmetrical(int n) {
    	return n == reverseNumber(n);
    }
}
