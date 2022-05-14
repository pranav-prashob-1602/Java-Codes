package com.pranav.jdbcConnectivity;

import java.sql.*;
import java.util.Scanner;

public class PrepStatement {

	public static void main(String[] args) {	
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","CHIKU","tinku");
			Statement s = con.createStatement();
			ResultSet rs;
			Scanner sc = new Scanner(System.in);
			
//			String q = "INSERT INTO DEPT1 VALUES (50, 'TESTING', 'INDIA')";
//			
//			Statement p = con.prepareStatement(q);
//			p.executeQuery(q);
//			rs = s.executeQuery("SELECT * FROM DEPT1");
//			System.out.println("Updated DEPT1 Table: ");
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//			}
			
			String q1 = "INSERT INTO DEPT1 VALUES (?, ?, ?)";
			System.out.println("deptno  deptname loc :");
			int deptno = sc.nextInt();
			String deptname = sc.next();
			String loc = sc.next();
			
			
			PreparedStatement p1 = con.prepareStatement(q1);
			p1.setLong(1, deptno);
			p1.setString(2, deptname);
			p1.setString(3, loc);
			p1.executeQuery();
			rs = s.executeQuery("SELECT * FROM DEPT1");
			System.out.println("Updated DEPT1 Table: ");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
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