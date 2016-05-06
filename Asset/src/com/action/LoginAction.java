package com.action;


import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.service.IUserInfoService;
//import com.service.ITestService;
//import com.tools.IPage;
//import com.tools.PageInfo;
//import com.vo.Paraminfo;

public class LoginAction extends ActionSupport {
//	private ITestService testService;
//	
//	protected IPage pageInfo = new PageInfo();   
	private IUserInfoService userService;
	
	private String username;
	private String pwd;
	
	

//	public ITestService getTestService() {
//		return testService;
//	}
//
//	public void setTestService(ITestService testService) {
//		this.testService = testService;
//	}
	
	public String login() {
		
			System.out.print(this.getUsername()+"===XooooooooooooooX=========="+this.getPwd());
			return "success";

	}
	
//	public String execute() throws Exception {
//		System.out.print(this.getUsername()+"========================"+this.getPwd());
//
//		return SUCCESS;
//	}
	
//	public String pagedemo(){
//		this.getPageInfo().setResult(
//				(testService.findAll(pageInfo)));
//		
//		return "page";
//	}
//
//	public IPage getPageInfo() {
//		return pageInfo;
//	}
//
//	public void setPageInfo(IPage pageInfo) {
//		this.pageInfo = pageInfo;
//	}

	public IUserInfoService getUserService() {
		return userService;
	}

	public void setUserService(IUserInfoService userService) {
		this.userService = userService;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}