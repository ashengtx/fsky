package com.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Asset entity. @author MyEclipse Persistence Tools
 */

public class Asset implements java.io.Serializable {

	// Fields

	private Integer assetid;
	private Assetclass assetclassByPassetclassid;
	private Department department;
	private Userinformation userinformationByUseruid;
	private Userinformation userinformationByUserid;
	private Assetclass assetclassByAssetclassid;
	private Userinformation userinformationByCwuid;
	private Purchasedetail purchasedetail;
	private String cardnum;
	private Integer zkstate;
	private Integer cwstate;
	private String ggxh;
	private Integer usestate;
	private String assetname;
	private Integer cgbid;
	private Date intodate;
	private String cwcoding;
	private String assetcoding;
	private String manufacturer;
	private String provider;
	private Date insertdate;
	private String aunit;
	private Integer amount;
	private String remark;
	private float price;
	private Integer lableprint;
	private String onepath;
	private String twopath;
	private String bracode;
	private Set checkdetails = new HashSet(0);
	private Set transbills = new HashSet(0);
	private Set zclyghs = new HashSet(0);
	private Set repairses = new HashSet(0);
	private Set zctransdetails = new HashSet(0);
	private Set baofeis = new HashSet(0);

	// Constructors

	/** default constructor */
	public Asset() {
	}

	/** full constructor */
	public Asset(Assetclass assetclassByPassetclassid, Department department,
			Userinformation userinformationByUseruid,
			Userinformation userinformationByUserid,
			Assetclass assetclassByAssetclassid,
			Userinformation userinformationByCwuid,
			Purchasedetail purchasedetail, String cardnum, Integer zkstate,
			Integer cwstate, String ggxh, Integer usestate, String assetname,
			Integer cgbid, Date intodate, String cwcoding, String assetcoding,
			String manufacturer, String provider, Date insertdate,
			String aunit, Integer amount, String remark, float price,
			Integer lableprint, String onepath, String twopath, String bracode,
			Set checkdetails, Set transbills, Set zclyghs, Set repairses,
			Set zctransdetails, Set baofeis) {
		this.assetclassByPassetclassid = assetclassByPassetclassid;
		this.department = department;
		this.userinformationByUseruid = userinformationByUseruid;
		this.userinformationByUserid = userinformationByUserid;
		this.assetclassByAssetclassid = assetclassByAssetclassid;
		this.userinformationByCwuid = userinformationByCwuid;
		this.purchasedetail = purchasedetail;
		this.cardnum = cardnum;
		this.zkstate = zkstate;
		this.cwstate = cwstate;
		this.ggxh = ggxh;
		this.usestate = usestate;
		this.assetname = assetname;
		this.cgbid = cgbid;
		this.intodate = intodate;
		this.cwcoding = cwcoding;
		this.assetcoding = assetcoding;
		this.manufacturer = manufacturer;
		this.provider = provider;
		this.insertdate = insertdate;
		this.aunit = aunit;
		this.amount = amount;
		this.remark = remark;
		this.price = price;
		this.lableprint = lableprint;
		this.onepath = onepath;
		this.twopath = twopath;
		this.bracode = bracode;
		this.checkdetails = checkdetails;
		this.transbills = transbills;
		this.zclyghs = zclyghs;
		this.repairses = repairses;
		this.zctransdetails = zctransdetails;
		this.baofeis = baofeis;
	}

	// Property accessors

	public Integer getAssetid() {
		return this.assetid;
	}

	public void setAssetid(Integer assetid) {
		this.assetid = assetid;
	}

	public Assetclass getAssetclassByPassetclassid() {
		return this.assetclassByPassetclassid;
	}

