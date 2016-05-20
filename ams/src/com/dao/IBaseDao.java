package com.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

public interface IBaseDao {
	
	public <T> boolean create(T t);
	
	public Object update(Object obj);

	public boolean delete(Object obj);

	public <T> T get(Class<T> entry, Serializable id);
	//dingh
	public <T> void doCreate(T t);
	public <T> T findById(Class<T> cls, Integer id) throws Exception;
	public <T> boolean doDelete(T t);
	public <T> boolean saveOrUpdate(T t);
	public <T> List<T> getList(Class<T> cls);

}
