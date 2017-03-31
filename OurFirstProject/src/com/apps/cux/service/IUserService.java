package com.apps.cux.service;

import com.apps.cux.domain.User;
import com.apps.cux.exception.UserFindException;

public interface IUserService {
	
	//判断用户名密码是否正确
	public boolean findUser(String username,String password) throws UserFindException;
	
	//判断用户是否存在
	public boolean isExsit(String username);
	
	//注册
	public void register(User user);
	
}
