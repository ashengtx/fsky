package com.model;



/**
 * ParamInfo entity. @author MyEclipse Persistence Tools
 */

public class ParamInfo  implements java.io.Serializable {


    // Fields    

     private Integer paramId;
     private String paramName;
     private String paramValue;
     private Integer paramTypeId;
     private String paramTypeName;


    // Constructors

    /** default constructor */
    public ParamInfo() {
    }

    
    /** full constructor */
    public ParamInfo(String paramName, String paramValue, Integer paramTypeId, String paramTypeName) {
        this.paramName = paramName;
        this.paramValue = paramValue;
        this.paramTypeId = paramTypeId;
        this.paramTypeName = paramTypeName;
    }

   
    // Property accessors

    public Integer getParamId() {
        return this.paramId;
    }
    
    public void setParamId(Integer paramId) {
        this.paramId = paramId;
    }

    public String getParamName() {
        return this.paramName;
    }
    
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamValue() {
        return this.paramValue;
    }
    
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public Integer getParamTypeId() {
        return this.paramTypeId;
    }
    
    public void setParamTypeId(Integer paramTypeId) {
        this.paramTypeId = paramTypeId;
    }

    public String getParamTypeName() {
        return this.paramTypeName;
    }
    
    public void setParamTypeName(String paramTypeName) {
        this.paramTypeName = paramTypeName;
    }
   








}