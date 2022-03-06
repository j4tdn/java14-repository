package exercises;

public class Ex02 {
	public static void main(String[] args) {
		String text = "1223214567765";
		// [0-9] match if input is 1 || 2 || 3 || 4 || ... || 9
		// {1,10} >>> number of letter from 1 to 10
		
		String pattern = "[123456789]";
		System.out.println("match :" + text.matches(pattern));
	}
}
