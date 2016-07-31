package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHelper {
	public static final String url = "jdbc:mysql://127.0.0.1/test";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String user = "root";
	public static final String password = "";
	
	Connection conn;
	PreparedStatement pst;
	ResultSet ret;
	
	private void ConnectionDB() {
		try {
			Class.forName(name);
			conn = DriverManager.getConnection(url,user,password);
			pst = conn.prepareStatement("select * from myclass;");
			ret = pst.executeQuery();
			int col = ret.getMetaData().getColumnCount();
			while (ret.next()) {
	            for (int i = 1; i <= col; i++) {
	                System.out.print(ret.getString(i) + "\t");
	                if ((i == 2) && (ret.getString(i).length() < 8)) {
	                    System.out.print("\t");
	                }
	             }
	            System.out.println("");
	        }
			ret.close();
			pst.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DBHelper dbHelper = new DBHelper();
		dbHelper.ConnectionDB();
	}
	
}
