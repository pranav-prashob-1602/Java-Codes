package com.pranav.misc;

import java.io.*;

public class EmployeeRunner {
	
	private static void serializeObj(String file) {
		try {
			File f = new File(file);
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream os = new ObjectOutputStream(fos);
			Employee e = new Employee();
			e.setId(1);
			e.setName("Insaan");
			e.setSalary(11);
			os.writeObject(e);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deSerializeObj(String file) {
		try {
			File f = new File(file);
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
//			ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(new File(file)));
			Employee e = (Employee) ois.readObject();
			System.out.println(e);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		serializeObj("InsaanData1.dat");
		deSerializeObj("InsaanData1.dat");
	}

}
