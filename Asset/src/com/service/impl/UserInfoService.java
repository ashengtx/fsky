package com.service.impl;

import java.util.List;

import com.dao.IUserInfoDAO;
import com.service.IUserInfoService;

public class UserInfoService implements IUserInfoService {
	private IUserInfoDAO userdao;


	
	public IUserInfoDAO getUserdao() {
		return userdao;
	}



	public void setUserdao(IUserInfoDAO userdao) {
		this.userdao = userdao;
	}



	@Override
	public List findByUsername(Object username) {
		// TODO Auto-generated method stub
		return userdao.findByUsername(username);

	}



	
}
