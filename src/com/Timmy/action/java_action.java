package com.Timmy.action;

import java.sql.SQLException;
import java.util.Date;

import com.Timmy.model.Goddness;
import com.Timmy.model.GoddnessDuo;

public class java_action {

	public static void main(String[] args) throws SQLException {
            GoddnessDuo goddnessDuo=new GoddnessDuo();
            Goddness goddness=new Goddness();
            goddness.setUser_name("ะกร๗");
            goddness.setSex(1);
            goddness.setAge(23);
            goddness.setBirthday(new Date());
            goddness.setEmail("1277609958@qq.com");
            goddness.setMobile("1277609958");
            goddness.setCreate_user("haha");
            goddness.setCreate_date(new Date());
            goddness.setUpdate_user("kxy");
            goddness.setIsdel(1);
            goddnessDuo.updateGodness(goddness);
	}
}
