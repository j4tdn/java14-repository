package Ex03;

import java.util.Scanner;

public class Symmetrical {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n : ");
		n = sc. nextInt();
		if (Symmetrical(n))
		{
			System.out.println(n + " là số đối xứng");
		}
		else
		{
			System.out.println(n + " không phải là số đối xứng");
		}
	}
	public static int Reverse(int Input)
	{
		int a = 0, b;
		while (Input != 0)
		{
			b = Input % 10;
			a = (a * 10) + b;
			Input = Input / 10;
		}
		return a;
	}

	public static boolean Symmetrical(int Input)
	{
		if (Input == Reverse(Input))
			return true;
		else
			return false;
	}
}
