package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest {
	public static String url = "jdbc:mysql://localhost:3306/test";
	public static String user = "root";
	public static String password = "";
	public static String driverName = "com.mysql.jdbc.Driver";
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void update(String sql) {
		Connection conn = getConnection();
		try {
			Statement st = conn.createStatement();
			int count = st.executeUpdate(sql);
			System.out.println("更新了 " + count + " 条数据");
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void rollbackTest() {
		Connection conn = getConnection();
		try {
			conn.setAutoCommit(false);
			Statement st = conn.createStatement();
			st.executeUpdate("insert into Websites values (8,'tutu','url',99,'CN')");
			st.executeUpdate("insert into access_log values ()");
			conn.commit();
			st.close();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
//		update("insert into Websites values (8,'tutu','url',99,'CN')");
//		update("insert into access_log values ()");
		rollbackTest();
	}

}
