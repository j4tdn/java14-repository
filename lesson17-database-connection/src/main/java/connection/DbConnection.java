package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	private static Connection connection = null;

	public static Connection getConnection() {
		if(connection == null) {
			
			Properties properties = DbProvider.getProps();
			// connect database
			try {
				Class.forName(properties.getProperty(DbContants.DRIVER));
				connection = DriverManager.getConnection(
						properties.getProperty(DbContants.URL),
						properties.getProperty(DbContants.USER),
						properties.getProperty(DbContants.PASS)
						);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			} 
		}
		return connection;
	}
}
