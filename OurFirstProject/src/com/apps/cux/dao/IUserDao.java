package com.apps.cux.dao;

import com.apps.cux.domain.User;

public interface IUserDao {

	public void Register(User user);
	
	public boolean isExsit(String user_name);

	public boolean findUser(String user_name,String user_pass);


}
