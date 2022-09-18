package file.structure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import utils.FileUtils;

public class Ex03FileUpload {
	public static void main(String[] args) throws IOException {
		// B1: Select from file
		
		File sourceFile = new File("template/images/hihi.jpg");

		// B2: Upload Folder
		File targetFile = FileUtils.createNewDir("template/upload");
		
		Path source = sourceFile.toPath();
		Path newdir = targetFile.toPath();
		 
		Path targetPath = Files.copy(source, newdir.resolve(source.getFileName()));
		
		System.out.println(targetPath.toString());
	}
}
