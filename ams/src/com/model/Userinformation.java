package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Userinformation entity. @author MyEclipse Persistence Tools
 */

public class Userinformation implements java.io.Serializable {

	// Fields

	private Integer userid;
	private Department department;
	private Roletype roletype;
	private String username;
	private String userpwd;
	private Integer userstate;
	private Integer usersex;
	private Set assetsForUserid = new HashSet(0);
	private Set baofeisForCheckuid = new HashSet(0);
	private Set baofeisForUserid = new HashSet(0);
	private Set repairses = new HashSet(0);
	private Set zctransesForYjuserid = new HashSet(0);
	private Set purchases = new HashSet(0);
	private Set purchasedetails = new HashSet(0);
	private Set zclyghsForGhuserid = new HashSet(0);
	private Set assetsForUseruid = new HashSet(0);
	private Set zctransesForJsuserid = new HashSet(0);
	private Set assetsForCwuid = new HashSet(0);
	private Set zclyghsForLyuserid = new HashSet(0);
	private Set zctransdetails = new HashSet(0);
	private Set checkeds = new HashSet(0);
	private Set transbillsForDruid = new HashSet(0);
	private Set transbillsForDcuid = new HashSet(0);

	// Constructors

	/** default constructor */
	public Userinformation() {
	}

	/** full constructor */
	public Userinformation(Department department, Roletype roletype,
			String username, String userpwd, Integer userstate,
			Integer usersex, Set assetsForUserid, Set baofeisForCheckuid,
			Set baofeisForUserid, Set repairses, Set zctransesForYjuserid,
			Set purchases, Set purchasedetails, Set zclyghsForGhuserid,
			Set assetsForUseruid, Set zctransesForJsuserid, Set assetsForCwuid,
			Set zclyghsForLyuserid, Set zctransdetails, Set checkeds,
			Set transbillsForDruid, Set transbillsForDcuid) {
		this.department = department;
		this.roletype = roletype;
		this.username = username;
		this.userpwd = userpwd;
		this.userstate = userstate;
		this.usersex = usersex;
		this.assetsForUserid = assetsForUserid;
		this.baofeisForCheckuid = baofeisForCheckuid;
		this.baofeisForUserid = baofeisForUserid;
		this.repairses = repairses;
		this.zctransesForYjuserid = zctransesForYjuserid;
		this.purchases = purchases;
		this.purchasedetails = purchasedetails;
		this.zclyghsForGhuserid = zclyghsForGhuserid;
		this.assetsForUseruid = assetsForUseruid;
		this.zctransesForJsuserid = zctransesForJsuserid;
		this.assetsForCwuid = assetsForCwuid;
		this.zclyghsForLyuserid = zclyghsForLyuserid;
		this.zctransdetails = zctransdetails;
		this.checkeds = checkeds;
		this.transbillsForDruid = transbillsForDruid;
		this.transbillsForDcuid = transbillsForDcuid;
	}

	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Roletype getRoletype() {
		return this.roletype;
	}

	public void setRoletype(Roletype roletype) {
		this.roletype = roletype;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return this.userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public Integer getUserstate() {
		return this.userstate;
	}

	public void setUserstate(Integer userstate) {
		this.userstate = userstate;
	}

	public Integer getUsersex() {
		return this.usersex;
	}

	public void setUsersex(Integer usersex) {
		this.usersex = usersex;
	}

	public Set getAssetsForUserid() {
		return this.assetsForUserid;
	}

	public void setAssetsForUserid(Set assetsForUserid) {
		this.assetsForUserid = assetsForUserid;
	}

	public Set getBaofeisForCheckuid() {
		return this.baofeisForCheckuid;
	}

	public void setBaofeisForCheckuid(Set baofeisForCheckuid) {
		this.baofeisForCheckuid = baofeisForCheckuid;
	}

	public Set getBaofeisForUserid() {
		return this.baofeisForUserid;
	}

	public void setBaofeisForUserid(Set baofeisForUserid) {
		this.baofeisForUserid = baofeisForUserid;
	}

	public Set getRepairses() {
		return this.repairses;
	}

	public void setRepairses(Set repairses) {
		this.repairses = repairses;
	}

	public Set getZctransesForYjuserid() {
		return this.zctransesForYjuserid;
	}

	public void setZctransesForYjuserid(Set zctransesForYjuserid) {
		this.zctransesForYjuserid = zctransesForYjuserid;
	}

	public Set getPurchases() {
		return this.purchases;
	}

	public void setPurchases(Set purchases) {
		this.purchases = purchases;
	}

	public Set getPurchasedetails() {
		return this.purchasedetails;
	}

	public void setPurchasedetails(Set purchasedetails) {
		this.purchasedetails = purchasedetails;
	}

	public Set getZclyghsForGhuserid() {
		return this.zclyghsForGhuserid;
	}

	public void setZclyghsForGhuserid(Set zclyghsForGhuserid) {
		this.zclyghsForGhuserid = zclyghsForGhuserid;
	}

	public Set getAssetsForUseruid() {
		return this.assetsForUseruid;
	}

	public void setAssetsForUseruid(Set assetsForUseruid) {
		this.assetsForUseruid = assetsForUseruid;
	}

	public Set getZctransesForJsuserid() {
		return this.zctransesForJsuserid;
	}

	public void setZctransesForJsuserid(Set zctransesForJsuserid) {
		this.zctransesForJsuserid = zctransesForJsuserid;
	}

	public Set getAssetsForCwuid() {
		return this.assetsForCwuid;
	}

	public void setAssetsForCwuid(Set assetsForCwuid) {
		this.assetsForCwuid = assetsForCwuid;
	}

	public Set getZclyghsForLyuserid() {
		return this.zclyghsForLyuserid;
	}

	public void setZclyghsForLyuserid(Set zclyghsForLyuserid) {
		this.zclyghsForLyuserid = zclyghsForLyuserid;
	}

	public Set getZctransdetails() {
		return this.zctransdetails;
	}

	public void setZctransdetails(Set zctransdetails) {
		this.zctransdetails = zctransdetails;
	}

	public Set getCheckeds() {
		return this.checkeds;
	}

	public void setCheckeds(Set checkeds) {
		this.checkeds = checkeds;
	}

	public Set getTransbillsForDruid() {
		return this.transbillsForDruid;
	}

	public void setTransbillsForDruid(Set transbillsForDruid) {
		this.transbillsForDruid = transbillsForDruid;
	}

	public Set getTransbillsForDcuid() {
		return this.transbillsForDcuid;
	}

	public void setTransbillsForDcuid(Set transbillsForDcuid) {
		this.transbillsForDcuid = transbillsForDcuid;
	}

}