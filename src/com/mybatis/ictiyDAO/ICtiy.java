package com.mybatis.ictiyDAO;

import java.util.List;

import com.mybatis.mybatis.ctiy;

public interface ICtiy {
	
	public boolean insert(ctiy bean);
  
	 public boolean updata(ctiy bean);
	 
	 public boolean delete(int id);
	 
	 public ctiy selecetone();
	
	 public List<ctiy> select();
	
}
