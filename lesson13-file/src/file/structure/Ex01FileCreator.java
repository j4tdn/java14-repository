package file.structure;

import java.io.File;
import java.io.IOException;

public class Ex01FileCreator {
	public static void main(String[] args) {
		File file = new File("structure/agenda.txt");
		File parent = file.getParentFile();
		if(!parent.exists()) {
			parent.mkdir();
		}
		
		if(!file.exists()) {
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println("Is file created ? " + isSuccess);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Finnish!!!!");
	}
}
