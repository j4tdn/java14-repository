package file.content;

import java.io.File;
import java.io.IOException;

import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriter {
	public static void main(String[] args) throws IOException {
		File file = FileUtils.createNewFile("data" + File.separator + "content.txt");
		FileUtils.writeFile("Thông tin khách hàng 13.08 ", DataModel.getCustomers(),file);
		
		System.out.println("Finnish!!!");
	}
}
