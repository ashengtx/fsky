package com.model;

/**
 * Parameterinformation entity. @author MyEclipse Persistence Tools
 */

public class Parameterinformation implements java.io.Serializable {

	// Fields

	private Integer parameterinfoid;
	private String parametername;
	private String parametervalue;
	private Integer parametertypeid;
	private String parametertypename;

	// Constructors

	/** default constructor */
	public Parameterinformation() {
	}

	/** full constructor */
	public Parameterinformation(String parametername, String parametervalue,
			Integer parametertypeid, String parametertypename) {
		this.parametername = parametername;
		this.parametervalue = parametervalue;
		this.parametertypeid = parametertypeid;
		this.parametertypename = parametertypename;
	}

	// Property accessors

	public Integer getParameterinfoid() {
		return this.parameterinfoid;
	}

	public void setParameterinfoid(Integer parameterinfoid) {
		this.parameterinfoid = parameterinfoid;
	}

	public String getParametername() {
		return this.parametername;
	}

	public void setParametername(String parametername) {
		this.parametername = parametername;
	}

	public String getParametervalue() {
		return this.parametervalue;
	}

	public void setParametervalue(String parametervalue) {
		this.parametervalue = parametervalue;
	}

	public Integer getParametertypeid() {
		return this.parametertypeid;
	}

	public void setParametertypeid(Integer parametertypeid) {
		this.parametertypeid = parametertypeid;
	}

	public String getParametertypename() {
		return this.parametertypename;
	}

	public void setParametertypename(String parametertypename) {
		this.parametertypename = parametertypename;
	}

}