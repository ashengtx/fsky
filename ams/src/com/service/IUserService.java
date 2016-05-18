package com.service;

import java.util.List;

import com.model.Userinformation;

public interface IUserService {
	public Userinformation get(int id);
	
	public Userinformation getByName(String name);
	
	public int create(Userinformation user);
	
	public int update(Userinformation user);
	
	public int delete(int userID);

	public List<Userinformation> findAll();

	public List<Userinformation> getLikeName(String name);
}
