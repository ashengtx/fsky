package com.service.impl;

import java.util.List;

import com.dao.impl.UserInfoDao;
import com.model.UserInfo;
import com.service.IUserInfoService;

public class UserInfoService implements IUserInfoService {

	private UserInfoDao userInfoDao;
	
	@Override
	public UserInfo get(int id) {
		return userInfoDao.get(id);
	}

	@Override
	public UserInfo getByName(String name) {
		return userInfoDao.findUserInfoByName(name);
	}

	@Override
	public int create(UserInfo userInfo) {
		if(userInfo.getUsername()==null || userInfo.getUsername().equals(""))
			return 2;
		if(getByName(userInfo.getUsername())!=null)
			return 1;
		
		if(userInfoDao.create(userInfo) !=null)
			return 0;
	
		return 3;
	}

	@Override
	public int update(UserInfo userInfo) {
		if(userInfoDao.findUserInfoByName(userInfo.getUsername())==null)
			return 1;
		if(userInfoDao.update(userInfo)==null)
			return 2;
		return 0;
	}

	@Override
	public int delete(int userInfoID) {
		UserInfo user = userInfoDao.get(userInfoID);
		if(user == null) return 2;
		user.setUserState(-1);
		if(userInfoDao.update(user)==null)
			return 1;
		return 0;
	}

	@Override
	public List<UserInfo> findAll() {
		return userInfoDao.findAllUserInfo();
	}

	@Override
	public List<UserInfo> getLikeName(String name) {
		return userInfoDao.findUserLikeName(name);
	}

	public UserInfoDao getUserInfoDao() {
		return userInfoDao;
	}

	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

}
