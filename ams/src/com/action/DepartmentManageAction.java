package com.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.Department;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IDepartmentService;

/**
 * 部门管理Action
 * 
 * @author 李国辉
 *
 */
public class DepartmentManageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Department department;

	private IDepartmentService iDepartmentService;
	/** 部门id */
	private Integer departmentid;
	/** 部门名称 */
	private String departmentname;
	/** 删除状态 */
	private int deleteflag;
	/** 用于存放列表数据 */
	private Map<String, Object> dataMap;
	/** 部门列表 */
	private List<Department> departments;
	/** 列表开始数 */
	private int start;
	/** 每页显示条数 */
	private int length;
	/** 总条数 */
	private int total;
	/** 过滤条数 */
	private int filter;

	/**
	 * 根据部门id得到部门完整信息
	 * @return
	 */
	public String getDepartmentInfo() {
		this.department = iDepartmentService.getDepartment(departmentid);
		return SUCCESS;
	}

	/**
	 * 添加部门
	 * @return
	 */
	public String addDepartment() {
		Department department = new Department();
		department.setDepartmentname(departmentname);
		department.setDeleteflag(deleteflag);
		iDepartmentService.doCreate(department);
		return SUCCESS;
	}

	/**
	 * 更新部门信息
	 * @return
	 * @throws Exception
	 */
	public String updateDepartment() throws Exception {
		Department department = iDepartmentService.findById(Department.class,
				departmentid);
		department.setDepartmentid(departmentid);
		department.setDepartmentname(departmentname);
		department.setDeleteflag(deleteflag);
		iDepartmentService.saveOrUpdate(department);
		return SUCCESS;
	}

	/**
	 * 删除部门
	 * @return
	 * @throws Exception
	 */
	public String deleteDepartment() throws Exception {
		Department department = iDepartmentService.findById(Department.class,
				departmentid);
		department.setDeleteflag(0);
		iDepartmentService.update(department);
		return SUCCESS;
	}

	/**
	 * 显示部门列表
	 * @return
	 */
	public String departmentList() {
		this.departments = iDepartmentService.getList(Department.class);
		List<Department> data = new ArrayList<Department>();
		for (int i = 0; i < departments.size(); i++) {
			if(1==this.departments.get(i).getDeleteflag()){
				Department department = new Department();
				department.setDepartmentid(this.departments.get(i)
						.getDepartmentid());
				department.setDepartmentname(this.departments.get(i)
						.getDepartmentname());
				department.setDeleteflag(this.departments.get(i).getDeleteflag());
				data.add(department);
			}else{
				
			}
			
		}
		// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
		dataMap = new HashMap<String, Object>();
		total = data.size();
		filter = total;
		if (start + length > total) {
			dataMap.put("aaData", data.subList(start, total));

		} else {
			dataMap.put("aaData", data.subList(start, length));
		}
		dataMap.put("recordsTotal", total);
		dataMap.put("recordsFiltered", filter);
		return SUCCESS;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getFilter() {
		return filter;
	}

	public void setFilter(int filter) {
		this.filter = filter;
	}

	public Integer getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public IDepartmentService getiDepartmentService() {
		return iDepartmentService;
	}

	public void setiDepartmentService(IDepartmentService iDepartmentService) {
		this.iDepartmentService = iDepartmentService;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public int getDeleteflag() {
		return deleteflag;
	}

	public void setDeleteflag(int deleteflag) {
		this.deleteflag = deleteflag;
	}

}
