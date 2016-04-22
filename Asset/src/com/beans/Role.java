package com.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role implements java.io.Serializable {

	// Fields

	private Integer rid;
	private String rname;
	private Set userInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** full constructor */
	public Role(String rname, Set userInfos) {
		this.rname = rname;
		this.userInfos = userInfos;
	}

	// Property accessors

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getRname() {
		return this.rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Set getUserInfos() {
		return this.userInfos;
	}

	public void setUserInfos(Set userInfos) {
		this.userInfos = userInfos;
	}

}