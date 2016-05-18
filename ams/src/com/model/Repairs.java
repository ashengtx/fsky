package com.model;

/**
 * Repairs entity. @author MyEclipse Persistence Tools
 */

public class Repairs implements java.io.Serializable {

	// Fields

	private Integer rid;
	private Userinformation userinformation;
	private Asset asset;
	private String shqk;
	private float rprice;
	private Integer rstate;
	private Integer beforestate;

	// Constructors

	/** default constructor */
	public Repairs() {
	}

	/** full constructor */
	public Repairs(Userinformation userinformation, Asset asset, String shqk,
			float rprice, Integer rstate, Integer beforestate) {
		this.userinformation = userinformation;
		this.asset = asset;
		this.shqk = shqk;
		this.rprice = rprice;
		this.rstate = rstate;
		this.beforestate = beforestate;
	}

	// Property accessors

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
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

	public String getShqk() {
		return this.shqk;
	}

	public void setShqk(String shqk) {
		this.shqk = shqk;
	}

	public float getRprice() {
		return this.rprice;
	}

	public void setRprice(float rprice) {
		this.rprice = rprice;
	}

	public Integer getRstate() {
		return this.rstate;
	}

	public void setRstate(Integer rstate) {
		this.rstate = rstate;
	}

	public Integer getBeforestate() {
		return this.beforestate;
	}

	public void setBeforestate(Integer beforestate) {
		this.beforestate = beforestate;
	}

}