package com.pranav.jdbcConnectivity.dao;

import java.sql.*;



import com.pranav.jdbcConnectivity.vo.Dept1Details;

/*
 * DAO -> Data Access Objects
 */

public interface Dept1DAO {
	int insert(Connection con, Dept1Details d);
	int update(Connection con, int deptNo, Dept1Details d);
	int delete(Connection con, int deptNo);
	Dept1Details findByPrimeKey(Connection con, int deptNo);
}
