package com.pranav.jdbcConnectivity;

import java.sql.*;
import java.util.Scanner;

public class PrepUpdateStatement {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","CHIKU","tinku");
			Statement s = con.createStatement();
			ResultSet rs;
			Scanner sc = new Scanner(System.in);
			
			String q = "UPDATE DEPT1 SET DEPTNO = 55 WHERE DEPTNO = 50";
			
			Statement p = con.prepareStatement(q);
			p.executeUpdate(q);
			rs = s.executeQuery("SELECT * FROM DEPT1");
			System.out.println("Updated DEPT1 Table: ");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			
			String q1 = "UPDATE DEPT1 SET DEPTNO = ? WHERE DEPTNO = ?";
			System.out.println("newDeptNo oldDeptNo:");
			int newDeptNo = sc.nextInt();
			int oldDeptNo = sc.nextInt();
			
			
			PreparedStatement p1 = con.prepareStatement(q1);
			p1.setLong(1, newDeptNo);
			p1.setLong(2, oldDeptNo);
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