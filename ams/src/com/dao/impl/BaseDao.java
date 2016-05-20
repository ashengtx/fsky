package com.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.IBaseDao;

/*
 * @author 丁鸿
 *  
 * */
public class BaseDao extends HibernateDaoSupport implements IBaseDao {

	/*
	 * private SessionFactory sessionFactory;
	 * 
	 * 
	 * public SessionFactory getSessionFactory() { return sessionFactory; }
	 * 
	 * public void setSessionFactory(SessionFactory sessionFactory) {
	 * this.sessionFactory = sessionFactory; }
	 */

	@Override
	public <T> boolean create(T t) {
		try{
			System.out.println("BaseDao Create");
			super.getHibernateTemplate().save(t);
			System.out.println("BaseDao Create 2");
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
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

	@Override
	public <T> void doCreate(T t) {

		try {
			System.out.println("222");
			this.getHibernateTemplate().save(t);
			System.out.println("333");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	@Override
	public <T> T findById(Class<T> cls, Integer id) throws Exception {
		T obj = null;
		obj = (T) super.getHibernateTemplate().get(cls, id);
		return obj;
	}

	@Override
	public <T> boolean doDelete(T t) {
		try {
			this.getHibernateTemplate().delete(t);
			return true;
		} catch (Exception e) {
			System.out.println("ddd:" + e.getMessage());
			return false;
		}
	}

	@Override
	public <T> boolean saveOrUpdate(T t) {
		try {

			this.getHibernateTemplate().saveOrUpdate(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public <T> List<T> getList(Class<T> cls) {
		return (List<T>) this.getHibernateTemplate().find(
				"from " + cls.getName());
	}

}
