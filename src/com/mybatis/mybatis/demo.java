package com.mybatis.mybatis;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
         System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��

	}

}
