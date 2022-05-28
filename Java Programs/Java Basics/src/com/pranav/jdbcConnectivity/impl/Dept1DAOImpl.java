package com.pranav.jdbcConnectivity.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.pranav.jdbcConnectivity.dao.Dept1DAO;
import com.pranav.jdbcConnectivity.vo.Dept1Details;

public class Dept1DAOImpl implements Dept1DAO {
	public int insert(Connection con, Dept1Details d) {
		try {
			String q = "INSERT INTO DEPT1 VALUES (?, ?, ?)";
			PreparedStatement p = con.prepareStatement(q);
			p.setInt(1, d.getDeptNo());
			p.setString(2, d.getdName());
			p.setString(3, d.getLoc());
			return p.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int update(Connection con, int deptNo, Dept1Details d) {
		try {
			String q = "UPDATE DEPT1 SET DEPTNO = ?, DNAME = ?, LOC = ? WHERE DEPTNO = ?";
			PreparedStatement p = con.prepareStatement(q);
			p.setInt(1, d.getDeptNo());
			p.setString(2, d.getdName());
			p.setString(3, d.getLoc());
			p.setInt(4, deptNo);
			return p.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int delete(Connection con, int deptNo) {
		try {
			String q = "DELETE FROM DEPT1 WHERE DEPTNO = ?";
			PreparedStatement p = con.prepareStatement(q);
			p.setInt(1, deptNo);
			return p.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public Dept1Details findByPrimeKey(Connection con, int deptNo) {
		return null;
	}
}
