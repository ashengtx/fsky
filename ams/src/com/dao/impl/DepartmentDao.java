package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.dao.IDepartmentDao;
import com.model.Department;

/**
 * 部门数据访问层实现类
 * 
 * @author 李国辉
 *
 */
public class DepartmentDao extends BaseDao implements IDepartmentDao {

	/**
	 * 根据id得到部门信息
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Department get(int id) {
		try {
			// 只能按照主键来查询
			return super.getHibernateTemplate().get(Department.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据部门名称获得部门信息
	 * 
	 * @param name
	 * @return
	 */
	@Override
	public Department findDepartmentByName(String name) {
		String hql = "from department where departmentname='" + name + "'";
		System.out.println(hql);
		try {
			// Hibernate的HQL语句返回的是一个QUery对象
			Query query = super.getSession().createQuery(hql);
			// 将Query对象query转换成集合，并且把该集合赋值给一个新的集合。
			List<Department> list = query.list();
			if (list == null || list.size() == 0)
				return null;
			return list.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 查找所有部门
	 * 
	 * @return
	 */
	@Override
	public List<Department> findAllDepartment() {
		String hql = "from department where deleteflag!=0 order by id desc";
		try {
			// 这个查询返回的是部门对象的集合
			List<Department> find = getHibernateTemplate().find(hql);
			return find;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 搜索部门
	 * 
	 * @param name
	 * @return
	 */
	@Override
	public List<Department> findDepartmentLikeName(String departmentname) {

		List<Object> condList = new ArrayList<Object>();
		String selection = "select department from Department as department where department.deleteflag = ?";
		condList.add(1);
		if (departmentname != null) {
			condList.add("%" + departmentname + "%");
			selection = selection + " and department.departmentname like ?";
		}
		Object o[] = condList.toArray();
		List find = this.getHibernateTemplate().find(selection, o);
		System.out.println(find.size());
		return find;
	}
}
