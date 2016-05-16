package com.model;

import java.util.Date;


/**
 * DispatchList entity. @author MyEclipse Persistence Tools
 */

public class DispatchList  implements java.io.Serializable {


    // Fields    

     private Integer dispatchId;
     private UserInfo userInfoByExportUserId;
     private Asset asset;
     private Department departmentByExportDpmId;
     private Department departmentByImportDpmId;
     private UserInfo userInfoByImportUserId;
     private Date exportDate;
     private String exportReason;
     private Integer state;
     private Date importDate;


    // Constructors

    /** default constructor */
    public DispatchList() {
    }

    
    /** full constructor */
    public DispatchList(UserInfo userInfoByExportUserId, Asset asset, Department departmentByExportDpmId, Department departmentByImportDpmId, UserInfo userInfoByImportUserId, Date exportDate, String exportReason, Integer state, Date importDate) {
        this.userInfoByExportUserId = userInfoByExportUserId;
        this.asset = asset;
        this.departmentByExportDpmId = departmentByExportDpmId;
        this.departmentByImportDpmId = departmentByImportDpmId;
        this.userInfoByImportUserId = userInfoByImportUserId;
        this.exportDate = exportDate;
        this.exportReason = exportReason;
        this.state = state;
        this.importDate = importDate;
    }

   
    // Property accessors

    public Integer getDispatchId() {
        return this.dispatchId;
    }
    
    public void setDispatchId(Integer dispatchId) {
        this.dispatchId = dispatchId;
    }

    public UserInfo getUserInfoByExportUserId() {
        return this.userInfoByExportUserId;
    }
    
    public void setUserInfoByExportUserId(UserInfo userInfoByExportUserId) {
        this.userInfoByExportUserId = userInfoByExportUserId;
    }

    public Asset getAsset() {
        return this.asset;
    }
    
    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public Department getDepartmentByExportDpmId() {
        return this.departmentByExportDpmId;
    }
    
    public void setDepartmentByExportDpmId(Department departmentByExportDpmId) {
        this.departmentByExportDpmId = departmentByExportDpmId;
    }

    public Department getDepartmentByImportDpmId() {
        return this.departmentByImportDpmId;
    }
    
    public void setDepartmentByImportDpmId(Department departmentByImportDpmId) {
        this.departmentByImportDpmId = departmentByImportDpmId;
    }

    public UserInfo getUserInfoByImportUserId() {
        return this.userInfoByImportUserId;
    }
    
    public void setUserInfoByImportUserId(UserInfo userInfoByImportUserId) {
        this.userInfoByImportUserId = userInfoByImportUserId;
    }

    public Date getExportDate() {
        return this.exportDate;
    }
    
    public void setExportDate(Date exportDate) {
        this.exportDate = exportDate;
    }

    public String getExportReason() {
        return this.exportReason;
    }
    
    public void setExportReason(String exportReason) {
        this.exportReason = exportReason;
    }

    public Integer getState() {
        return this.state;
    }
    
    public void setState(Integer state) {
        this.state = state;
    }

    public Date getImportDate() {
        return this.importDate;
    }
    
    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }
   








}