package com.service;

import java.util.List;

import com.model.Userinformation;


/*
 * @author 丁鸿
 *  
 * */
public interface IUserService extends IBaseService {
	public Userinformation get(int id);

	public Userinformation getByName(String name);

	public int create(Userinformation user);

	public int update(Userinformation user);

	public int delete(int userID);

	public List<Userinformation> findAll();

	public List<Userinformation> getLikeName(String name);

	public Userinformation getUser(Integer userid);
	
	public List<Userinformation> userSearch( String username);
	
	public List<Userinformation> getUserList(String username,
			Integer userstate, Integer departmentid,Integer roleid);
}
