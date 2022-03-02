package exercises;

public class Ex02 {

	public static void main(String[] args) {
		String input = "5";
		String pattern = "[123456789]";//match if input is 1||2||3...
		//[0-9] match if input 1||2||...||9
		//{1-10} >>> number of letters from 0 to 10
		//{1,} from 1 to n
		System.out.println("match: "+input.matches(pattern));
	}

}
