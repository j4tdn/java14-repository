package operator;


public class Ex02 {
	public static void main(String[] args) {
		int digit = 8;
		int sffValue = digit++; 
		System.out.println("sffValue: " + sffValue);
		System.out.println("digit: " + digit);
		
		int number = 8;
		int preValue = ++number; 
		System.out.println("preValue: " + preValue);
		System.out.println("number: " + number);
		
		
		int a = 8;
		System.out.println(a++);
	}
}