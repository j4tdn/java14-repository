package content;

import java.io.File;
import java.nio.file.Path;

import utils.FileUtils;

public class Ex03FileReader {
	private static String pathName = String.join(File.separator, "template", "data.txt");

	public static void main(String[] args) {
		Path path = FileUtils.createNewFileAsPath(pathName);
		FileUtils.readFile(path).forEach(System.out::println);
	}
}
