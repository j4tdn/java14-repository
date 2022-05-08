package immutable;

import static utils.StringUtils.*;

public class Ex01StringImmutable {
	public static void main(String[] args) {
		String s1 = "become";
		String s2 = "welcome";
		String s3 = "become";
		
		hash("s1", s1);
		hash("s2", s2);
		hash("s3", s3);
		
		s3 = "tobe";
		hash("s3", s3);
		
		System.out.println("=============");
		
		String o1 = new String("hello");
		String o2 = new String("merci");
		String o3 = new String("hello");
		String o4 = new String("welcome");
		
		hash("o1", o1);
		hash("o2", o2);
		hash("o3", o3);
		hash("o4", o4.intern());
	}
}