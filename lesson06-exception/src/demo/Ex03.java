package demo;


/*
 * Vượt quá kích thước của mảng
 */
public class Ex03 {
	public static void main(String[] args) {
		String[] elements = {"X123","ksda2","sads1"};
		printf(elements);
	}
	
	private static void printf(String[] elements) {
		for(int i = 1 ; i < elements.length ; i++) {
			System.out.println(elements[i]);
		}
		
	}
}
