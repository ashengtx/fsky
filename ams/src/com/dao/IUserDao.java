package com.dao;

import java.util.List;

import com.model.Userinformation;

public interface IUserDao extends IBaseDao{

	public Userinformation get(int id);

	public Userinformation findUserByName(String name);

	public List<Userinformation> findAllUser();

	public List<Userinformation> findUserLikeName(String name);

	public Userinformation getUser(Integer userid);
	
	public List<Userinformation> userSearch(Userinformation user);
}
