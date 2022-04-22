package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex05CompileException {
	private static final String path="";
	public static void main(String[] args) {
		try {
			createFile(path);
			System.out.println("thanh cong");
		} catch ( IOException e) {
			System.out.println("fail 1");
			e.printStackTrace();
		}
		
		
		
	}
	private static boolean createFile(String path) throws IOException {
		if(path == null || path.isEmpty()) {
			throw new FileNotFoundException(path +" is not existed");
		}
		return new File(path).createNewFile();
	}

}
