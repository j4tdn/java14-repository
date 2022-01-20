package Ex03;

public class App {
	public static void main(String[] args) {
		System.out.println(isSymmetical(12221));
	}

	public static boolean isSymmetical(long a) {
		long check=a;
		long gt = 0;
		while (a != 0) {
			long temp=a % 10;
			gt = gt * 10 + temp;
			a /= 10;
		}
		return gt == check;

	}
}
