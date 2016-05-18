package com.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Purchase entity. @author MyEclipse Persistence Tools
 */

public class Purchase implements java.io.Serializable {

	// Fields

	private Integer purid;
	private Department department;
	private Userinformation userinformation;
	private Date buydate;
	private String cgyt;
	private Integer purstate;
	private Set purchasedetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Purchase() {
	}

	/** full constructor */
	public Purchase(Department department, Userinformation userinformation,
			Date buydate, String cgyt, Integer purstate, Set purchasedetails) {
		this.department = department;
		this.userinformation = userinformation;
		this.buydate = buydate;
		this.cgyt = cgyt;
		this.purstate = purstate;
		this.purchasedetails = purchasedetails;
	}

	// Property accessors

	public Integer getPurid() {
		return this.purid;
	}

	public void setPurid(Integer purid) {
		this.purid = purid;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Userinformation getUserinformation() {
		return this.userinformation;
	}

	public void setUserinformation(Userinformation userinformation) {
		this.userinformation = userinformation;
	}

	public Date getBuydate() {
		return this.buydate;
	}

	public void setBuydate(Date buydate) {
		this.buydate = buydate;
	}

	public String getCgyt() {
		return this.cgyt;
	}

	public void setCgyt(String cgyt) {
		this.cgyt = cgyt;
	}

	public Integer getPurstate() {
		return this.purstate;
	}

	public void setPurstate(Integer purstate) {
		this.purstate = purstate;
	}

	public Set getPurchasedetails() {
		return this.purchasedetails;
	}

	public void setPurchasedetails(Set purchasedetails) {
		this.purchasedetails = purchasedetails;
	}

}