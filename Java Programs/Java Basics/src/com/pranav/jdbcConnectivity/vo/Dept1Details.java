package com.pranav.jdbcConnectivity.vo;

import java.io.Serializable;

/*
 * VO -> Value Objects
 * also called Data Transfer Objects
 */



public class Dept1Details implements Serializable {

	private static final long serialVersionUID = 1249794286497136840L;
	int deptNo;
	String dName;
	String loc;
	
	public Dept1Details(int deptNo, String dName, String loc) {
		this.deptNo = deptNo;
		this.dName = dName;
		this.loc = loc;
	}
	

	public int getDeptNo() {
		return deptNo;
	}


	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}


	public String getdName() {
		return dName;
	}


	public void setdName(String dName) {
		this.dName = dName;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("Dept1Details [deptNo=");
		s.append(deptNo);
		s.append(", dName=");
		s.append(dName);
		s.append(", loc=");
		s.append(loc);
		s.append("]");
		return s.toString();
	}
	
	
}
