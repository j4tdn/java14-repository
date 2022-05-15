package ex03;

public class Ex03 {
	
	public static void main(String[] args) {
		String test = "   Welcome   to  Java10   ";
		test = test.trim();
		test = test.replaceAll("\\s+", " ");
		System.out.println(test);
		test = revert(test);
		System.out.println(test);
	}
	
	private static String revert(String ip) {
		ip = ip.trim();
		ip = ip.replaceAll("\\s+", " ");
		int i=0;
		int start=0, end=0;
		while(i<ip.length()) {
			if(ip.charAt(i) != ' ') {
				start = i;
				end = i+1;
				while(i<ip.length() && ip.charAt(i) != ' ') {
					end++;
					i++;
				}
			} else {
				ip = ip.replace(ip.substring(start, end), reverseWord(ip.substring(start, end)));
				i++;
			}
		}
		return ip;
	}
	
	private static String reverseWord(String ip) {
        StringBuilder str = new StringBuilder(ip);
		return str.reverse().toString();
	}
}
