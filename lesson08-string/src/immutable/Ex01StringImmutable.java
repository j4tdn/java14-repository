package immutable;

import static utils.StringUtils.*;
public class Ex01StringImmutable {
	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "become";
		
		hash("s1",s1);
		hash("s2",s2);
		hash("s3",s3);
		
		s3 = "tobe";
		hash("s3",s3);

		
		System.out.println("================");
		
		String o1 = new String("Hello");
		String o2 = new String("Merci");
		String o3 = new String("Hello");

		hash("o1",o1);
		hash("o2",o2);
		hash("o2",o3);
 	}
}
