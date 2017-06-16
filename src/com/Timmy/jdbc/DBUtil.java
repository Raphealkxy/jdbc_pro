package com.Timmy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	 private static final String url="jdbc:mysql://127.0.0.1:3306/imooc?characterEncoding=utf8&useSSL=false";
	 private static final String name="root";
	 private static final String password="kxy1277609958";

	// private Connection connection=null;
	 static
	 {
		 //1.加载数据库驱动
			try {
				Class.forName("com.mysql.jdbc.Driver");
				//connection=DriverManager.getConnection(url, name, password);

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			   //2.连接数据库
	 }
	 public static Connection connect() throws SQLException
	 {
		 return DriverManager.getConnection(url, name, password);
	 }
	   
	//public static void main(String[] args) throws Exception {
		
	    
	
		
		   //3.创建statement对象,通过数据库的连接实现数据的增删改查
//		Statement statement=connection.createStatement();
//		ResultSet set=statement.executeQuery("select user_name,age from imoocgoddes");
//		while(set.next())
//		{
//			System.out.println(set.getString("user_name")+","+set.getInt("age"));
//		}
	//}
	   
}
