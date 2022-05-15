package package03;

public class Ex03 {
	public static void main(String[] args) {
		String ip = "Welcome   to JAVA10   class";
		ip = ip.trim().replaceAll("\\s+", " ");
		System.out.println("output: " + ip);
		StringBuilder str = new StringBuilder(ip);
		System.out.println("daochuoi: "+ str.reverse().toString());
	}
}
