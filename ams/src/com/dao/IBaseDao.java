package com.dao;

import java.io.Serializable;

import org.hibernate.Session;

public interface IBaseDao {
	
	public <T> boolean create(T t);
	
	public Object update(Object obj);
	
	public boolean delete(Object obj);
	
	public <T> T get(Class<T> entry,Serializable id);
	

}
