package file.structure;

import java.io.File;
import java.io.IOException;

public class Ex01FileCreator {
	public static void main(String[] args) {
		File file = new File("structure/agenda.txt");
		
		File parent = file.getParentFile();
		if(!parent.exists()) {
			parent.mkdirs();
		}
		if (!file.exists()) {
			try {
				boolean isSuccess = file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		file.renameTo(new File("structure/agenda.bat"));
		System.out.println("Finished ..." );
	}
}
