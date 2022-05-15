package demo;

import exception.ZeroException;

public class Ex06 {
	public static void main(String[] args) {
		int a = 6;
		int b = 0;
		
		try {
			int result = divide(a, b);;
		} catch (ZeroException e) {
			e.printStackTrace();
		}
		System.out.println("Finished");
	}
	/**
	 * 1. Arithmetic makes developers confuse
	 * 2. Arithmetic is runtime exception ---> not mandatory to handle exception
	 * 
	 * ==> XyzException is compile, specify
	 */
	private static int divide(int a,int b)throws ZeroException {
		if(b == 0) {
			throw new ZeroException("Mau so phai khac 0");
		}
		return a/b;
	}
}	
