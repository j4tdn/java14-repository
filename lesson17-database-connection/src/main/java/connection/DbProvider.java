package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DbProvider {
	
	private DbProvider() {
		
	}
	
	public static Properties getProps() {
		Properties properties = new Properties();
		try {
			File file = new File(DbContants.APPLICATION_PROPERTIES);
			properties.load(new FileInputStream(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
}
