package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex05CompileException {
	
	public static void main(String[] args) {
		try {
			createFile("readme.md");
			System.out.println("Tạo file thành công !");
		} catch (FileNotFoundException e) {
            System.out.println("Fail 01");
			e.printStackTrace();
		} catch (IOException e) {
            System.out.println("Fail 02");
			e.printStackTrace();
		} 
		System.out.println("Kết thúc");
	}

	private static boolean createFile(String path) throws FileNotFoundException, IOException  {
		if (path == null || path.isEmpty()) {
			throw new FileNotFoundException(path + " is existed !");
		}
		return new File(path).createNewFile(); // IOException
	}
}
