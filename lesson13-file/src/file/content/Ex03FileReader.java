package file.content;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import bean.Customer;
import utils.FileUtils;

public class Ex03FileReader {
	public static void main(String[] args) throws IOException {
		File file = FileUtils.createNewFile("data" + File.separator + "content.txt");

		System.out.println("****************************");

		List<String> lines = FileUtils.readFile(file);
		
		List<Customer> customers = lines.subList(2, lines.size()).stream()
				.map(Customer::new)
				.filter(customer -> "Nam Cao".equals(customer.getAddress()))
				.collect(Collectors.toList());
		customers.forEach(System.out::println);
		
		System.out.println("****************************");
		
		System.out.println("Finnish!!!");
	}
}
