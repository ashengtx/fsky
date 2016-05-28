package com.service.impl;

import java.util.List;

import com.dao.impl.DepartmentDao;
import com.model.Department;
import com.service.IDepartmentService;

/**
 * 部门服务实现类
 * 
 * @author 李国辉
 *
 */
public class DepartmentService extends BaseService implements
		IDepartmentService {

	private DepartmentDao departmentDao;

	public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	/**
	 * 根据部门id得到部门对象
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Department get(int id) {
		return departmentDao.get(id);
	}

	/**
	 * 根据部门名称得到部门对象
	 * 
	 * @param name
	 * @return
	 */
	@Override
	public Department getByName(String name) {
		return departmentDao.findDepartmentByName(name);
	}

	/**
	 * 创建部门
	 * 
	 * @param department
	 * @return
	 */
	@Override
	public int create(Department department) {
		if (department.getDepartmentname() == null
				|| "".equals(department.getDepartmentname()))
			return 2;
		if (getByName(department.getDepartmentname()) != null)
			return 1;

		if (!departmentDao.create(department))
			return 0;

		return 3;
	}

	@Override
	public int update(Department department) {
		departmentDao.update(department);
		return 0;
	}

	@Override
	public int delete(int departmentID) {

		return 0;
	}

	@Override
	public List<Department> findAll() {

		return null;
	}

	@Override
	public List<Department> getLikeName(String name) {

		return null;
	}

	@Override
	public Department getDepartment(int departmentID) {
		return this.departmentDao.get(departmentID);
	}

}
