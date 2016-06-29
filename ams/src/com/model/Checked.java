package com.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Checked entity. @author MyEclipse Persistence Tools
 */

public class Checked implements java.io.Serializable {

	// Fields

	private Integer checkid;
	private Userinformation userinformation;
	private Date startdate;
	private Integer cstate;
	private Set checkdetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Checked() {
	}

	/** full constructor */
	public Checked(Userinformation userinformation, Date startdate,
			Integer cstate, Set checkdetails) {
		this.userinformation = userinformation;
		this.startdate = startdate;
		this.cstate = cstate;
		this.checkdetails = checkdetails;
	}

	// Property accessors

	public Integer getCheckid() {
		return this.checkid;
	}

	public void setCheckid(Integer checkid) {
		this.checkid = checkid;
	}

	public Userinformation getUserinformation() {
		return this.userinformation;
	}

	public void setUserinformation(Userinformation userinformation) {
		this.userinformation = userinformation;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Integer getCstate() {
		return this.cstate;
	}

	public void setCstate(Integer cstate) {
		this.cstate = cstate;
	}

	public Set getCheckdetails() {
		return this.checkdetails;
	}

	public void setCheckdetails(Set checkdetails) {
		this.checkdetails = checkdetails;
	}

}