package google.pc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.CountDownLatch;

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

	public void memberList() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String sql = null;
		Context context = new Context();

		try {
			connection = context.basicDataSource.getConnection();

			sql = "select *";
			sql += " from MEMBER m ";

			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int num = resultSet.getInt("idx");
				String id = resultSet.getString("id");
				String name = resultSet.getString("name");
				System.out.print("번호: " + num);
				System.out.print(", 아이디= " + id);
				System.out.print(", 이름= " + name);
				System.out.println();

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public MemCommand memberLogin(String id, String passwd) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String sql = null;
		Context context = new Context();
		MemCommand memCommand = null;
		int count=0;

		try {
			connection = context.basicDataSource.getConnection();

			sql = "select *";
			sql += " from MEMBER m  where id=? and passwd= ?";

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, passwd);
			resultSet = preparedStatement.executeQuery();
			count = resultSet.getRow();
			while (resultSet.next()) {
				String db_id = resultSet.getString("id");
				String db_passwd = resultSet.getString("passwd");
				String db_name = resultSet.getString("name");
				memCommand = new MemCommand(db_id, db_passwd, db_name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return memCommand;
	}
}
