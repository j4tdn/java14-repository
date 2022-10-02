package ex02;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		String tmp = "sadfasdsff";
		mostFrequentlyCharacter(tmp);
	}
	
	public static boolean isCharacter(String ip) {
		return ip.matches("[a-zA-Z]*");
	}
	
	public static void mostFrequentlyCharacter(String ip) {
		if(!isCharacter(ip) || ip == null || ip.length() == 0) {
			System.out.println("Wrong input!!!");
			return;
		}
		char[] tmp = ip.toCharArray();
		List<Character> elements = new ArrayList<Character>();
		int max = 0;
		for(int i=0; i<tmp.length-1; i++) {
			int count = 1;
			for(int j=i+1; j<tmp.length; j++) {
				if(tmp[i] == tmp[j]) {
					count++;
				}
			}
			if(count == max) {
				elements.add(tmp[i]);
				continue;
			}
			if(count > max) {
				elements.clear();
				elements.add(tmp[i]);
				max = count;
			}
		}
		for(int i = 0; i<elements.size(); i++) {
			if(i==elements.size()-1) {
				System.out.println(elements.get(i));
				return;
			}
			System.out.print(elements.get(i) + ", ");
		}
	}
}
