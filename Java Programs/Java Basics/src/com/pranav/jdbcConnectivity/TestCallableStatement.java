package com.pranav.jdbcConnectivity;

import java.sql.*;
import java.util.Scanner;

public class TestCallableStatement {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","CHIKU","tinku");
			Statement s = con.createStatement();
			ResultSet rs;
			Scanner sc = new Scanner(System.in);
			
			CallableStatement q = con.prepareCall("{call INSERTDATA(?, ?, ?)}");
			
			q.setInt(1, 90);
			q.setString(2, "Consumer");
			q.setString(3, "India");
			
			q.execute();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
