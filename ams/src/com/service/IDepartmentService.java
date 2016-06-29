package com.service;

import java.util.List;

import com.model.Department;

/**
 * 部门服务接口
 * @author 李国辉
 *
 */
public interface IDepartmentService extends IBaseService {
	/** 根据id得到部门对象 */
	public Department get(int id);

	/** 根据名称得到部门对象 */
	public Department getByName(String name);

	/** 创建部门对象 */
	public int create(Department department);

	/** 更新部门 */
	public int update(Department department);

	/** 根据id删除部门 */
	public int delete(int departmentID);

	/** 得到所有部门 */
	public List<Department> findAll();

	/** 根据查询得到部门 */
	public List<Department> getLikeName(String name);

	/** 根据id得到部门 */
	public Department getDepartment(int departmentID);
}
