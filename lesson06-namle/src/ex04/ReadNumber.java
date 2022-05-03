package ex04;

import java.util.Scanner;

public class ReadNumber {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("enter the number ");
		number = Integer.parseInt(input.nextLine());
		int tram, chuc, donvi;

		tram = number / 100;
		System.out.println(tram);

		chuc = number % 100 / 10;
		System.out.println(chuc);

		donvi = number % 10;

		System.out.println(donvi);

		switch (tram) {
		case 1:
			System.out.print("Mot tram");
			break;
		case 2:
			System.out.print("Hai tram");
			break;
		case 3:
			System.out.print("Ba tram");
			break;
		case 4:
			System.out.print("Bon tram");
			break;
		case 5:
			System.out.print("Nam tram");
			break;
		case 6:
			System.out.print("Sau tram");
			break;
		case 7:
			System.out.print("Bay tram");
			break;
		case 8:
			System.out.print("Tam tram");
			break;
		case 9:
			System.out.print("Chin tram");
			break;

		}

		switch (chuc) {
		case 0:
			System.out.print(" linh ");
			break;
		case 1:
			System.out.print(" muoi ");
			break;
		case 2:
			System.out.print(" hai muoi ");
			break;
		case 3:
			System.out.print(" ba muoi ");
			break;
		case 4:
			System.out.print(" bon muoi ");
			break;
		case 5:
			System.out.print(" nam muoi ");
			break;
		case 6:
			System.out.print(" sau muoi ");
			break;
		case 7:
			System.out.print(" bay muoi ");
			break;
		case 8:
			System.out.print(" tam muoi ");
			break;
		case 9:
			System.out.print(" chin muoi ");
			break;

		}

		switch (donvi) {
		case 1:
			System.out.print("mot");
			break;
		case 2:
			System.out.print("hai");
			break;
		case 3:
			System.out.print("ba");
			break;
		case 4:
			System.out.print("bon");
			break;
		case 5:
			System.out.print("nam");
			break;
		case 6:
			System.out.print("sau");
			break;
		case 7:
			System.out.print("bay");
			break;
		case 8:
			System.out.print("tam");
			break;
		case 9:
			System.out.print("chin");
			break;

		}
	}

}
