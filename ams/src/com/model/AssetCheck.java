package com.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * AssetCheck entity. @author MyEclipse Persistence Tools
 */

public class AssetCheck  implements java.io.Serializable {


    // Fields    

     private Integer assetCheckId;
     private UserInfo userInfo;
     private Date initiatorDate;
     private Integer checkState;
     private Set checkDetails = new HashSet(0);


    // Constructors

    /** default constructor */
    public AssetCheck() {
    }

    
    /** full constructor */
    public AssetCheck(UserInfo userInfo, Date initiatorDate, Integer checkState, Set checkDetails) {
        this.userInfo = userInfo;
        this.initiatorDate = initiatorDate;
        this.checkState = checkState;
        this.checkDetails = checkDetails;
    }

   
    // Property accessors

    public Integer getAssetCheckId() {
        return this.assetCheckId;
    }
    
    public void setAssetCheckId(Integer assetCheckId) {
        this.assetCheckId = assetCheckId;
    }

    public UserInfo getUserInfo() {
        return this.userInfo;
    }
    
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Date getInitiatorDate() {
        return this.initiatorDate;
    }
    
    public void setInitiatorDate(Date initiatorDate) {
        this.initiatorDate = initiatorDate;
    }

    public Integer getCheckState() {
        return this.checkState;
    }
    
    public void setCheckState(Integer checkState) {
        this.checkState = checkState;
    }

    public Set getCheckDetails() {
        return this.checkDetails;
    }
    
    public void setCheckDetails(Set checkDetails) {
        this.checkDetails = checkDetails;
    }
   








}