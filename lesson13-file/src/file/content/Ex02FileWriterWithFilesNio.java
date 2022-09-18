package file.content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

import bean.Customer;
import model.DataModel;
import utils.FileUtils;

public class Ex02FileWriterWithFilesNio {
	public static void main(String[] args) throws IOException{
		File file = FileUtils.createNewFile("data" + File.separator + "content.txt");

		List<Customer> customers = DataModel.getCustomers();
		
		// JAVA function
		List<String> lines = customers.stream()
				.map(customer -> customer.toLine())
				.collect(Collectors.toList());

		
		lines.add(0,"Thông tin khách hàng 14.08");
		lines.add(1,"======================");

		Files.write(file.toPath(), lines);

		System.out.println("Finnish!!!");
	}
}
