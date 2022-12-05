package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import utils.SqlUtils;

public class JdbcItemGroupDAO implements ItemGroupDAO {

	private final Connection conn;
	// wrapper wrap sql --> run sql in dbms
	private Statement st; // full sql without parameters
	private PreparedStatement pst; // passing parameters into sql
	private ResultSet rs; // temporary table after execute query

	public JdbcItemGroupDAO() {
		conn = DbConnection.getConnection();
	}

	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		// B1: Write down a native query --> database(true)
		String sql = "SELECT * FROM LoaiHang";
		try {
			st = conn.createStatement();
			// B2: SELECT --> executeQuery
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ItemGroup ig = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	@Override
	public ItemGroup getItemById(int id) {
		ItemGroup result = null;
		String sql = "SELECT * FROM LoaiHang WHERE MaLH =" + id;
		try {

			st = conn.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				result = new ItemGroup(rs.getInt("MaLH"), rs.getString("TenLH"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}

	@Override
	public void save(ItemGroup itemGroup) {
		String sql = "INSERT INTO LoaiHang(MaLH, TenLH)\n" 
	               + "VALUES(?, ?)";
		try {

			pst = conn.prepareStatement(sql);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());
			pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}

}
