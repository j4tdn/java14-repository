package file.structure;

import java.io.File;
import java.util.Arrays;

public class Ex05FileFilter {
	public static void main(String[] args) {
		File dir = new File("template/upload");
		
		// list all available files in upload folder
		File[] files = dir.listFiles();
		Arrays.stream(files).forEach(System.out::println);

		System.out.println("=================");
		
		File[]  pngFile = dir.listFiles(file -> file.isFile() && file.getName().endsWith(".png"));
		Arrays.stream(pngFile).forEach(System.out::println);

	}
}
