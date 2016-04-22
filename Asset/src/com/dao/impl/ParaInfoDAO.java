package com.dao.impl;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beans.ParaInfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * ParaInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.beans.ParaInfo
 * @author MyEclipse Persistence Tools
 */
public class ParaInfoDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ParaInfoDAO.class);
	// property constants
	public static final String PNAME = "pname";
	public static final String PVALUE = "pvalue";
	public static final String PTID = "ptid";
	public static final String PTNAME = "ptname";

	public void save(ParaInfo transientInstance) {
		log.debug("saving ParaInfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ParaInfo persistentInstance) {
		log.debug("deleting ParaInfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ParaInfo findById(java.lang.Integer id) {
		log.debug("getting ParaInfo instance with id: " + id);
		try {
			ParaInfo instance = (ParaInfo) getSession().get(
					"com.beans.ParaInfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ParaInfo instance) {
		log.debug("finding ParaInfo instance by example");
		try {
			List results = getSession().createCriteria("com.beans.ParaInfo")
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
		log.debug("finding ParaInfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ParaInfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPname(Object pname) {
		return findByProperty(PNAME, pname);
	}

	public List findByPvalue(Object pvalue) {
		return findByProperty(PVALUE, pvalue);
	}

	public List findByPtid(Object ptid) {
		return findByProperty(PTID, ptid);
	}

	public List findByPtname(Object ptname) {
		return findByProperty(PTNAME, ptname);
	}

	public List findAll() {
		log.debug("finding all ParaInfo instances");
		try {
			String queryString = "from ParaInfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ParaInfo merge(ParaInfo detachedInstance) {
		log.debug("merging ParaInfo instance");
		try {
			ParaInfo result = (ParaInfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ParaInfo instance) {
		log.debug("attaching dirty ParaInfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ParaInfo instance) {
		log.debug("attaching clean ParaInfo instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}