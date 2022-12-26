package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import persistence.ItemGroupDto;
import persistence.transformer.ItemGroupTransformer;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao {

	private final Connection conn;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;

	private static final String GET_ITEM_GROUPS = ""
			+ "WITH ThongTinMatHang AS"
			+ "(SELECT mh.MaMH,\n"
			+ "		mh.TenMH,\n"
			+ "        SUM(ctmh.SoLuong) SoLuong,\n"
			+ "        lh.MaLH,\n"
			+ "        lh.TenLH\n"
			+ "   FROM LoaiHang lh\n"
			+ "   JOIN MatHang mh\n"
			+ "     ON lh.MaLH = mh.MaLH\n"
			+ "   JOIN ChiTietMatHang ctmh\n"
			+ "     ON mh.MaMH = ctmh.MaMH\n"
			+ "GROUP BY mh.MaMH)\n"
			+ "SELECT ttmh.MaLH,\n"
			+ "	      ttmh.TenLH,\n"
			+ "       SUM(ttmh.SoLuong) SoLuong,\n"
			+ "       GROUP_CONCAT(concat(ttmh.MaMH, \"-\", ttmh.TenMH, \"-\", ttmh.SoLuong)) DanhSachMatHang\n"
			+ "  FROM ThongTinMatHang ttmh\n"
			+ "  GROUP BY ttmh.MaLH;";
	
	public JdbcItemGroupDao() {
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
	public List<ItemGroupDto> getItemGroups() {
		List<ItemGroupDto> result = new ArrayList<>();
		try {
			st = conn.createStatement();
			rs = st.executeQuery(GET_ITEM_GROUPS);
			while (rs.next()) {
				result.add(ItemGroupTransformer.transfrom(rs));
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
		} catch (SQLException e) {
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

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}

	
	@Override
	public void save(List<ItemGroup> itemGroups) {
		// update
		String sql = "INSERT INTO LoaiHang(MaLH, TenLH)\n" 
	               + "VALUES(?, ?)";
		int batchCount = 0;
		
		try {
			pst = conn.prepareStatement(sql);
			for(ItemGroup itemGroup: itemGroups) {
				// update
				pst.setInt(1, itemGroup.getId());
				pst.setString(2, itemGroup.getName());
				pst.addBatch();
				if(++batchCount % 100 == 0) {
					pst.executeBatch();
				}
			}
			int[] affectedRows =  pst.executeBatch();
			System.out.println(">>> affectedRows >>> " + Arrays.toString(affectedRows));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public void update(ItemGroup itemGroup) {
		String sql = ""
				+ "UPDATE LoaiHang\n"
				+ "   SET TenLH = ?\n"
				+ " WHERE MaLH = ?";
		try {

			pst = conn.prepareStatement(sql);
			
			pst.setString(1, itemGroup.getName());
			pst.setInt(2, itemGroup.getId());
			
			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}

	@Override
	public List<ItemGroup> search(String name) {
		List<ItemGroup> results = new ArrayList<>();
		//String sql = "SELECT * FROM LoaiHang WHERE TenLH = '" + name + "'"; // injection
		String sql = "SELECT * FROM LoaiHang WHERE TenLH = ?";
		try {

			//st = conn.createStatement();
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			//rs = st.executeQuery(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				ItemGroup itemGroup = new ItemGroup(
						rs.getInt("MaLH"),
						rs.getString("TenLH")
						);
				results.add(itemGroup);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return results;
	}
	
}
