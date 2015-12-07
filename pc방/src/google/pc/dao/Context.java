package google.pc.dao;

import org.apache.commons.dbcp2.BasicDataSource;

public class Context {
	public BasicDataSource basicDataSource;

	public Context() {
		basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		basicDataSource.setUrl("jdbc:oracle:thin:@211.183.8.55:1521:orcl");
		basicDataSource.setUsername("hjh");
		basicDataSource.setPassword("124578");
		basicDataSource.setInitialSize(4);
		basicDataSource.setMaxIdle(100);
		basicDataSource.setMinIdle(5);
	}
}
