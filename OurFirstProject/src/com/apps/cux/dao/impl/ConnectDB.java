package com.apps.cux.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	private Connection conn;

	public Connection getConnection() {// 先建立连接
		String l_url = "jdbc:mysql://localhost:3306/my_test?useUnicode=true&characterEncoding=utf8";
		String l_user_name = "root";
		String l_passward = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(l_url, l_user_name, l_passward);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
