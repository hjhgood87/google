package google.pc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import google.pc.model.MemCommand;

public class MemberDAO {
	public void join(MemCommand memberCommand) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Context context = new Context();
		String sql = null;
		try {
			connection = context.basicDataSource.getConnection();
			sql = "insert into MEMBER ";
			sql += " values (member_seq.nextval,1,?,?,?,?,sysdate,sysdate,?,sysdate) ";
			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, memberCommand.getId());
			preparedStatement.setString(2, memberCommand.getPasswd());
			preparedStatement.setString(3, memberCommand.getName());
			preparedStatement.setString(4, memberCommand.getCel());
			// preparedStatement.setString(5, memberCommand.getFree_date());
			// preparedStatement.setString(6, memberCommand.getPay_date());
			preparedStatement.setInt(5, memberCommand.getPoint());
			int count = preparedStatement.executeUpdate();
			if (count > 0) {
				System.out.println("회원가입이 완료되었습니다.!!!!!!!");
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
