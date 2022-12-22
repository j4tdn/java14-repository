package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DbConnection;
import persistence.Employee;
import persistence.Title;
import utils.SqlUtils;

public class JdbcEmployeeDao implements EmployeeDao{

	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	public JdbcEmployeeDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public void save(Employee employee) {
		final String sql = ""
				+ "INSERT INTO NhanVien(MaNV, TenNV, Email, SDT, DiaChi, MatKhau, MaCV)\n"
				+ "VALUES(?, ?, ?, ?, ?, ?, ?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, employee.getId());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setString(3, employee.getEmail());
			preparedStatement.setString(4, employee.getPhone());
			preparedStatement.setString(5, employee.getAddress());
			preparedStatement.setString(6, SqlUtils.md5(employee.getPassword()));
			preparedStatement.setInt(7, employee.getTitle().getId());
			preparedStatement.executeUpdate();
			
			
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		System.out.println("Account " + employee.getEmail() + " is created successfully ...");
	}
	
	@Override
	public Employee login(String email, String password) {
		Employee employee = null;
		final String sql = ""
				+ "SELECT MaNV " + Employee.PROP_ID + ",\n"
				+ "		  TenNV " + Employee.PROP_NAME + ",\n"
				+ "		  Email " + Employee.PROP_EMAIL + ",\n"
				+ "		  SDT " + Employee.PROP_PHONE + ",\n"
				+ "		  DiaChi " + Employee.PROP_ADDRESS + ",\n"
				+ "		  MaCV " + Employee.PROP_TITLE_ID  + "\n"
				+ "  FROM NhanVien\n"
				+ " WHERE Email = ?\n"
				+ "   AND MatKhau = ?";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, SqlUtils.md5(password));
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				employee = new Employee(
						resultSet.getInt(Employee.PROP_ID),
						resultSet.getString(Employee.PROP_NAME),
						resultSet.getString(Employee.PROP_EMAIL),
						resultSet.getString(Employee.PROP_PHONE),
						resultSet.getString(Employee.PROP_ADDRESS),
						new Title(resultSet.getInt(Employee.PROP_TITLE_ID))
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}
	
}
