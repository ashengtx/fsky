package com.model;

import java.util.Date;


/**
 * CheckDetail entity. @author MyEclipse Persistence Tools
 */

public class CheckDetail  implements java.io.Serializable {


    // Fields    

     private Integer checkDetailId;
     private Asset asset;
     private AssetCheck assetCheck;
     private Integer checkResult;
     private Date checkTime;


    // Constructors

    /** default constructor */
    public CheckDetail() {
    }

    
    /** full constructor */
    public CheckDetail(Asset asset, AssetCheck assetCheck, Integer checkResult, Date checkTime) {
        this.asset = asset;
        this.assetCheck = assetCheck;
        this.checkResult = checkResult;
        this.checkTime = checkTime;
    }

   
    // Property accessors

    public Integer getCheckDetailId() {
        return this.checkDetailId;
    }
    
    public void setCheckDetailId(Integer checkDetailId) {
        this.checkDetailId = checkDetailId;
    }

    public Asset getAsset() {
        return this.asset;
    }
    
    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public AssetCheck getAssetCheck() {
        return this.assetCheck;
    }
    
    public void setAssetCheck(AssetCheck assetCheck) {
        this.assetCheck = assetCheck;
    }

    public Integer getCheckResult() {
        return this.checkResult;
    }
    
    public void setCheckResult(Integer checkResult) {
        this.checkResult = checkResult;
    }

    public Date getCheckTime() {
        return this.checkTime;
    }
    
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }
   








}