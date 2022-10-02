package file.structure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import utils.FileUtils;

public class Ex03FileUpload {
	public static void main(String[] args) throws IOException {
		// B1: Select from file
		File sourceFile = new File("template/images/background-night.png");
		// B2: Upload Folder
		File targetFile = FileUtils.createNewDirectory("template/upload");
		
		Path source = sourceFile.toPath();
		Path uploadDir = targetFile.toPath();
		Path targetPath = Files.copy(source, uploadDir.resolve(source.getFileName()));
		System.out.println(targetPath.toString());
	}
}
