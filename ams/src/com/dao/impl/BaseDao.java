package com.dao.impl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.IBaseDao;

public class BaseDao extends HibernateDaoSupport implements IBaseDao{
	
/*	private SessionFactory sessionFactory;


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/

	@Override
	public Object create(Object obj) {
		try{
			getHibernateTemplate().save(obj);
			return obj;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Object update(Object obj) {
		try {
			getHibernateTemplate().saveOrUpdate(obj);
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean delete(Object obj) {
		try {
			getHibernateTemplate().delete(obj);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public <T> T get(Class<T> entry, Serializable id) {
		try {
			System.out.println(id);
			return getHibernateTemplate().get(entry, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


}
