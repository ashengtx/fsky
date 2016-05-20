package com.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.dao.IUserDao;
import com.model.Userinformation;

public class UserDao extends BaseDao implements IUserDao {

	@Override
	public Userinformation get(int id) {
		try {
			return super.getHibernateTemplate().get(Userinformation.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Userinformation findUserByName(String name) {
		// name = "%"+name+"%";
		String hql = "from Userinformation where username='" + name + "'";
		System.out.println(hql);

		try {
			Query query = super.getSession().createQuery(hql);
			List list = query.list();
			if (list == null || list.size() == 0)
				return null;
			return (Userinformation) list.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Userinformation> findAllUser() {
		String hql = "from Userinformation where userstate!=-1 order by id desc";
		try {
			return getHibernateTemplate().find(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Userinformation> findUserLikeName(String name) {
		// name = "%"+name+"%";
		String hql = "from Userinformation where username like '%" + name
				+ "%'";
		System.out.println(hql);

		try {
			Query query = getSession().createQuery(hql);
			List list = query.list();
			if (list == null || list.size() == 0)
				return null;
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Userinformation getUser(Integer userid) {
		// TODO Auto-generated method stub
		return (Userinformation) this.getHibernateTemplate().get(
				Userinformation.class, userid);
	}

}
