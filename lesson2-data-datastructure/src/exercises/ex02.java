package exercises;

public class ex02 {
	public static void main(String[] args) {
		String input = "5";
		
		//[0-9] math if input is 1||2||3...||9
		//{1,10} >> number of letter from 1 to 10
		//{1,} >> from 1 to n
		String pattenrn = "[0-9]+";
		System.out.println("match:"+input.matches(pattenrn));
	}
}
