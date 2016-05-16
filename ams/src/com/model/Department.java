package com.model;

import java.util.HashSet;
import java.util.Set;


/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department  implements java.io.Serializable {


    // Fields    

     private Integer dpmId;
     private String dpmName;
     private Set dispatchListsForExportDpmId = new HashSet(0);
     private Set userInfos = new HashSet(0);
     private Set dispatchListsForImportDpmId = new HashSet(0);
     private Set assets = new HashSet(0);


    // Constructors

    /** default constructor */
    public Department() {
    }

    
    /** full constructor */
    public Department(String dpmName, Set dispatchListsForExportDpmId, Set userInfos, Set dispatchListsForImportDpmId, Set assets) {
        this.dpmName = dpmName;
        this.dispatchListsForExportDpmId = dispatchListsForExportDpmId;
        this.userInfos = userInfos;
        this.dispatchListsForImportDpmId = dispatchListsForImportDpmId;
        this.assets = assets;
    }

   
    // Property accessors

    public Integer getDpmId() {
        return this.dpmId;
    }
    
    public void setDpmId(Integer dpmId) {
        this.dpmId = dpmId;
    }

    public String getDpmName() {
        return this.dpmName;
    }
    
    public void setDpmName(String dpmName) {
        this.dpmName = dpmName;
    }

    public Set getDispatchListsForExportDpmId() {
        return this.dispatchListsForExportDpmId;
    }
    
    public void setDispatchListsForExportDpmId(Set dispatchListsForExportDpmId) {
        this.dispatchListsForExportDpmId = dispatchListsForExportDpmId;
    }

    public Set getUserInfos() {
        return this.userInfos;
    }
    
    public void setUserInfos(Set userInfos) {
        this.userInfos = userInfos;
    }

    public Set getDispatchListsForImportDpmId() {
        return this.dispatchListsForImportDpmId;
    }
    
    public void setDispatchListsForImportDpmId(Set dispatchListsForImportDpmId) {
        this.dispatchListsForImportDpmId = dispatchListsForImportDpmId;
    }

    public Set getAssets() {
        return this.assets;
    }
    
    public void setAssets(Set assets) {
        this.assets = assets;
    }
   








}