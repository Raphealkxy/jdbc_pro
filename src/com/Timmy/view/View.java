package com.Timmy.view;

import java.util.Scanner;

/**
 * 视图层
 * @author Timmy
 *
 */
public class View {

	public static void main(String[] args) {
              Scanner scanner=new Scanner(System.in);
              int i=0;
              String s="";
              s="****************菜单****************\n"
              + "*************1.添加人员信息************\n"
             +  "*************2.查询人员信息************\n"
              + "*************3.修改人员信息************\n"
              + "*************4.返回主菜单*************\n"
              + "*************5.退出*****************\n";
            		//  System.out.println(s);
//              System.out.print("请输入一个数字：");
//              i=scanner.nextInt();
              while(true)
              {
            	  
              System.out.print("请选择业务标号:");
               i=scanner.nextInt();
               if(i==1)
               {
            	   System.out.println("添加人员信息");
               }else if(i==2)
               {
            	   System.out.println(i);
               }else if(i==3)
               {
            	   System.out.println(i);
               }else if(i==4)
               {
            	   System.out.println(i);
               }else if(i==5)
               {
            	   System.out.println(i);
               }else {
            	   System.out.println("你输入的序号超出规定范围，请重新输入");
			}
             // System.out.println(i);
              }
	}

}
