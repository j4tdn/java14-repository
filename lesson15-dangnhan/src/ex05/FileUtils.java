package ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FileUtils {

private FileUtils() {
		
	}
	
	public static File createNewFile(String pathName) {
		File file = new File(pathName);
		if (!file.exists()) {
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println(file.getName() + "Is file created..." + (isSuccess ? "successful" : "fail"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file;
	}
}
