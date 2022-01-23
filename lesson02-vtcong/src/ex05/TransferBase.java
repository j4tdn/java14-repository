package ex05;

import java.util.Arrays;
import java.util.Scanner;

public class TransferBase {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter decimal number: ");
		int numberDecimal = ip.nextInt();
		if(numberDecimal==0) {
			System.out.println(0);
		}
		else {
			int[] bits = transferBit(numberDecimal);
			revest(bits);
			showArray(bits);
		}
		
	}

	// chuyen doi co so tu 10->2
	private static int[] transferBit(int decimal) {
		int[] bit = new int[decimal];
		int count = 0;
		while (decimal != 0) {
			bit[count] += decimal % 2;
			decimal /= 2;
			count++;
		}
		return Arrays.copyOfRange(bit, 0, count);
	}

	// dao thu tu mang
	private static void revest(int[] bits) {
		for (int i = 0; i < bits.length / 2; i++) {
			int temp = bits[i];
			bits[i] = bits[bits.length - i - 1];
			bits[bits.length - i - 1] = temp;
		}
	}

	// hien thi cac phan tu
	private static void showArray(int[] bits) {
		for (int bit : bits) {
			System.out.print(bit + " ");
		}
	}

}
