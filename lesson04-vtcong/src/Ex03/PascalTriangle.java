package Ex03;

public class PascalTriangle {
	public static void main(String[] args) {
		pascalTriangle(4);

	}

	public static void pascalTriangle(int n) {
		for (int i = 1; i <= n + 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(pascal(j, i) + " ");
			}
			System.out.println();
		}

	}

	public static int pascal(int k, int n) {
		if (k == 0 || k == n) {
			return 1;
		} else {
			return pascal(k, n - 1) + pascal(k - 1, n - 1);
		}
	}

}
