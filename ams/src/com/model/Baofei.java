package com.model;

import java.util.Date;

/**
 * Baofei entity. @author MyEclipse Persistence Tools
 */

public class Baofei implements java.io.Serializable {

	// Fields

	private Integer bfid;
	private Userinformation userinformationByCheckuid;
	private Userinformation userinformationByUserid;
	private Asset asset;
	private Date bfdate;
	private Date checkdate;
	private Integer bfstate;

	// Constructors

	/** default constructor */
	public Baofei() {
	}

	/** full constructor */
	public Baofei(Userinformation userinformationByCheckuid,
			Userinformation userinformationByUserid, Asset asset, Date bfdate,
			Date checkdate, Integer bfstate) {
		this.userinformationByCheckuid = userinformationByCheckuid;
		this.userinformationByUserid = userinformationByUserid;
		this.asset = asset;
		this.bfdate = bfdate;
		this.checkdate = checkdate;
		this.bfstate = bfstate;
	}

	// Property accessors

	public Integer getBfid() {
		return this.bfid;
	}

	public void setBfid(Integer bfid) {
		this.bfid = bfid;
	}

	public Userinformation getUserinformationByCheckuid() {
		return this.userinformationByCheckuid;
	}

	public void setUserinformationByCheckuid(
			Userinformation userinformationByCheckuid) {
		this.userinformationByCheckuid = userinformationByCheckuid;
	}

	public Userinformation getUserinformationByUserid() {
		return this.userinformationByUserid;
	}

	public void setUserinformationByUserid(
			Userinformation userinformationByUserid) {
		this.userinformationByUserid = userinformationByUserid;
	}

	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Date getBfdate() {
		return this.bfdate;
	}

	public void setBfdate(Date bfdate) {
		this.bfdate = bfdate;
	}

	public Date getCheckdate() {
		return this.checkdate;
	}

	public void setCheckdate(Date checkdate) {
		this.checkdate = checkdate;
	}

	public Integer getBfstate() {
		return this.bfstate;
	}

	public void setBfstate(Integer bfstate) {
		this.bfstate = bfstate;
	}

}