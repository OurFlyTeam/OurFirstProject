package com.apps.cux.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.apps.cux.dao.IUserDao;
import com.apps.cux.domain.User;

public class UserDaoImpl implements IUserDao {

	private Statement stmt;
	private ResultSet rs;
	private Connection conn;

	// 关闭资源
	public void CloseDB() {
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (conn != null) {
				conn.close();
				conn = null;
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Register(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isExsit(String user_name) {
		// TODO Auto-generated method stub
		boolean result = false;
		ConnectDB connDB = new ConnectDB();
		try {
			conn = connDB.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from cux_users_info where user_name =" + "'" + user_name + "'");
			if (rs.next()) {
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		CloseDB();
		return result;
	}

	@Override
	public boolean findUser(String user_name, String user_pass) {
		// TODO Auto-generated method stub
		boolean result = false;
		ConnectDB connDB = new ConnectDB();
		try {
			conn = connDB.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from cux_users_info where user_name =" + "'" + user_name
					+ "' and user_pass = '" + user_pass + "'");
			if (rs.next()) {
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		CloseDB();
		return result;
	}

}
