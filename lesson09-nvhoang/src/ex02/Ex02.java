package ex02;

public class Ex02 {
	public static void main(String[] args) {
		String[] st = {"01a2b3456cde478"};
		int[] results = new int[st.length];
		int a = 0;
		for(int i = 0; i < st.length; i++) {
			results[a] = getLargestNumber(st[i]);
			a++;
		}
		int resultFinal = getLargestNumber(st[0]);
		System.out.println(resultFinal);
	}
	
	private static int getLargestNumber(String s) {
		String[] charac = s.split("[a-z]+");
		int[] n = new int[charac.length];
		
		int max = 0;
		
		for (int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(charac[i]); 
		}
		for (int i = 0; i < n.length; i++) {
			if(n[i] > max) {
				max = n[i];
			}
		}
		return max;
	}
}
