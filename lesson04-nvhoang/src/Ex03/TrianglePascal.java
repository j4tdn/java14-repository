package Ex03;

import java.util.Scanner;

public class TrianglePascal {
public static void main(String[] args) {
	int n;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhập chiều cao của tam giác: ");
	n = scanner.nextInt();
	for(int i =0; i<=n ; i ++) {
		for ( int k = 0; k <= i; k++) {
			System.out.print((factorial(i)/(factorial(k)*factorial(i-k)))+ " ");
		}
		System.out.println();
	}
}
public static long factorial(int n) {
	long factorial = 1;
	if (n == 0 || n == 1) 
		{
		return 1;
		}else {
			for (int i =2; i <= n; i++) {
				factorial = factorial * i;
			}
		}
	return factorial;
}
}
