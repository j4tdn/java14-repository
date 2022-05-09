package immutable;

public class Ex03Exercises {
	public static void main(String[] args) {
		/*
		 * 
		 */
		String a = "apple"; // start:0 end:0
		System.out.println("start: " + a.indexOf(a));
		System.out.println("end: " + a.lastIndexOf(a));
		String s1 = "alibaba";
		
		/*
		 * startsWith, endsWith		
		 */
		String s2= "hello albaa";
		System.out.println(s2.startsWith("hello"));
		
		System.out.println(s2.replace("hello","hi"));
		System.out.println(s2.trim());
		
		String s3= "  welcome to     our class   ";
		System.out.println(s3.trim());
		System.out.println(s3.strip());
		s3=s3.trim().replaceAll("[\\s]+", " ");
		System.out.println(s3);
		System.out.println(s3.substring(1, 5)); 

	}
}
