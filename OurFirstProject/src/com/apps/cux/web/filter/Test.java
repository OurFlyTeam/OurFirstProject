package com.apps.cux.web.filter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectDB conn =new ConnectDB();
		int age = conn.getAge("李力");
		System.out.println(age);

		String sex = conn.getSex("lili");
		System.out.println(sex);
		
	}

}
