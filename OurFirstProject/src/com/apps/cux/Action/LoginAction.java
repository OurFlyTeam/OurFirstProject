package com.apps.cux.Action;

import com.apps.cux.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 处理用户登录的action
 * 
 * @author 3bear
 *
 */
public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private IUserService userservice;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public IUserService getUserservice() {
		return userservice;
	}

	public void setUserservice(IUserService userservice) {
		this.userservice = userservice;
	}

	@Override
	public String execute() throws Exception {
		boolean result = userservice.findUser(username, password);
		if (result == true) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

}
