package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
	private String urlDataBase = "jdbc:mysql:remotemysql.com:3306/jRudLYII0z";
	private String dataBaseName = "jRudLYII0z";
	private String userName = "jRudLYII0z";
	private String password = "RMb2vHe049";
	public String getUrlDataBase() {
		return urlDataBase;
	}
	public void setUrlDataBase(String urlDataBase) {
		this.urlDataBase = urlDataBase;
	}
	public String getDataBaseName() {
		return dataBaseName;
	}
	public void setDataBaseName(String dataBaseName) {
		this.dataBaseName = dataBaseName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
