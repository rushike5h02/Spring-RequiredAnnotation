package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Required;

public class Drivers {

	private String driver;
	private String url;
	private String username;
	private String password;

	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}

	@Required
	public void setUrl(String url) {
		this.url = url;
	}
	@Required
	public void setUsername(String username) {
		this.username = username;
	}
	@Required
	public void setPassword(String password) {
		this.password = password;
	}

	public void printCon() throws ClassNotFoundException, SQLException {
		
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println(con);
	}

}
