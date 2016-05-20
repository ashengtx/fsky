package com.service.impl;

import com.dao.impl.BaseDao;
import com.service.IBaseService;

public class BaseService implements IBaseService {
	
	private BaseDao baseDao;

	@Override
	public <T> boolean create(T t) {
		System.out.println("BaseService Create");
		return baseDao.create(t);
	}

	public BaseDao getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

}
