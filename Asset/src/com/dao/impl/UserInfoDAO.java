package com.dao.impl;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beans.UserInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * UserInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.beans.UserInfo
 * @author MyEclipse Persistence Tools
 */
public class UserInfoDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(UserInfoDAO.class);
	// property constants
	public static final String USERNAME = "username";
	public static final String PSW = "psw";
	public static final String STATE = "state";
	public static final String SEX = "sex";

	public void save(UserInfo transientInstance) {
		log.debug("saving UserInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(UserInfo persistentInstance) {
		log.debug("deleting UserInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public UserInfo findById(java.lang.Integer id) {
		log.debug("getting UserInfo instance with id: " + id);
		try {
			UserInfo instance = (UserInfo) getSession().get(
					"com.beans.UserInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(UserInfo instance) {
		log.debug("finding UserInfo instance by example");
		try {
			List results = getSession().createCriteria("com.beans.UserInfo")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding UserInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from UserInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByPsw(Object psw) {
		return findByProperty(PSW, psw);
	}

	public List findByState(Object state) {
		return findByProperty(STATE, state);
	}

	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findAll() {
		log.debug("finding all UserInfo instances");
		try {
			String queryString = "from UserInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public UserInfo merge(UserInfo detachedInstance) {
		log.debug("merging UserInfo instance");
		try {
			UserInfo result = (UserInfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(UserInfo instance) {
		log.debug("attaching dirty UserInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(UserInfo instance) {
		log.debug("attaching clean UserInfo instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}