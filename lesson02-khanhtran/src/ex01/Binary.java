package ex01;

public class Binary {
    public static void main(String[] args) {
	    int test = 10;
	    String result = convertDecimalToBinary(test);
	    System.out.println(result);
	}
    public static String convertDecimalToBinary(int n) {
    	String result = "";
    	while (n > 0) {
    		String temp = "";
    		temp = temp + n % 2;
    		result = temp + result;
    		n /= 2;
    	}
    	return result;
    }
}
