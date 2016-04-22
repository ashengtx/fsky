package com.beans;

/**
 * ParaInfo entity. @author MyEclipse Persistence Tools
 */

public class ParaInfo implements java.io.Serializable {

	// Fields

	private Integer pid;
	private String pname;
	private String pvalue;
	private Integer ptid;
	private String ptname;

	// Constructors

	/** default constructor */
	public ParaInfo() {
	}

	/** full constructor */
	public ParaInfo(String pname, String pvalue, Integer ptid, String ptname) {
		this.pname = pname;
		this.pvalue = pvalue;
		this.ptid = ptid;
		this.ptname = ptname;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPvalue() {
		return this.pvalue;
	}

	public void setPvalue(String pvalue) {
		this.pvalue = pvalue;
	}

	public Integer getPtid() {
		return this.ptid;
	}

	public void setPtid(Integer ptid) {
		this.ptid = ptid;
	}

	public String getPtname() {
		return this.ptname;
	}

	public void setPtname(String ptname) {
		this.ptname = ptname;
	}

}