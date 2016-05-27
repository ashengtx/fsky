package com.dao.impl;

import java.util.ArrayList;
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

	@Override
	public List<Userinformation> userSearch(String username) {
		List<Object> condList = new ArrayList<Object>();
		condList.add("%" + username + "%");
		Object o[] = condList.toArray();
		return this
				.getHibernateTemplate()
				.find("select userinformation from Userinformation as userinformation where userinformation.username like ?",
						o);

	}

	@Override
	public List<Userinformation> getUserList(String username,
			Integer userstate, Integer departmentid, Integer roleid) {
		List<Object> condList = new ArrayList<Object>();
		condList.add(3);
		String selection = "select userinformation from Userinformation as userinformation where userinformation.userstate!=?";
		if (userstate != null  && !userstate.equals("")) {
			condList.add(userstate);
			selection = selection + " and userinformation.userstate=? ";
		}
		if (departmentid != null  && !departmentid.equals("")) {
			condList.add(departmentid);
			selection = selection
					+ " and userinformation.department.departmentid=? ";
		}
		if (roleid != null  && !roleid.equals("") ) {
			condList.add(roleid);
			selection = selection + " and userinformation.roletype.roleid=? ";
		}
		if (username != null  && !username.equals("")) {

			condList.add("%" + username + "%");
			selection = selection + " and userinformation.username like ?";
		}
		Object o[] = condList.toArray();
		System.out.println("sql:"+selection);
		return this.getHibernateTemplate().find(selection, o);
	}

}
