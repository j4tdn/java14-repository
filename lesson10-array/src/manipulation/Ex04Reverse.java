package manipulation;

import utils.ArrayUtils;

public class Ex04Reverse {
	public static void main(String[] args) {
		int[]elements= {33,18,22,44,20};
		reverse(elements);
		ArrayUtils.printf(elements);
	}
	private static void reverse(int []elements) {
		for(int i=0;i<elements.length/2;i++) {
			int temp=elements[i];
			elements[i]=elements[elements.length-1-i];
			elements[elements.length-1-i]=temp;
		}
	}
}
