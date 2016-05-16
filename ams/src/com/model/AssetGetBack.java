package com.model;

import java.util.Date;


/**
 * AssetGetBack entity. @author MyEclipse Persistence Tools
 */

public class AssetGetBack  implements java.io.Serializable {


    // Fields    

     private Integer getBackId;
     private UserInfo userInfoByGetUserId;
     private Asset asset;
     private UserInfo userInfoByBackUserId;
     private Date getTime;
     private Date backTime;
     private Integer getBackState;


    // Constructors

    /** default constructor */
    public AssetGetBack() {
    }

    
    /** full constructor */
    public AssetGetBack(UserInfo userInfoByGetUserId, Asset asset, UserInfo userInfoByBackUserId, Date getTime, Date backTime, Integer getBackState) {
        this.userInfoByGetUserId = userInfoByGetUserId;
        this.asset = asset;
        this.userInfoByBackUserId = userInfoByBackUserId;
        this.getTime = getTime;
        this.backTime = backTime;
        this.getBackState = getBackState;
    }

   
    // Property accessors

    public Integer getGetBackId() {
        return this.getBackId;
    }
    
    public void setGetBackId(Integer getBackId) {
        this.getBackId = getBackId;
    }

    public UserInfo getUserInfoByGetUserId() {
        return this.userInfoByGetUserId;
    }
    
    public void setUserInfoByGetUserId(UserInfo userInfoByGetUserId) {
        this.userInfoByGetUserId = userInfoByGetUserId;
    }

    public Asset getAsset() {
        return this.asset;
    }
    
    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public UserInfo getUserInfoByBackUserId() {
        return this.userInfoByBackUserId;
    }
    
    public void setUserInfoByBackUserId(UserInfo userInfoByBackUserId) {
        this.userInfoByBackUserId = userInfoByBackUserId;
    }

    public Date getGetTime() {
        return this.getTime;
    }
    
    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }

    public Date getBackTime() {
        return this.backTime;
    }
    
    public void setBackTime(Date backTime) {
        this.backTime = backTime;
    }

    public Integer getGetBackState() {
        return this.getBackState;
    }
    
    public void setGetBackState(Integer getBackState) {
        this.getBackState = getBackState;
    }
   








}