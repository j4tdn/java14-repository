package file.structure;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static utils.FileUtils.*;

public class Ex04FileUploadWithPath {
	public static void main(String[] args) throws IOException {
		// B1: Select from file
		Path source = Paths.get("template/images/hihi.jpg");

		// B2: Upload Folder
		Path uploadDir = createNewDirAsPath("template/upload");

		Path targetPath = Files.copy(source, uploadDir.resolve(rename(source.getFileName())));

		System.out.println(targetPath.toString());
	}
}
