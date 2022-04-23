package demo;

import exception.ZeroException;

public class Ex06 {
	public static void main(String[] args) {
		int a = 6;
		int b = 0;
		int result = 0;
		try {
			result = divide(a, b);
			System.out.println("result: " + result);
		} catch (ZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * 1. Arithmetic makes developers confuse 2. Arithmetic is runtime exception -->
	 * not mandatory to handle exception
	 * => XyzException is compile, specify
	 */
	private static int divide(int a, int b) throws ZeroException {
		if (b == 0) {
			throw new ZeroException("Mẫu số phải khác 0");
		}
		return a / b;
	}
}
