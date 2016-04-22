package com.beans;

/**
 * AssetType entity. @author MyEclipse Persistence Tools
 */

public class AssetType implements java.io.Serializable {

	// Fields

	private Integer atid;
	private String atcode;
	private String atname;
	private Integer ulId;
	private String ulName;

	// Constructors

	/** default constructor */
	public AssetType() {
	}

	/** full constructor */
	public AssetType(String atcode, String atname, Integer ulId, String ulName) {
		this.atcode = atcode;
		this.atname = atname;
		this.ulId = ulId;
		this.ulName = ulName;
	}

	// Property accessors

	public Integer getAtid() {
		return this.atid;
	}

	public void setAtid(Integer atid) {
		this.atid = atid;
	}

	public String getAtcode() {
		return this.atcode;
	}

	public void setAtcode(String atcode) {
		this.atcode = atcode;
	}

	public String getAtname() {
		return this.atname;
	}

	public void setAtname(String atname) {
		this.atname = atname;
	}

	public Integer getUlId() {
		return this.ulId;
	}

	public void setUlId(Integer ulId) {
		this.ulId = ulId;
	}

	public String getUlName() {
		return this.ulName;
	}

	public void setUlName(String ulName) {
		this.ulName = ulName;
	}

}