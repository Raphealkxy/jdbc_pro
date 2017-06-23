package com.Timmy.test;

import java.sql.SQLException;

import com.Timmy.action.java_action;

/**
 * 这是用来测试具体功能的文件，采用三层架构
 * @author Timmy
 *
 */
public class Test {

	public static void main(String[] args) {
       java_action jAction=new java_action();
       try {
		jAction.add();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
