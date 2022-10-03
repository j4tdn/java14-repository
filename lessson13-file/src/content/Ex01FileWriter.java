package content;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import bean.Customer;
import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriter {

	private static String pathName = String.join(File.separator, "template", "data.txt");

	public static void main(String[] args) {
		File file = FileUtils.createNewFile(pathName);

		List<String> lines = DataModel.getCustomers().stream()
				.map(Customer::toLine)
				.collect(Collectors.toList());
		
		lines.add(0,"Customer information");
		lines.add(1,"===================");
		FileUtils.writeFile(file, DataModel.getCustomers());
	}

}
