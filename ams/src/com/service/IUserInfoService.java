package com.service;

import java.util.List;

import com.model.UserInfo;

public interface IUserInfoService {
	public UserInfo get(int id);
	
	public UserInfo getByName(String name);
	
	public int create(UserInfo userInfo);
	
	public int update(UserInfo userInfo);
	
	public int delete(int userInfoID);

	public List<UserInfo> findAll();

	public List<UserInfo> getLikeName(String name);
}
