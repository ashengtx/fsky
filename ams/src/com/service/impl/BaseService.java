package com.service.impl;

import java.util.List;

import com.dao.IBaseDao;
import com.dao.IUserDao;
import com.service.IBaseService;

/*
 * @author 丁鸿
 *  
 * */
public class BaseService implements IBaseService {
	private IBaseDao iBaseDao;

	public IBaseDao getiBaseDao() {
		return iBaseDao;
	}

	public void setiBaseDao(IBaseDao iBaseDao) {
		this.iBaseDao = iBaseDao;
	}

	@Override
	public <T> void doCreate(T t) {

		try {
			System.out.println("nana");
			iBaseDao.doCreate(t);
			System.out.println("lala");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	@Override
	public <T> T findById(Class<T> cls, Integer id) throws Exception {
		return iBaseDao.findById(cls, id);
	}

	@Override
	public <T> void doDelete(T t) {
		try {
			iBaseDao.delete(t);
		} catch (Exception e) {
		}

	}
	@Override
	public <T> void saveOrUpdate(T t) {
		iBaseDao.saveOrUpdate(t);
	}
	@Override
	public <T> List<T> getList(Class<T> cls) {
		return iBaseDao.getList(cls);
	}

}
