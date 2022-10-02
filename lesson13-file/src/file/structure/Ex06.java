package file.structure;

import java.io.File;
import java.io.IOException;

public class Ex06 {
	private static String pathname = "data.txt";
	public static void main(String[] args) {
		File file = new File(pathname);
		if(!file.exists()) {
			try {
				boolean isCreated = file.createNewFile();
				System.out.println("Created file " + (isCreated ? "success" : " fail" ));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println(file.getName() + " is existed!!! ");
		}
	}
}
