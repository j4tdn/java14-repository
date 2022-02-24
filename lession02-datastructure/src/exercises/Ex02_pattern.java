package exercises;

public class Ex02_pattern {
	public static void main(String[] args) {
		String text= "2212312312332";
		String pattern="[0-9]+";// match if ip is 1 ||2 || 9
		//[0-9]{1,10} number of letters from 1 to 10
		// [0-9]+ : unlimited quantity
		System.out.println("match: "+text.matches(pattern));
	}

}
