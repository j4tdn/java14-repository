package demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex08 {
	// write data info file
	// write 1000 lines into data.txt file
	public static void main(String[] args) {
		File file = new File("data.txt");
		
		if(!file.exists()) {
			System.out.println("file is not existed");
			return;
		}
		
		try {
			// Connect to file
			FileWriter fw = new FileWriter(file);
			
			// write file
			for(int i=1 ; i <= 1000; i++) {
				fw.write("Line: " + i + "\n");
			}
			
			// save and close file
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Finished ....");
	}
}
