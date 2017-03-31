package com.apps.cux.web.filter;

import java.sql.*;

public class ConnectDB {
	private Statement stmt;
	private ResultSet rs;
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

	// 查看用户年龄*******************
	public int getAge(String userName) {
		int result = 0;
		String user_name;
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from cux_users_info where user_name =" + "'" + userName + "'");
			//rs = stmt.executeQuery("select * from cux_users_info where user_name = '张三'");
			//rs = stmt.executeQuery("select * from cux_users_info where user_id =1002");
			if (rs.next()) {
				result = rs.getInt("AGE");
				//user_name = rs.getString("USER_NAME");
				//System.out.println(result);
				//System.out.println(user_name);
				// System.out.println(rs.getString("USER_NAME"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		CloseDB();
		return result;
	}

	// 查看用户性别*******************
	public String getSex(String userName) {
		String result = "";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from cux_users_info where user_name =" + "'" + userName + "'");
			if (rs.next())
				result = rs.getString("SEX");
		} catch (Exception e) {
			e.printStackTrace();
		}
		CloseDB();
		return result;
	}
	
	// 插入数据
		public boolean addUser() {
			boolean success = true;
			String sql = "insert into cux_users_info"
				    + "(user_name,sex,birth_date,age,email_address,user_pass)"
				    + " values('lili','M','1991-07-01','27','404556509@qq.com','woshi3bear')";
			try {
				conn = getConnection();
				stmt = conn.createStatement();
				int n = stmt.executeUpdate(sql);
				if(n == 0){
				    success = false;
				   }
			} catch (Exception e) {
				e.printStackTrace();
			}
			CloseDB();
			return success;
		}

}
