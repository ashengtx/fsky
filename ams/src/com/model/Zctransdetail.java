package com.model;

import java.util.Date;

/**
 * Zctransdetail entity. @author MyEclipse Persistence Tools
 */

public class Zctransdetail implements java.io.Serializable {

	// Fields

	private Integer tdid;
	private Userinformation userinformation;
	private Asset asset;
	private Zctrans zctrans;
	private Integer jsresult;
	private Date jsstate;

	// Constructors

	/** default constructor */
	public Zctransdetail() {
	}

	/** full constructor */
	public Zctransdetail(Userinformation userinformation, Asset asset,
			Zctrans zctrans, Integer jsresult, Date jsstate) {
		this.userinformation = userinformation;
		this.asset = asset;
		this.zctrans = zctrans;
		this.jsresult = jsresult;
		this.jsstate = jsstate;
	}

	// Property accessors

	public Integer getTdid() {
		return this.tdid;
	}

	public void setTdid(Integer tdid) {
		this.tdid = tdid;
	}

	public Userinformation getUserinformation() {
		return this.userinformation;
	}

	public void setUserinformation(Userinformation userinformation) {
		this.userinformation = userinformation;
	}

	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Zctrans getZctrans() {
		return this.zctrans;
	}

	public void setZctrans(Zctrans zctrans) {
		this.zctrans = zctrans;
	}

	public Integer getJsresult() {
		return this.jsresult;
	}

	public void setJsresult(Integer jsresult) {
		this.jsresult = jsresult;
	}

	public Date getJsstate() {
		return this.jsstate;
	}

	public void setJsstate(Date jsstate) {
		this.jsstate = jsstate;
	}

}