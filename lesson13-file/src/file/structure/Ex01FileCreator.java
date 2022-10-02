package file.structure;

import java.io.File;
import java.io.IOException;

public class Ex01FileCreator {
	public static void main(String[] args) {
		File file = new File("structure\\agenda.txt");
		// when only the file name is left, the generated file will be located in the project folder
		File parent = file.getParentFile();
		if(!parent.exists()) {
			parent.mkdirs();
		}
		if(!file.exists()) {
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println("Is file created ? " + isSuccess);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Finished ...");
	}
}
