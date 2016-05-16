package com.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.dao.IUserInfoDao;
import com.model.UserInfo;

public class UserInfoDao extends BaseDao implements IUserInfoDao {

	@Override
	public UserInfo get(int id) {
		try {
			return super.getHibernateTemplate().get(UserInfo.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserInfo findUserInfoByName(String name) {
		// name = "%"+name+"%";
		String hql = "from UserInfo where username='" + name + "'";
		System.out.println(hql);

		try {
			Query query = super.getSession().createQuery(hql);
			List list = query.list();
			if (list == null || list.size() == 0)
				return null;
			return (UserInfo) list.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<UserInfo> findAllUserInfo() {
		String hql = "from UserInfo where status!=-1 order by id desc";
		try {
			return getHibernateTemplate().find(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<UserInfo> findUserLikeName(String name) {
		// name = "%"+name+"%";
		String hql = "from UserInfo where name like '%" + name + "%'";
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

}
