package package05;

import java.io.File;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		File file = new File("Student.txt");
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
