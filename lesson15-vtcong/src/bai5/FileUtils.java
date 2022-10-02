package bai5;

import java.io.File;
import java.io.IOException;

public class FileUtils {
	private FileUtils() {
		
	}
	
	public static File createNewFile(String pathName) {
		File file = new File(pathName);
		if (!file.exists()) {
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println(file.getName() + "Is file created..." + (isSuccess ? "successful" : "fail"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file;
	}
}
