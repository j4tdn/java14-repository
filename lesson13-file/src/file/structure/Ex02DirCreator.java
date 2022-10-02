package file.structure;

import java.io.File;

public class Ex02DirCreator {
	public static void main(String[] args) {
		File dir = new File("structure1\\hihi.txt");
		if(!dir.exists()) {
			boolean isCreated = dir.mkdirs();
			System.out.println("is Created: " + isCreated);
		}else {
			System.out.println("Dir " + dir.getName() + " is existed !!!");
		}
		System.out.println("Finnish!!!");
	}
	
}
