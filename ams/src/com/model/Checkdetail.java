package com.model;

import java.util.Date;

/**
 * Checkdetail entity. @author MyEclipse Persistence Tools
 */

public class Checkdetail implements java.io.Serializable {

	// Fields

	private Integer cdid;
	private Checked checked;
	private Asset asset;
	private Integer cresult;
	private Date cdate;

	// Constructors

	/** default constructor */
	public Checkdetail() {
	}

	/** full constructor */
	public Checkdetail(Checked checked, Asset asset, Integer cresult, Date cdate) {
		this.checked = checked;
		this.asset = asset;
		this.cresult = cresult;
		this.cdate = cdate;
	}

	// Property accessors

	public Integer getCdid() {
		return this.cdid;
	}

	public void setCdid(Integer cdid) {
		this.cdid = cdid;
	}

	public Checked getChecked() {
		return this.checked;
	}

	public void setChecked(Checked checked) {
		this.checked = checked;
	}

	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Integer getCresult() {
		return this.cresult;
	}

	public void setCresult(Integer cresult) {
		this.cresult = cresult;
	}

	public Date getCdate() {
		return this.cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

}