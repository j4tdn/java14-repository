package ex06;

public class FindPrime {

	public static void main(String[] args) {
		System.out.println("Number Prime 200th is : " + numberPrime_nth(200));

	}

	//kiem tra xem 1 co phai so nguyen to hay khong
	private static boolean isPrime(int number) {
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	//tim kiem so nguyen to vi tri thu n
	private static int numberPrime_nth(int n) {
		int count = 0;
		int numberPrime = 2;
		do {
			if (isPrime(numberPrime)) {
				count++;
			}
			if (count == n) {
				break;
			}
			numberPrime++;
		} while (true);
		return numberPrime;
	}

}
