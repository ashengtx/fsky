package com.model;

import java.util.Date;

/**
 * Zclygh entity. @author MyEclipse Persistence Tools
 */

public class Zclygh implements java.io.Serializable {

	// Fields

	private Integer lyghid;
	private Userinformation userinformationByLyuserid;
	private Userinformation userinformationByGhuserid;
	private Asset asset;
	private Date lydate;
	private Date ghdate;
	private Integer lyghstate;

	// Constructors

	/** default constructor */
	public Zclygh() {
	}

	/** full constructor */
	public Zclygh(Userinformation userinformationByLyuserid,
			Userinformation userinformationByGhuserid, Asset asset,
			Date lydate, Date ghdate, Integer lyghstate) {
		this.userinformationByLyuserid = userinformationByLyuserid;
		this.userinformationByGhuserid = userinformationByGhuserid;
		this.asset = asset;
		this.lydate = lydate;
		this.ghdate = ghdate;
		this.lyghstate = lyghstate;
	}

	// Property accessors

	public Integer getLyghid() {
		return this.lyghid;
	}

	public void setLyghid(Integer lyghid) {
		this.lyghid = lyghid;
	}

	public Userinformation getUserinformationByLyuserid() {
		return this.userinformationByLyuserid;
	}

	public void setUserinformationByLyuserid(
			Userinformation userinformationByLyuserid) {
		this.userinformationByLyuserid = userinformationByLyuserid;
	}

	public Userinformation getUserinformationByGhuserid() {
		return this.userinformationByGhuserid;
	}

	public void setUserinformationByGhuserid(
			Userinformation userinformationByGhuserid) {
		this.userinformationByGhuserid = userinformationByGhuserid;
	}

	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Date getLydate() {
		return this.lydate;
	}

	public void setLydate(Date lydate) {
		this.lydate = lydate;
	}

	public Date getGhdate() {
		return this.ghdate;
	}

	public void setGhdate(Date ghdate) {
		this.ghdate = ghdate;
	}

	public Integer getLyghstate() {
		return this.lyghstate;
	}

	public void setLyghstate(Integer lyghstate) {
		this.lyghstate = lyghstate;
	}

}