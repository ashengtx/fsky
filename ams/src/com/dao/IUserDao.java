package com.dao;

import java.util.List;

import com.model.Userinformation;

public interface IUserDao {
	
	public Userinformation get(int id);
	
	public Userinformation findUserByName(String name);
	
	public List<Userinformation> findAllUser();

	public List<Userinformation> findUserLikeName(String name);
}
