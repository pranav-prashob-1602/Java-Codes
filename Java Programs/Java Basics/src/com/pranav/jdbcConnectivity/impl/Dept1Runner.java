package com.pranav.jdbcConnectivity.impl;

import java.sql.*;

import com.pranav.jdbcConnectivity.dao.Dept1DAO;
import com.pranav.jdbcConnectivity.vo.Dept1Details;

public class Dept1Runner {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","CHIKU","tinku");
			
			Dept1Details det = new Dept1Details(95, "SDE", "CALIFORNIA");
			
			Dept1DAO d = new Dept1DAOImpl();
			
			d.delete(con, 90);
			
			
			//d.insert(con, det);
			
			det.setLoc("TOKYO");
			
			d.update(con, det.getDeptNo(), det);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
