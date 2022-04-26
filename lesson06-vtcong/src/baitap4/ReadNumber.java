package baitap4;

import java.util.Scanner;

public class ReadNumber {

	enum StringNumber {
		Không, Một, Hai, Ba, Bốn, Năm, Sáu, Bảy, Tám, Chín
	}

	enum StringUnit {
		Linh, Mười, Mươi, Trăm
	}

	private static Scanner input = new Scanner(System.in);
	private static String pattern = "\\d{1,3}";

	public static void main(String[] args) {
		String result = null;
		System.out.print("Enter Number: ");
		String stringNumber = null;
		do {
			stringNumber = input.nextLine();
			if (stringNumber.matches(pattern)) {
				break;
			}
			System.out.print("Enter Number again: ");

		} while (true);
		int length = stringNumber.length();
		int unit = 0;
		int dozens = 0;
		int hundred = 0;
		switch (length) {
		case 1:
			unit = Integer.parseInt(stringNumber);
			result = readNumber(unit);
			break;
		case 2:
			//chia nho 1 chuoi 2 so ra thanh 2 so .
			dozens = Integer.parseInt(stringNumber.substring(0, length - 1));
			unit = Integer.parseInt(stringNumber.substring(length - 1, length));
			result = readNumber(dozens, unit);
			break;
		case 3:
			// chia nho 1 chuoi 3 chu so thang 3 so
			hundred = Integer.parseInt(stringNumber.substring(0, length - 2));
			dozens = Integer.parseInt(stringNumber.substring(length - 2, length - 1));
			unit = Integer.parseInt(stringNumber.substring(length - 1, length));
			result = readNumber(hundred, dozens, unit);
			break;
		}

		System.out.println("result: " + result);
	}

	private static String readNumber(int unit) {
		StringNumber[] stringNumbers = StringNumber.values();
		return stringNumbers[unit].toString();
	}

	private static String readNumber(int dozens, int unit) {
		StringUnit[] stringUnits = StringUnit.values();
		if (dozens == 0) {
			return readNumber(unit);
		}
		if (dozens == 1) {
			if (unit == 0) {
				return stringUnits[1].toString();
			} else
				return stringUnits[1].toString() + " " + readNumber(unit);
		}
		return readNumber(dozens) + " " + stringUnits[2].toString() + " " + readNumber(unit);

	}

	private static String readNumber(int hundred, int dozens, int unit) {
		StringUnit[] stringUnits = StringUnit.values();
		if (hundred == 0) {
			if (dozens == 0) {
				return readNumber(unit);
			} else
				return readNumber(dozens, unit);
		}
		return readNumber(hundred) + " " + stringUnits[3] + " " + readNumber(dozens, unit);
	}
	
	
	
	

}
