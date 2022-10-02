package file.structure;

import java.io.File;

public class Ex02DirectoryCreator {
	public static void main(String[] args) {
		File dir = new File("template\\springio");
		if(!dir.exists()) { 
			dir.mkdirs();
		}
		System.out.println("Finished ...");
	}
}
