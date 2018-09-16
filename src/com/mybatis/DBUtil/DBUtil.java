package com.mybatis.DBUtil;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class  DBUtil {
	
	     public static SqlSession getsession() {
			
	    	 Reader reader;
			try {
				reader = Resources.getResourceAsReader("configuration.xml");
				SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);

		         SqlSession session =factory.openSession();
		         
		         
		         return session;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
				
	   
	    	 
	    	 return null;
	    	 
	   
	     }
	

}
