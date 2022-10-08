package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Datamodel {
	public static File createFile(String pathname)
	{
		File file = new File(pathname);

		try {
			if(!file.exists())
			{
				file.createNewFile();
			}
					} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}
	
	public static File createForder(String pathname)
	{
		File forder = new File(pathname);
		if(!forder.exists())
		{
			forder.mkdirs();
		}
		return forder;
	}
	
	public static List<String> readFile(File file) {
		List<String> result = new ArrayList<String>();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				result.add(line);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}

