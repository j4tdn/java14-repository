package view;

public class test {
	public static void main(String[] args) {
		long a=10223;
		String temp=""+a;
		int b=Integer.parseInt(temp);
		System.out.println(b);
		
		int c= Math.toIntExact(a);
		
		
		///
		int d=(int)a;
	}
}
