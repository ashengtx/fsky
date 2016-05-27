package com.dao;

import java.util.List;

import com.model.Department;

/**
 * 部门数据访问层接口
 * @author 李格非
 *
 */
public interface IDepartmentDao {
	/** 根据部门id得到部门对象 */
	public Department get(int id);

	/** 根据部门名称得到部门对象 */
	public Department findDepartmentByName(String name);

	/** 列出所有部门对象 */
	public List<Department> findAllDepartment();

	/** 查询部门对象 */
	public List<Department> findDepartmentLikeName(String name);
}
