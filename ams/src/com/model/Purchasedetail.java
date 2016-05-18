package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Purchasedetail entity. @author MyEclipse Persistence Tools
 */

public class Purchasedetail implements java.io.Serializable {

	// Fields

	private Integer pdid;
	private Assetclass assetclassByPassetclassid;
	private Purchase purchase;
	private Userinformation userinformation;
	private Assetclass assetclassByAssetclassid;
	private String punit;
	private String zcxh;
	private String assetname;
	private Integer amount;
	private String remark;
	private String manufacturer;
	private String provider;
	private float price;
	private Set assets = new HashSet(0);

	// Constructors

	/** default constructor */
	public Purchasedetail() {
	}

	/** full constructor */
	public Purchasedetail(Assetclass assetclassByPassetclassid,
			Purchase purchase, Userinformation userinformation,
			Assetclass assetclassByAssetclassid, String punit, String zcxh,
			String assetname, Integer amount, String remark,
			String manufacturer, String provider, float price, Set assets) {
		this.assetclassByPassetclassid = assetclassByPassetclassid;
		this.purchase = purchase;
		this.userinformation = userinformation;
		this.assetclassByAssetclassid = assetclassByAssetclassid;
		this.punit = punit;
		this.zcxh = zcxh;
		this.assetname = assetname;
		this.amount = amount;
		this.remark = remark;
		this.manufacturer = manufacturer;
		this.provider = provider;
		this.price = price;
		this.assets = assets;
	}

	// Property accessors

	public Integer getPdid() {
		return this.pdid;
	}

	public void setPdid(Integer pdid) {
		this.pdid = pdid;
	}

	public Assetclass getAssetclassByPassetclassid() {
		return this.assetclassByPassetclassid;
	}

	public void setAssetclassByPassetclassid(
			Assetclass assetclassByPassetclassid) {
		this.assetclassByPassetclassid = assetclassByPassetclassid;
	}

	public Purchase getPurchase() {
		return this.purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public Userinformation getUserinformation() {
		return this.userinformation;
	}

	public void setUserinformation(Userinformation userinformation) {
		this.userinformation = userinformation;
	}

	public Assetclass getAssetclassByAssetclassid() {
		return this.assetclassByAssetclassid;
	}

	public void setAssetclassByAssetclassid(Assetclass assetclassByAssetclassid) {
		this.assetclassByAssetclassid = assetclassByAssetclassid;
	}

	public String getPunit() {
		return this.punit;
	}

	public void setPunit(String punit) {
		this.punit = punit;
	}

	public String getZcxh() {
		return this.zcxh;
	}

	public void setZcxh(String zcxh) {
		this.zcxh = zcxh;
	}

	public String getAssetname() {
		return this.assetname;
	}

	public void setAssetname(String assetname) {
		this.assetname = assetname;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Set getAssets() {
		return this.assets;
	}

	public void setAssets(Set assets) {
		this.assets = assets;
	}

}