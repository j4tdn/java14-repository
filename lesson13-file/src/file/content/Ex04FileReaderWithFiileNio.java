package file.content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

import bean.Customer;
import utils.FileUtils;

public class Ex04FileReaderWithFiileNio {
	public static void main(String[] args) throws IOException {
		File file = FileUtils.createNewFile("data" + File.separator + "content.txt");

		System.out.println("****************************");

		List<String> lines = Files.readAllLines(file.toPath());
		
		List<Customer> customers = lines.subList(2, lines.size()).stream()
				.map(Customer::new)
				.filter(customer -> "Nam Cao".equals(customer.getAddress()))
				.collect(Collectors.toList());
		customers.forEach(System.out::println);
		
		System.out.println("****************************");
		
		System.out.println("Finnish!!!");
	}
}
