package com.dao.impl;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beans.AssetType;

/**
 * A data access object (DAO) providing persistence and search support for
 * AssetType entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.beans.AssetType
 * @author MyEclipse Persistence Tools
 */
public class AssetTypeDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(AssetTypeDAO.class);
	// property constants
	public static final String ATCODE = "atcode";
	public static final String ATNAME = "atname";
	public static final String UL_ID = "ulId";
	public static final String UL_NAME = "ulName";

	public void save(AssetType transientInstance) {
		log.debug("saving AssetType instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AssetType persistentInstance) {
		log.debug("deleting AssetType instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AssetType findById(java.lang.Integer id) {
		log.debug("getting AssetType instance with id: " + id);
		try {
			AssetType instance = (AssetType) getSession().get(
					"com.beans.AssetType", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AssetType instance) {
		log.debug("finding AssetType instance by example");
		try {
			List results = getSession().createCriteria("com.beans.AssetType")
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
		log.debug("finding AssetType instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AssetType as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAtcode(Object atcode) {
		return findByProperty(ATCODE, atcode);
	}

	public List findByAtname(Object atname) {
		return findByProperty(ATNAME, atname);
	}

	public List findByUlId(Object ulId) {
		return findByProperty(UL_ID, ulId);
	}

	public List findByUlName(Object ulName) {
		return findByProperty(UL_NAME, ulName);
	}

	public List findAll() {
		log.debug("finding all AssetType instances");
		try {
			String queryString = "from AssetType";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AssetType merge(AssetType detachedInstance) {
		log.debug("merging AssetType instance");
		try {
			AssetType result = (AssetType) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AssetType instance) {
		log.debug("attaching dirty AssetType instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AssetType instance) {
		log.debug("attaching clean AssetType instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}