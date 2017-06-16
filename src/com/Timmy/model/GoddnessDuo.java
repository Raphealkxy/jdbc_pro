package com.Timmy.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.Timmy.jdbc.DBUtil;

public class GoddnessDuo {
    public void addGodness()
    {
    	
    }
    public void updateGodness(Goddness g) throws SQLException
    {
    	String sql="";
    	Connection connection=null;
    	sql="insert into imoocgoddes("+" user_name,sex,age,birthday,email,"
    			+ " mobile,create_user,create_date,update_date,update_user,isdel"
    			+ " )values("+" ?,?,?,?,?,?,?,Current_time(),?,?,? )";
		connection=DBUtil.connect();
		PreparedStatement ptmt=connection.prepareStatement(sql);
        ptmt.setString(1,g.getUser_name());
        ptmt.setInt(2, g.getSex());
        ptmt.setInt(3, g.getAge());
        ptmt.setDate(4, new Date(g.getBirthday().getTime()));
        ptmt.setString(5, g.getEmail());
        ptmt.setString(6, g.getMobile());
        ptmt.setString(7, g.getCreate_user());
        ptmt.setDate(8, new Date(g.getCreate_date().getTime()));
        ptmt.setString(9, g.getUpdate_user());
        ptmt.setInt(10, g.getIsdel());
        ptmt.execute();
    }
   
    public List<Goddness> query()
    {
    	return null;
    }
    
    public Goddness get()
    {
    	return null;
    }
    
}
