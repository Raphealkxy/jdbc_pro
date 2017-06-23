package com.Timmy.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GoddnessDuo {
    public void addGodness(Goddness g) throws SQLException
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
    public void updateGodness(String name) throws SQLException
    {
    	String sql="";
    	Connection connection=null;
    	sql=" update imoocgoddes set sex=1 where user_name= ?";
		connection=DBUtil.connect();
		PreparedStatement ptmt=connection.prepareStatement(sql);
        //ptmt.setString(1,g.
        ptmt.setString(1, name);
        ptmt.execute();
    }
   
    public List<Goddness> query() throws SQLException
    {
    	List<Goddness> result = new ArrayList<Goddness>();
    	Goddness goddness =null;
    	String sqlString="";
    	sqlString="select User_name,Age,Sex from imoocgoddes";
    	Connection connection=null;
    	connection=DBUtil.connect();
    	PreparedStatement ptmp=connection.prepareStatement(sqlString);
    	ResultSet rSet=ptmp.executeQuery();
    	while(rSet.next())
		{
    		goddness=new Goddness();
			goddness.setUser_name(rSet.getString("user_name"));
			goddness.setAge(rSet.getInt("age"));
			goddness.setSex(rSet.getInt("sex"));
			result.add(goddness);
		}
    	
    	
    	
    	//PreparedStatement ptmt
    	return result;
    }
    //对查询进行更细节的优化
    public List<Goddness> query(List<Map<String, Object>>paras) throws SQLException
    {
    	List<Goddness> result = new ArrayList<Goddness>();
    	Goddness goddness =null;
    	String sqlString="";
    	sqlString="select User_name,Age,Sex from imoocgoddes where 1=1 ";//对条件进行的定制化 name 关系 值
		if (paras != null && paras.size() > 0)
			for (int i = 0; i < paras.size(); i++) {
				//System.out.println(1);
				Map<String, Object> map = paras.get(i);
				sqlString = sqlString + " and " + map.get("name")
						+ map.get("rel") + map.get("value")+" ";
			}
		//System.out.println(sqlString);
    	Connection connection=null;
    	connection=DBUtil.connect();
    	PreparedStatement ptmp=connection.prepareStatement(sqlString);
    	ResultSet rSet=ptmp.executeQuery();
    	while(rSet.next())
		{
    		goddness=new Goddness();
			goddness.setUser_name(rSet.getString("user_name"));
			goddness.setAge(rSet.getInt("age"));
			goddness.setSex(rSet.getInt("sex"));
			result.add(goddness);
		}
    	
    	
    	
    	//PreparedStatement ptmt
    	return result;
    }
    
    public Goddness get(String name) throws SQLException//本模块只提供按名字获取信息
    {
    	Goddness goddness=new Goddness();
    	String sql="";
    	Connection connection=null;
    	sql="select User_name,Age,Sex from imoocgoddes where User_name=?";
		connection=DBUtil.connect();
		PreparedStatement ptmt=connection.prepareStatement(sql);
		ptmt.setString(1, name);
		ResultSet rSet=ptmt.executeQuery();
		while(rSet.next())
		{
			goddness.setUser_name(rSet.getString("user_name"));
			goddness.setAge(rSet.getInt("age"));
			goddness.setSex(rSet.getInt("sex"));
		}
        
        
    	return goddness;
    }
    
    public void Del(String name) throws SQLException
    {
    	Connection connection=null;
    	String sql="";
    	sql=" Delete from imoocgoddes where user_name=?";
    	connection=DBUtil.connect();
    	PreparedStatement ptmt=connection.prepareStatement(sql);
    	ptmt.setString(1, name);
    	ptmt.execute();
    	
    }
    
    
    
}
