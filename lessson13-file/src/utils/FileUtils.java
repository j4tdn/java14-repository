package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;

import bean.FileTransfer;

public class FileUtils {
	private FileUtils() {

	}
	
	public static Path createNewFileAsPath(String path) {
		return createNewFile(path).toPath();
	}
	public static File createNewFile(String pathName) {
	File file = new File(pathName);
		
		File parent = file.getParentFile();
		if(!parent.exists()) {
			parent.mkdirs();
		}
		if (!file.exists()) {
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println(file.getName() +"is created "+ (isSuccess?"succesful":"fail")) ;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return file;
	}
	public static File createNewDir(String pathName) {
		File dir = new File(pathName);
		if(!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println("Folder "+dir.getName() +"is created "+ (isSuccess?"succesful":"fail")) ;
		}else {
			System.out.println("Folder "+dir.getName()+" is already existed");
		}
		return dir;
	}
	
	public static void close(AutoCloseable ...autoCloseables) {
		for(AutoCloseable a : autoCloseables) {
			try {
				a.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	
	public static <T extends FileTransfer> void  writeFile(File file, List<T> lines) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			for (T line : lines) {
				bw.write(line.toLine());
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(bw, fw);
		}
		System.out.println("Write file completely");
	}
	
	public static <T extends FileTransfer> void  writeFile(File file, List<T> lines, Function<T, String> function) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			for (T line : lines) {
				bw.write(function.apply(line));
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(bw, fw);
		}
		System.out.println("Write file completely");
	}
	
	public static List<String> readFile(Path path){
		List<String> lines = null;
		try {
			lines = Files.readAllLines(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}
}
