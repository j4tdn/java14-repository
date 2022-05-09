package immutable;

import java.util.Arrays;

public class Ex05Split {
	public static void main(String[] args) {
		String s= "Le Na, 02323 232 3232, Nu, EngLish";
		String []elements=s.split(", ");
		
		System.out.println(Arrays.toString(elements));
	}
}
