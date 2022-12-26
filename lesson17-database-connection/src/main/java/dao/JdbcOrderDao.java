package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import connection.DbConnection;
import utils.DateUtils;

public class JdbcOrderDao implements OrderDao{

	private final Connection connection;
	
	private PreparedStatement preparedStatement;
	
	private static final String UPDATE_DELIVERY_FREE = ""
			+ "UPDATE DonHang\n"
			+ "   SET PhiVanChuyen = ?\n"
			+ " WHERE DATE(ThoiGianDatHang) = ?;";
	
	// java.sql.Date, Time, Timestamp
	// ?2 --> DATE || TIME || DATETIME(TIMESTAMP)
	// prepareStatement.setDate, setTime, setTimeStamp
	// tương thích, tự động convert vào các kiểu dữ liệu trong cơ sở dữ liệu
	
	public JdbcOrderDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	// java.util.Date, Calendar, LocalDate
	public void update(LocalDate deliveryDate, double deliveryFree) {
		try {
			preparedStatement = connection.prepareStatement(UPDATE_DELIVERY_FREE);
			preparedStatement.setDouble(1, deliveryFree);
			preparedStatement.setDate(2, DateUtils.toSqlDate(deliveryDate)); // java.sql.Date
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
