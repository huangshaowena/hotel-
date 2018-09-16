package com.mybatis.mybatis;


import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.DBUtil.DBUtil;
import com.mybatis.ictiyDAO.ICtiy;

public class test {

	public static void main(String[] args) {
		   
		 
		     SqlSession session = DBUtil.getsession();
			 
	         
	         ICtiy dao = session.getMapper(ICtiy.class);
	         
	         List<ctiy> ctiys = dao.select();
	         
	         for(ctiy c:ctiys) {
	        	 
	        	    System.out.println(c.getName());
	        	 
	         }
	         
		
		
		 
		
		

	}

}
