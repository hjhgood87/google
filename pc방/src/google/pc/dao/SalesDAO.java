package google.pc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import google.pc.model.SalesCommand;

public class SalesDAO {
	public void sales (SalesCommand totalSales) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Context context = new Context();
		String sql = null;
		try {
			connection = context.basicDataSource.getConnection();
			sql = "insert into TOTAL_SALE ";
			sql += " values (sale_seq.nextval,?,?,sysdate) ";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, totalSales.getGubun());
			preparedStatement.setInt(2, totalSales.getIncom());
			int count = preparedStatement.executeUpdate();
			if (count > 0) {
				System.out.println("매출기록");
				connection.commit();
			} else {
				connection.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
