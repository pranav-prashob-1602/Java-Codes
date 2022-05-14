package com.pranav.jdbcConnectivity;

import java.sql.*;
import java.util.Scanner;

public class OracleCon {

	public static void main(String[] args) {	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","CHIKU","tinku");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("SELECT * FROM EMP");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("EMP Table: ");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDate(5));
			}
			
			System.out.print("Input the attribute Name: ");
			String attrName = sc.next();
			System.out.println("EMP Table (" + attrName+ "): ");
			
			rs = s.executeQuery("SELECT "+ attrName + " FROM EMP");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
			}
			

			con.close();
			sc.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
