package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Roletype entity. @author MyEclipse Persistence Tools
 */

public class Roletype implements java.io.Serializable {

	// Fields

	private Integer roleid;
	private String rolename;
	private Set userinformations = new HashSet(0);

	// Constructors

	/** default constructor */
	public Roletype() {
	}

	/** full constructor */
	public Roletype(String rolename, Set userinformations) {
		this.rolename = rolename;
		this.userinformations = userinformations;
	}

	// Property accessors

	public Integer getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public Set getUserinformations() {
		return this.userinformations;
	}

	public void setUserinformations(Set userinformations) {
		this.userinformations = userinformations;
	}

}