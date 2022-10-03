package content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

import bean.Customer;
import model.DataModel;
import utils.FileUtils;

public class Ex02FileWriterWithFilesNio {
	private static String pathName = String.join(File.separator, "template", "data-a.txt");

	public static void main(String[] args) {
		Path path = FileUtils.createNewFileAsPath(pathName);

		List<String> lines = DataModel.getCustomers().stream()
				.map(Customer::toLine)
				.collect(Collectors.toList());

		lines.add(0, "Customer information");
		lines.add(1, "===================");
		
		try {
			Files.write(path, lines);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finished");
	}
}
