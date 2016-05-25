package com.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.metamodel.SetAttribute;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.apache.struts2.json.annotations.JSON;

import com.model.Department;
import com.model.Roletype;
import com.model.Userinformation;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IUserService;
import com.service.impl.UserService;

/*
 * @author 丁鸿
 *  
 * */
public class UserManageAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Userinformation userinformation;
	private IUserService iUserService;
	private String username;
	private String userpassword;
	private Integer userstate;
	private Integer usersex;
	private Integer departmentid;
	private Integer roleid;

	private Integer userid;
	private Map<String, Object> dataMap;
	private List<Userinformation> users;
	private int start;
	private int length;
	private int total;
	private int filter;
	private String key = "Just see see";

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public int getTotal() {
		return total;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
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

	public Userinformation getUserinformation() {
		return userinformation;
	}

	public void setUserinformation(Userinformation userinformation) {
		this.userinformation = userinformation;
	}

	public List<Userinformation> getUsers() {
		return users;
	}

	public void setUsers(List<Userinformation> users) {
		this.users = users;
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

	public IUserService getiUserService() {
		return iUserService;
	}

	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public Integer getUserstate() {
		return userstate;
	}

	public void setUserstate(Integer userstate) {
		this.userstate = userstate;
	}

	public Integer getUsersex() {
		return usersex;
	}

	public void setUsersex(Integer usersex) {
		this.usersex = usersex;
	}

	public Integer getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	@JSON(serialize = false)
	public String getKey() {
		return key;
	}

	public String addUser() {
		Userinformation userinformation = new Userinformation();
		Department department = new Department();
		Roletype roletype = new Roletype();
		department.setDepartmentid(departmentid);
		roletype.setRoleid(roleid);
		userinformation.setUsername(username);
		userinformation.setUserpwd(userpassword);
		userinformation.setUserstate(userstate);
		userinformation.setUsersex(usersex);
		userinformation.setDepartment(department);
		userinformation.setRoletype(roletype);
		iUserService.doCreate(userinformation);
		System.out.println(username + "!!!" + userpassword + "!!!" + userstate
				+ "!!!" + usersex + "!!!" + departmentid + "!!!" + roleid
				+ "!!!");
		System.out.println("添加用户！");
		return SUCCESS;
	}

	public String updateUser() throws Exception {
		Userinformation userinformation = iUserService.findById(
				Userinformation.class, userid);

		Department department = new Department();
		Roletype roletype = new Roletype();
		department.setDepartmentid(departmentid);
		roletype.setRoleid(roleid);
		userinformation.setUsername(username);
		userinformation.setUserpwd(userpassword);
		userinformation.setUserstate(userstate);
		userinformation.setUsersex(usersex);
		userinformation.setDepartment(department);
		userinformation.setRoletype(roletype);
		iUserService.saveOrUpdate(userinformation);
		System.out.println("userid:" + userid);
		System.out.println(username + "!!!" + userpassword + "!!!" + userstate
				+ "!!!" + usersex + "!!!" + departmentid + "!!!" + roleid
				+ "!!!");
		System.out.println("更新用户！");
		return SUCCESS;
	}

	public String deleteUser() throws Exception {
		Userinformation userinformation = iUserService.findById(
				Userinformation.class, userid);
		iUserService.doDelete(userinformation);
		System.out.println("删除用户成功！");
		return SUCCESS;

	}

	public String getUser() {

		System.out.println("获取用户！");
		this.userinformation = iUserService.getUser(userid);
		// this.setUsername(userinformation.getUsername());
		// this.setUserpassword(userinformation.getUserpwd());
		System.out.println("userid" + userid);
		System.out.println(userinformation.getUsername());
		System.out.println(userinformation.getUserpwd());
		// Map request = (Map) ActionContext.getContext().get("request");
		// request.put("userinformation", userinformation);
		return SUCCESS;
	}

	public String userList() throws Exception {
		this.users = iUserService.getList(Userinformation.class);
		System.out.println("用户列表！");

		List<Userinformation> data = new ArrayList<Userinformation>();
		for (int i = 0; i < users.size(); i++) {
			Userinformation user = new Userinformation();
			Department department = new Department();
			Roletype roletype = new Roletype();
			user.setUserid(this.users.get(i).getUserid());
			user.setUsername(this.users.get(i).getUsername());
			user.setUserpwd(this.users.get(i).getUserpwd());
			user.setUsersex(this.users.get(i).getUsersex());
			user.setUserstate(this.users.get(i).getUserstate());
			department.setDepartmentid(this.users.get(i).getDepartment()
					.getDepartmentid());
			roletype.setRoleid(this.users.get(i).getRoletype().getRoleid());
			user.setDepartment(department);
			user.setRoletype(roletype);

			data.add(user);
		}

		// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
		dataMap = new HashMap<String, Object>();
		total = data.size();
		System.out.println(total);
		filter = total;
		if (start + length > total) {
			dataMap.put("aaData", data.subList(start, total));

		} else {
			dataMap.put("aaData", data.subList(start, length));
		}
		/* dataMap.put("aaData", aaData); */
		dataMap.put("recordsTotal", total);
		dataMap.put("recordsFiltered", filter);
		// 返回结果
		return SUCCESS;
	}

	public String userSearch() throws Exception {
		Userinformation userinformation = new Userinformation();
		userinformation.setUsername(username);
		Department department1 = new Department();
		department1.setDepartmentid(departmentid);
		userinformation.setDepartment(department1);
		this.users = iUserService.userSearch(userinformation);
		System.out.println("获取搜索用户列表！");

		List<Userinformation> data = new ArrayList<Userinformation>();
		for (int i = 0; i < users.size(); i++) {
			Userinformation user = new Userinformation();
			Department department = new Department();
			Roletype roletype = new Roletype();
			user.setUserid(this.users.get(i).getUserid());
			user.setUsername(this.users.get(i).getUsername());
			user.setUserpwd(this.users.get(i).getUserpwd());
			user.setUsersex(this.users.get(i).getUsersex());
			user.setUserstate(this.users.get(i).getUserstate());
			department.setDepartmentid(this.users.get(i).getDepartment()
					.getDepartmentid());
			roletype.setRoleid(this.users.get(i).getRoletype().getRoleid());
			user.setDepartment(department);
			user.setRoletype(roletype);

			data.add(user);
		}

		// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
		dataMap = new HashMap<String, Object>();
		total = data.size();
		System.out.println(total);
		filter = total;
		if (start + length > total) {
			dataMap.put("aaData", data.subList(start, total));

		} else {
			dataMap.put("aaData", data.subList(start, length));
		}
		/* dataMap.put("aaData", aaData); */
		dataMap.put("recordsTotal", total);
		dataMap.put("recordsFiltered", filter);
		// 返回结果
		return SUCCESS;
	}

}
