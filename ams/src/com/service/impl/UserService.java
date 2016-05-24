package com.service.impl;

import java.util.List;

import com.dao.impl.UserDao;
import com.model.Userinformation;
import com.service.IUserService;

public class UserService extends BaseService implements IUserService {

	private UserDao userDao;

	@Override
	public Userinformation get(int id) {
		return userDao.get(id);
	}

	@Override
	public Userinformation getByName(String name) {
		return userDao.findUserByName(name);
	}

	@Override
	public int create(Userinformation user) {
		if (user.getUsername() == null || user.getUsername().equals(""))
			return 2;
		if (getByName(user.getUsername()) != null)
			return 1;

		if (!userDao.create(user))
			return 0;

		return 3;
	}

	@Override
	public int update(Userinformation user) {
		if (userDao.findUserByName(user.getUsername()) == null)
			return 1;
		if (userDao.update(user) == null)
			return 2;
		return 0;
	}

	@Override
	public int delete(int userID) {
		Userinformation user = userDao.get(userID);
		if (user == null)
			return 2;
		user.setUserstate(-1);
		if (userDao.update(user) == null)
			return 1;
		return 0;
	}

	@Override
	public List<Userinformation> findAll() {
		return userDao.findAllUser();
	}

	@Override
	public List<Userinformation> getLikeName(String name) {
		return userDao.findUserLikeName(name);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Userinformation getUser(Integer userid) {
		// TODO Auto-generated method stub
		return this.userDao.getUser(userid);
	}

}
