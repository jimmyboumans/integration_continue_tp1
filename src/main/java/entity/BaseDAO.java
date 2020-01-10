package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
	private String urlDataBase = "remotemysql.com:3306";
	private String dataBaseName = "jRudLYII0z";
	private String userName = "jRudLYII0z";
	private String password = "RMb2vHe049";
	
//	public Connection getConnection() throws SQLException {
//		try {
//			return DriverManager.getConnection(urlDataBase + "/" + dataBaseName, userName, password);
//		} catch (SQLException ex) { 
//			ex.printStackTrace();
//			throw ex;
//		}
//	} 
}
