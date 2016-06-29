package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Assetclass entity. @author MyEclipse Persistence Tools
 */

public class Assetclass implements java.io.Serializable {

	// Fields

	private Integer assetclassid;
	private String assetclasscoding;
	private String assetclassname;
	private Integer iassetclassid;
	private String iassetclassname;
	private Set purchasedetailsForPassetclassid = new HashSet(0);
	private Set assetsForAssetclassid = new HashSet(0);
	private Set assetsForPassetclassid = new HashSet(0);
	private Set purchasedetailsForAssetclassid = new HashSet(0);

	// Constructors

	/** default constructor */
	public Assetclass() {
	}

	/** full constructor */
	public Assetclass(String assetclasscoding, String assetclassname,
			Integer iassetclassid, String iassetclassname,
			Set purchasedetailsForPassetclassid, Set assetsForAssetclassid,
			Set assetsForPassetclassid, Set purchasedetailsForAssetclassid) {
		this.assetclasscoding = assetclasscoding;
		this.assetclassname = assetclassname;
		this.iassetclassid = iassetclassid;
		this.iassetclassname = iassetclassname;
		this.purchasedetailsForPassetclassid = purchasedetailsForPassetclassid;
		this.assetsForAssetclassid = assetsForAssetclassid;
		this.assetsForPassetclassid = assetsForPassetclassid;
		this.purchasedetailsForAssetclassid = purchasedetailsForAssetclassid;
	}

	// Property accessors

	public Integer getAssetclassid() {
		return this.assetclassid;
	}

	public void setAssetclassid(Integer assetclassid) {
		this.assetclassid = assetclassid;
	}

	public String getAssetclasscoding() {
		return this.assetclasscoding;
	}

	public void setAssetclasscoding(String assetclasscoding) {
		this.assetclasscoding = assetclasscoding;
	}

	public String getAssetclassname() {
		return this.assetclassname;
	}

	public void setAssetclassname(String assetclassname) {
		this.assetclassname = assetclassname;
	}

	public Integer getIassetclassid() {
		return this.iassetclassid;
	}

	public void setIassetclassid(Integer iassetclassid) {
		this.iassetclassid = iassetclassid;
	}

	public String getIassetclassname() {
		return this.iassetclassname;
	}

	public void setIassetclassname(String iassetclassname) {
		this.iassetclassname = iassetclassname;
	}

	public Set getPurchasedetailsForPassetclassid() {
		return this.purchasedetailsForPassetclassid;
	}

	public void setPurchasedetailsForPassetclassid(
			Set purchasedetailsForPassetclassid) {
		this.purchasedetailsForPassetclassid = purchasedetailsForPassetclassid;
	}

	public Set getAssetsForAssetclassid() {
		return this.assetsForAssetclassid;
	}

	public void setAssetsForAssetclassid(Set assetsForAssetclassid) {
		this.assetsForAssetclassid = assetsForAssetclassid;
	}

	public Set getAssetsForPassetclassid() {
		return this.assetsForPassetclassid;
	}

	public void setAssetsForPassetclassid(Set assetsForPassetclassid) {
		this.assetsForPassetclassid = assetsForPassetclassid;
	}

	public Set getPurchasedetailsForAssetclassid() {
		return this.purchasedetailsForAssetclassid;
	}

	public void setPurchasedetailsForAssetclassid(
			Set purchasedetailsForAssetclassid) {
		this.purchasedetailsForAssetclassid = purchasedetailsForAssetclassid;
	}

}