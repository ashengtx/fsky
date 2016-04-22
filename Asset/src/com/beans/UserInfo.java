package com.beans;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */

public class UserInfo implements java.io.Serializable {

	// Fields

	private Integer uid;
	private Role role;
	private Department department;
	private String username;
	private String psw;
	private Integer state;
	private Integer sex;

	// Constructors

	/** default constructor */
	public UserInfo() {
	}

	/** full constructor */
	public UserInfo(Role role, Department department, String username,
			String psw, Integer state, Integer sex) {
		this.role = role;
		this.department = department;
		this.username = username;
		this.psw = psw;
		this.state = state;
		this.sex = sex;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPsw() {
		return this.psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

}