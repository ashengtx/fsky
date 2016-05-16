package com.action;

import com.model.UserInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.service.impl.UserInfoService;

public class LoginAction extends ActionSupport{

	private String username;
	private String password;
	private UserInfoService userInfoService;

	public String login(){
		//System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
		//return SUCCESS;
		System.out.println("login");
		UserInfo user = userInfoService.getByName(this.getUsername());
		if(user!=null){
//			HttpServletRequest request=ServletActionContext.getRequest();
//			HttpSession session=request.getSession();
//			session.setAttribute("user", user);
//			return "success";
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
			return SUCCESS;
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

	public UserInfoService getUserInfoService() {
		return userInfoService;
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
}
