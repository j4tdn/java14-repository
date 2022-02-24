package exeroses;

public class Ex02 {

	public static void main(String[] args) {
		String input = "123456789";
		//[0-9]match if input is 1 || 2|| 3||4||5||6||7||8||9....
		//{1,10} ==>> number of letters from 1 to 10
		//{1,} <<==>> + >>> from 1 to n
		//
		String pattern = "[0-9]{1,5}";
		
		System.out.println("match: " + input.matches(pattern));
	}

}
