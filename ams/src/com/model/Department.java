package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer departmentid;
	private String departmentname;
	private Integer deleteflag;
	private Set transbillsForDcdid = new HashSet(0);
	private Set assets = new HashSet(0);
	private Set userinformations = new HashSet(0);
	private Set transbillsForDrdid = new HashSet(0);
	private Set purchases = new HashSet(0);

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** full constructor */
	public Department(String departmentname, Integer deleteflag,
			Set transbillsForDcdid, Set assets, Set userinformations,
			Set transbillsForDrdid, Set purchases) {
		this.departmentname = departmentname;
		this.deleteflag = deleteflag;
		this.transbillsForDcdid = transbillsForDcdid;
		this.assets = assets;
		this.userinformations = userinformations;
		this.transbillsForDrdid = transbillsForDrdid;
		this.purchases = purchases;
	}

	// Property accessors

	public Integer getDepartmentid() {
		return this.departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	public String getDepartmentname() {
		return this.departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public Integer getDeleteflag() {
		return this.deleteflag;
	}

	public void setDeleteflag(Integer deleteflag) {
		this.deleteflag = deleteflag;
	}

	public Set getTransbillsForDcdid() {
		return this.transbillsForDcdid;
	}

	public void setTransbillsForDcdid(Set transbillsForDcdid) {
		this.transbillsForDcdid = transbillsForDcdid;
	}

	public Set getAssets() {
		return this.assets;
	}

	public void setAssets(Set assets) {
		this.assets = assets;
	}

	public Set getUserinformations() {
		return this.userinformations;
	}

	public void setUserinformations(Set userinformations) {
		this.userinformations = userinformations;
	}

	public Set getTransbillsForDrdid() {
		return this.transbillsForDrdid;
	}

	public void setTransbillsForDrdid(Set transbillsForDrdid) {
		this.transbillsForDrdid = transbillsForDrdid;
	}

	public Set getPurchases() {
		return this.purchases;
	}

	public void setPurchases(Set purchases) {
		this.purchases = purchases;
	}

}