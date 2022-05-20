package ex03;

public class Sorted {
	public static void main(String[] args) {
		int[] a = { 8, 5, 9, 20 };		
		sort(a, a.length);
		prinf(a, a.length);
	}

	public static void prinf(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	public static int levelNumber(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer++;
			}
		}
		return answer;
	}

	public static void sort(int a[], int n) {
		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (levelNumber(a[i]) > levelNumber(a[j])) {
					temp =a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

}
