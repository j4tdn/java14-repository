package demo;

import java.io.File;
import java.io.IOException;

public class Ex05 {
	private static final String path = "data.txt";
	public static void main(String[] args) {
		try {
			createFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("GO ON");
	}
	
	private static boolean createFile() throws Exception {
		File file = new File(path);
		return file.createNewFile();		
	}
}
