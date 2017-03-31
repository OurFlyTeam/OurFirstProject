package com.apps.cux.domain;


import java.io.Serializable;
import java.util.Date;
/**
 * 用户实体类
 */
public class User implements Serializable {

    private static final long serialVersionUID = -4313782718477229465L;
    
    // 用户ID
    private String user_id;
    // 用户名
    private String user_name;
    // 用户密码
    private String user_pass;
    // 用户邮箱
    private String email_address;
    // 用户生日
    private Date birth_date;
    // 用户年龄
    private Date age;
    // 用户性别
    private Date sex;
    
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	public Date getAge() {
		return age;
	}
	public void setAge(Date age) {
		this.age = age;
	}
	public Date getSex() {
		return sex;
	}
	public void setSex(Date sex) {
		this.sex = sex;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
}
