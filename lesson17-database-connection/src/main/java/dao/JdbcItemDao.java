package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Item;
import persistence.ItemGroup;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao{
	
	private Connection connection;
	private Statement statement;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

	public JdbcItemDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public List<Item> getAll() {
		List<Item> result = new ArrayList<>();
		String sql = ""
				+ "SELECT mh.MaMH, mh.TenMH, mh.MauSac, lh.MaLH, lh.TenLH\n"
				+ "	 FROM MatHang mh\n"
				+ "  JOIN LoaiHang lh\n"
				+ "    ON mh.MaLH = lh.MaLH";
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);	
			while(resultSet.next()) {
				ItemGroup itemGroup = new ItemGroup(
						resultSet.getInt("MaLH"),
						resultSet.getString("TenLH"));
				Item item = new Item(
						resultSet.getInt("MaMH"),
						resultSet.getString("TenMH"),
						resultSet.getString("MauSac"),
						itemGroup);
				result.add(item);
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			SqlUtils.close(resultSet, statement);
		}
		return result;
	}
	
	@Override
	public List<Item> getItems(String itemGroupName) {
		List<Item> result = new ArrayList<>();
		String sql = ""
				+ "SELECT *\n"
				+ "  FROM MatHang mh\n"
				+ "  JOIN LoaiHang lh\n"
				+ "    ON mh.MaLH = lh.MaLH\n"
				+ " WHERE lh.TenLH LIKE ?"; // --> LIKE '?'
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "%" + itemGroupName + "%");
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				ItemGroup itemGroup = new ItemGroup(
						resultSet.getInt("MaLH"),
						resultSet.getString("TenLH"));
				Item item = new Item(
						resultSet.getInt("MaMH"),
						resultSet.getString("TenMH"),
						resultSet.getString("MauSac"),
						itemGroup);
				result.add(item);
				
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			SqlUtils.close(resultSet, preparedStatement);
		}
		return result;
	}
}









