package com.service;

import java.util.List;

/*
 * @author 丁鸿
 *  
 * */
public interface IBaseService {
	
	public <T>boolean create(T t);

	public <T> void doCreate(T t);

	public <T> T findById(Class<T> cls, Integer id) throws Exception;

	public <T> void doDelete(T t);

	public <T> void saveOrUpdate(T t);

	public <T> List<T> getList(Class<T> cls);
}
