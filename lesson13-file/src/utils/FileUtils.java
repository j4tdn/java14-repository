package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import file.content.AbstractFile;

public class FileUtils {

	private FileUtils() {

	}

	public static File createNewFile(String pathName) {
		File file = new File(pathName);
		File parent = file.getParentFile();
		if (!parent.exists()) {
			parent.mkdirs();
		}
		if (!file.exists()) {
			try {
				boolean isSuccess = file.createNewFile();
				System.out.println("File " + file.getName() + " is created " + (isSuccess ? "successful" : "fail"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File " + file.getName() + " is already existed ");
		}
		return file;
	}

	public static File createNewDirectory(String pathNane) {
		File dir = new File(pathNane);
		if (!dir.exists()) {
			boolean isSuccess = dir.mkdirs();
			System.out.println("Folder " + dir.getName() + "is created " + (isSuccess ? "successful" : "fail"));
		} else {
			System.out.println("Folder " + dir.getName() + "is already existed");
		}
		return dir;
	}

	public static Path createNewDirectoryAsPath(String pathNane) {
		return createNewDirectory(pathNane).toPath();
	}

	public static Path rename(Path fileNameAsPath) {
		String fileName = fileNameAsPath.toString();
		String extension = fileName.substring(fileName.lastIndexOf("."));
		return Paths.get("Rename file " + System.currentTimeMillis() + new Random().nextInt(100) + extension);
	}

	public static void close(AutoCloseable... closeableItems) {
		try {
			for (AutoCloseable closeableItem : closeableItems) {
				closeableItem.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static <DataRow extends AbstractFile> void writeFile(String title, List<DataRow> dataRows, File file) {
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			// write-in data
			bw.write(title + "\n");
			bw.write("======================\n");
			for (DataRow dataRow : dataRows) {
				bw.write(dataRow.toLine());
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			FileUtils.close(bw, fw);

		}
	}

	public static List<String> readFile(File file) {
		List<String> lines = new ArrayList<>();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(fr, br);
		}
		return lines;
	}

	public static void writeObject(File file, Object object) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(object);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(oos, fos);
		}
	}

	public static Object readObject(File file) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object object = null;
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);

			object = ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(ois, fis);
		}
		return object;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> List<T> safeReadObject(File file) {
		return (List<T>) readObject(file);
	}
}
