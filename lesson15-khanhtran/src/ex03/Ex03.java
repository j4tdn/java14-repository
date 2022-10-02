package ex03;

import java.util.HashSet;

public class Ex03 {
	public static void main(String[] args) {
		int x = 4;
		System.out.println(x + " is happy number? " + isHappyNumber(x));
	}
	
	public static int sumSquare(int ip) {
		int result = 0;
		while(ip>0) {
			result +=(int)Math.pow(ip%10, 2);
			ip /= 10;
		}
		return result;
	}
	
	public static boolean isHappyNumber(int ip) {
		HashSet<Integer> collectors = new HashSet<Integer>();
		int tmp = sumSquare(ip);
		while(true) {
			System.out.println(tmp);
			if(tmp == 1) return true;
			if(collectors.contains(tmp)) return false;
			collectors.add(tmp);
			tmp = sumSquare(tmp);
		}
	}
}
