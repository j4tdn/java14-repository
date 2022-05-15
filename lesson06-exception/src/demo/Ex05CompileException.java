package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex05CompileException {
	public static void main(String[] args) {
		try {
			createFile("");
			System.out.println("Tao file thanh cong ! ");
		} catch (IOException e) {
			System.out.println("Fail 01");
			e.printStackTrace();
		}
		System.out.println("Ket thuc");
	}
	
	private static boolean createFile(String path) throws IOException  {
		if(path==null || path.isEmpty()) {
			throw new FileNotFoundException(path + "is not existed !");
		}
		return new File(path).createNewFile();
	}
}
