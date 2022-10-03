package file.structure;

import java.io.File;

import utils.FileUtils;

public class Ex02DirCreator {
	public static void main(String[] args) {
		File dir = new File("template/springio");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		System.out.println("Finished");
		FileUtils.createNewDir("template/springio");
	}
}
