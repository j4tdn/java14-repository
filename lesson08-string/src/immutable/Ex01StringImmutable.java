package immutable;

import static utils.StringUtils.hash;

public class Ex01StringImmutable {
	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "Welcome";
		String s3 = "become";
		hash("s1", s1);
		hash("s2", s2);
		hash("s3", s3);
		
		System.out.println("============");
		
		String o1= new String("hello");
		String o2= new String("konichiwa");
		String o3= new String("hello");
		hash("o1", o1);
		hash("o2", o2);
		hash("o3", o3);
	}
}