	public void setAssetclassByPassetclassid(
			Assetclass assetclassByPassetclassid) {
		this.assetclassByPassetclassid = assetclassByPassetclassid;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Userinformation getUserinformationByUseruid() {
		return this.userinformationByUseruid;
	}

	public void setUserinformationByUseruid(
			Userinformation userinformationByUseruid) {
		this.userinformationByUseruid = userinformationByUseruid;
	}

	public Userinformation getUserinformationByUserid() {
		return this.userinformationByUserid;
	}

	public void setUserinformationByUserid(
			Userinformation userinformationByUserid) {
		this.userinformationByUserid = userinformationByUserid;
	}

	public Assetclass getAssetclassByAssetclassid() {
		return this.assetclassByAssetclassid;
	}

	public void setAssetclassByAssetclassid(Assetclass assetclassByAssetclassid) {
		this.assetclassByAssetclassid = assetclassByAssetclassid;
	}

	public Userinformation getUserinformationByCwuid() {
		return this.userinformationByCwuid;
	}

	public void setUserinformationByCwuid(Userinformation userinformationByCwuid) {
		this.userinformationByCwuid = userinformationByCwuid;
	}

	public Purchasedetail getPurchasedetail() {
		return this.purchasedetail;
	}

	public void setPurchasedetail(Purchasedetail purchasedetail) {
		this.purchasedetail = purchasedetail;
	}

	public String getCardnum() {
		return this.cardnum;
	}

	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}

	public Integer getZkstate() {
		return this.zkstate;
	}

	public void setZkstate(Integer zkstate) {
		this.zkstate = zkstate;
	}

	public Integer getCwstate() {
		return this.cwstate;
	}

	public void setCwstate(Integer cwstate) {
		this.cwstate = cwstate;
	}

	public String getGgxh() {
		return this.ggxh;
	}

	public void setGgxh(String ggxh) {
		this.ggxh = ggxh;
	}

	public Integer getUsestate() {
		return this.usestate;
	}

	public void setUsestate(Integer usestate) {
		this.usestate = usestate;
	}

	public String getAssetname() {
		return this.assetname;
	}

	public void setAssetname(String assetname) {
		this.assetname = assetname;
	}

	public Integer getCgbid() {
		return this.cgbid;
	}

	public void setCgbid(Integer cgbid) {
		this.cgbid = cgbid;
	}

	public Date getIntodate() {
		return this.intodate;
	}

	public void setIntodate(Date intodate) {
		this.intodate = intodate;
	}

	public String getCwcoding() {
		return this.cwcoding;
	}

	public void setCwcoding(String cwcoding) {
		this.cwcoding = cwcoding;
	}

	public String getAssetcoding() {
		return this.assetcoding;
	}

	public void setAssetcoding(String assetcoding) {
		this.assetcoding = assetcoding;
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

	public Date getInsertdate() {
		return this.insertdate;
	}

	public void setInsertdate(Date insertdate) {
		this.insertdate = insertdate;
	}

	public String getAunit() {
		return this.aunit;
	}

	public void setAunit(String aunit) {
		this.aunit = aunit;
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

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Integer getLableprint() {
		return this.lableprint;
	}

	public void setLableprint(Integer lableprint) {
		this.lableprint = lableprint;
	}

	public String getOnepath() {
		return this.onepath;
	}

	public void setOnepath(String onepath) {
		this.onepath = onepath;
	}

	public String getTwopath() {
		return this.twopath;
	}

	public void setTwopath(String twopath) {
		this.twopath = twopath;
	}

	public String getBracode() {
		return this.bracode;
	}

	public void setBracode(String bracode) {
		this.bracode = bracode;
	}

	public Set getCheckdetails() {
		return this.checkdetails;
	}

	public void setCheckdetails(Set checkdetails) {
		this.checkdetails = checkdetails;
	}

	public Set getTransbills() {
		return this.transbills;
	}

	public void setTransbills(Set transbills) {
		this.transbills = transbills;
	}

	public Set getZclyghs() {
		return this.zclyghs;
	}

	public void setZclyghs(Set zclyghs) {
		this.zclyghs = zclyghs;
	}

	public Set getRepairses() {
		return this.repairses;
	}

	public void setRepairses(Set repairses) {
		this.repairses = repairses;
	}

	public Set getZctransdetails() {
		return this.zctransdetails;
	}

	public void setZctransdetails(Set zctransdetails) {
		this.zctransdetails = zctransdetails;
	}

	public Set getBaofeis() {
		return this.baofeis;
	}

	public void setBaofeis(Set baofeis) {
		this.baofeis = baofeis;
	}

}