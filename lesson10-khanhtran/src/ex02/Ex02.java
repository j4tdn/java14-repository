package ex02;

public class Ex02 {
	public static void main(String[] args) {
		int[][] test = {{0,1,2},{0,2,3}};
		print(test);
	}
	private static void print(int[][] elements) {
		for(int i=0; i<elements.length; i++) {
			for(int j=0; j<elements[i].length; j++) {
				System.out.print(elements[i][j] + " ");
			}
			System.out.println();
		}
	}
}
