package com.Timmy.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Timmy.model.Goddness;
import com.Timmy.model.GoddnessDuo;

public class java_action {
     public void add() throws SQLException//视图层建立后将会修改逻辑
     {
    	 GoddnessDuo goddnessDuo=new GoddnessDuo();
         Goddness goddness=new Goddness();
         goddness.setUser_name("cmk");
         goddness.setSex(1);
         goddness.setAge(23);
         goddness.setBirthday(new Date());
         goddness.setEmail("1277609958@qq.com");
         goddness.setMobile("1277609958");
         goddness.setCreate_user("haha");
         goddness.setCreate_date(new Date());
         goddness.setUpdate_user("kxy");
         goddness.setIsdel(1);
         goddnessDuo.addGodness(goddness);
     }
     public void edit() throws SQLException//接口逻辑将会在视图层建立后加以合理化
     {
    	 GoddnessDuo goddnessDuo=new GoddnessDuo();
         //Goddness goddness=new Goddness();
         goddnessDuo.updateGodness("小美");
     }
     public List<Goddness>query() throws SQLException//接口逻辑将会在视图层建立后加以合理化
     {
    	  GoddnessDuo goddnessDuo=new GoddnessDuo();
    	  
    	 return goddnessDuo.query();
     }
     public Goddness get() throws SQLException//接口逻辑将会在视图层建立后加以合理化
     {
         GoddnessDuo goddnessDuo=new GoddnessDuo();
         Goddness g=goddnessDuo.get("小美");
         
    	return goddnessDuo.get("小美");
    
     }
     
     public List<Goddness>query(List<Map<String, Object>>paras) throws SQLException//接口逻辑将会在视图层建立后加以合理化
     {
    	 GoddnessDuo goddnessDuo=new GoddnessDuo();
    	 List<Map<String, Object>>pList=new ArrayList<Map<String,Object>>();
         Map<String,Object>map=new HashMap<String, Object> ();
         map.put("name", "user_name");
         map.put("rel", "=");
         map.put("value", "'小明'");//注意字符串要加单引号来区分值为字符
         pList.add(map);
         List<Goddness> reList=goddnessDuo.query(pList);
//       for(int i=0;i<reList.size();i++)
//       System.out.println("姓名:"+reList.get(i).getUser_name()+" "+"性别:"+reList.get(i).getSex()+" "+"年龄"+reList.get(i).getAge());
        
    	 return reList;
     }
     
     public void delete() throws SQLException//接口逻辑将会在视图层建立后加以合理化
     {
    	 GoddnessDuo goddnessDuo=new GoddnessDuo();
    	 goddnessDuo.Del("小美");
     }
	
}
