package com.pranav.jdbcConnectivity;

import java.sql.*;

public class OracleCon {

	public static void main(String[] args) {	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","CHIKU","tinku");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM EMP");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDate(5));
			}
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
