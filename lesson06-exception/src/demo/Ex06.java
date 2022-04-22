package demo;

import exception.ZeroException;

public class Ex06 {
	public static void main(String[] args) {
		int a = 6;
		int b =0;
		
		int rs;
		try {
			rs = divide(a,b);
			System.out.println("rs: "+rs);
		} catch (ZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * 
	 * 1. Arithmetic makes developers confuse
	 * 2. Arithmetic is complied exception  -> not mandatory to handle exception
	 * 
	 * => XyzException í compile, specify:cụ thể
	 * @return
	 * @throws ZeroException 
	 */
	private static int divide(int a, int b) throws ZeroException {
		if(b==0) {
			throw new ZeroException("Mẫu số phải khác 0");
		}
		return a/b;
	}

}
