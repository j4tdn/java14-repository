package ex02;

public class App {
	public static void main(String[] args) {
		double sum = factorial(4) + factorial(7) + factorial(12) + factorial(18);
		System.out.println("Tổng của các giai thừa 4! + 7! + 12! + 18! là: " + sum);
	}
	public static double factorial(double n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
