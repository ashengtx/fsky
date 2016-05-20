package com.action;

import com.model.Userinformation;
import com.opensymphony.xwork2.ActionSupport;
import com.service.impl.UserService;

/*
 * @author 林连升
 *  
 * */
public class LoginAction extends ActionSupport{

	private String username;
	private String password;
	private UserService userService;

	public String login(){

		System.out.println("LoginAction");
		Userinformation user = userService.getByName(this.getUsername());
		if(user!=null){
			System.out.println(user.getUsername());
			System.out.println(user.getUserpwd());
			System.out.println("user input: " + this.getPassword());
			if (user.getUserpwd().equals(this.getPassword())) {
				return SUCCESS;
			}				
		}
	
		return "fail";
	}
	
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

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
