package com.Timmy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtil {
	 private static final String url="jdbc:mysql://127.0.0.1:3306/imooc?characterEncoding=utf8&useSSL=false";
	 private static final String name="root";
	 private static final String password="kxy1277609958";

	   
	public static void main(String[] args) throws Exception {
		
	    
		 //1.�������ݿ�����
		Class.forName("com.mysql.jdbc.Driver");
		
		
		   //2.�������ݿ�
		Connection connection=DriverManager.getConnection(url, name, password);
		
		   //3.����statement����,ͨ�����ݿ������ʵ�����ݵ���ɾ�Ĳ�
		Statement statement=connection.createStatement();
		ResultSet set=statement.executeQuery("select user_name,age from imoocgoddes");
		while(set.next())
		{
			System.out.println(set.getString("user_name")+","+set.getInt("age"));
		}
	}
	   
}
