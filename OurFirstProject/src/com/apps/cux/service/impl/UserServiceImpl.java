package com.apps.cux.service.impl;

import com.apps.cux.dao.IUserDao;
import com.apps.cux.domain.User;
import com.apps.cux.exception.UserFindException;
import com.apps.cux.service.IUserService;

public class UserServiceImpl implements IUserService{
	
	private IUserDao userDao;
	

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean findUser(String username, String password) throws UserFindException {
		boolean result = false;
		result = userDao.findUser(username, password);
		if(!result){
				throw new UserFindException("密码或用户名错误");
		}
		return result;
	}

	@Override
	public void register(User user) {
		
	}

	@Override
	public boolean isExsit(String username) {
		return false;
	}
		
}
