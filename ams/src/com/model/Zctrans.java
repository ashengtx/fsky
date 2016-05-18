package com.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Zctrans entity. @author MyEclipse Persistence Tools
 */

public class Zctrans implements java.io.Serializable {

	// Fields

	private Integer transid;
	private Userinformation userinformationByJsuserid;
	private Userinformation userinformationByYjuserid;
	private Date startdate;
	private Date enddate;
	private Integer transtate;
	private Integer trantype;
	private Set zctransdetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Zctrans() {
	}

	/** full constructor */
	public Zctrans(Userinformation userinformationByJsuserid,
			Userinformation userinformationByYjuserid, Date startdate,
			Date enddate, Integer transtate, Integer trantype,
			Set zctransdetails) {
		this.userinformationByJsuserid = userinformationByJsuserid;
		this.userinformationByYjuserid = userinformationByYjuserid;
		this.startdate = startdate;
		this.enddate = enddate;
		this.transtate = transtate;
		this.trantype = trantype;
		this.zctransdetails = zctransdetails;
	}

	// Property accessors

	public Integer getTransid() {
		return this.transid;
	}

	public void setTransid(Integer transid) {
		this.transid = transid;
	}

	public Userinformation getUserinformationByJsuserid() {
		return this.userinformationByJsuserid;
	}

	public void setUserinformationByJsuserid(
			Userinformation userinformationByJsuserid) {
		this.userinformationByJsuserid = userinformationByJsuserid;
	}

	public Userinformation getUserinformationByYjuserid() {
		return this.userinformationByYjuserid;
	}

	public void setUserinformationByYjuserid(
			Userinformation userinformationByYjuserid) {
		this.userinformationByYjuserid = userinformationByYjuserid;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public Integer getTranstate() {
		return this.transtate;
	}

	public void setTranstate(Integer transtate) {
		this.transtate = transtate;
	}

	public Integer getTrantype() {
		return this.trantype;
	}

	public void setTrantype(Integer trantype) {
		this.trantype = trantype;
	}

	public Set getZctransdetails() {
		return this.zctransdetails;
	}

	public void setZctransdetails(Set zctransdetails) {
		this.zctransdetails = zctransdetails;
	}

}