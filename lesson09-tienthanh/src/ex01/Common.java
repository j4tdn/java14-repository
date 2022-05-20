package ex01;

public class Common {
	public static void printUnion(int[] A, int[] B, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (A[i] == B[j])
					System.out.print(A[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] A = { 2, 8, 9, 1, 6 };
		int[] B = { 2, 1, 1, 8, 9 };
		printUnion(A, B, A.length, B.length);
	}
}