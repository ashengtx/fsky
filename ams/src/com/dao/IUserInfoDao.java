package com.dao;

import java.util.List;

import com.model.UserInfo;

public interface IUserInfoDao {
	
	public UserInfo get(int id);
	
	public UserInfo findUserInfoByName(String name);
	
	public List<UserInfo> findAllUserInfo();

	public List<UserInfo> findUserLikeName(String name);
}
