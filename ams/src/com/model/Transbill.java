package com.model;

import java.util.Date;

/**
 * Transbill entity. @author MyEclipse Persistence Tools
 */

public class Transbill implements java.io.Serializable {

	// Fields

	private Integer tbid;
	private Userinformation userinformationByDcuid;
	private Userinformation userinformationByDruid;
	private Asset asset;
	private Department departmentByDcdid;
	private Department departmentByDrdid;
	private Date outdate;
	private String outnote;
	private Integer tbstate;
	private Date inputdate;

	// Constructors

	/** default constructor */
	public Transbill() {
	}

	/** full constructor */
	public Transbill(Userinformation userinformationByDcuid,
			Userinformation userinformationByDruid, Asset asset,
			Department departmentByDcdid, Department departmentByDrdid,
			Date outdate, String outnote, Integer tbstate, Date inputdate) {
		this.userinformationByDcuid = userinformationByDcuid;
		this.userinformationByDruid = userinformationByDruid;
		this.asset = asset;
		this.departmentByDcdid = departmentByDcdid;
		this.departmentByDrdid = departmentByDrdid;
		this.outdate = outdate;
		this.outnote = outnote;
		this.tbstate = tbstate;
		this.inputdate = inputdate;
	}

	// Property accessors

	public Integer getTbid() {
		return this.tbid;
	}

	public void setTbid(Integer tbid) {
		this.tbid = tbid;
	}

	public Userinformation getUserinformationByDcuid() {
		return this.userinformationByDcuid;
	}

	public void setUserinformationByDcuid(Userinformation userinformationByDcuid) {
		this.userinformationByDcuid = userinformationByDcuid;
	}

	public Userinformation getUserinformationByDruid() {
		return this.userinformationByDruid;
	}

	public void setUserinformationByDruid(Userinformation userinformationByDruid) {
		this.userinformationByDruid = userinformationByDruid;
	}

	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Department getDepartmentByDcdid() {
		return this.departmentByDcdid;
	}

	public void setDepartmentByDcdid(Department departmentByDcdid) {
		this.departmentByDcdid = departmentByDcdid;
	}

	public Department getDepartmentByDrdid() {
		return this.departmentByDrdid;
	}

	public void setDepartmentByDrdid(Department departmentByDrdid) {
		this.departmentByDrdid = departmentByDrdid;
	}

	public Date getOutdate() {
		return this.outdate;
	}

	public void setOutdate(Date outdate) {
		this.outdate = outdate;
	}

	public String getOutnote() {
		return this.outnote;
	}

	public void setOutnote(String outnote) {
		this.outnote = outnote;
	}

	public Integer getTbstate() {
		return this.tbstate;
	}

	public void setTbstate(Integer tbstate) {
		this.tbstate = tbstate;
	}

	public Date getInputdate() {
		return this.inputdate;
	}

	public void setInputdate(Date inputdate) {
		this.inputdate = inputdate;
	}

}