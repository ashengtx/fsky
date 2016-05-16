package com.model;



/**
 * AssetRepair entity. @author MyEclipse Persistence Tools
 */

public class AssetRepair  implements java.io.Serializable {


    // Fields    

     private Integer assetRepairId;
     private Asset asset;
     private UserInfo userInfo;
     private String damageCase;
     private float repairCost;
     private Integer repairState;
     private Integer befAssetState;


    // Constructors

    /** default constructor */
    public AssetRepair() {
    }

    
    /** full constructor */
    public AssetRepair(Asset asset, UserInfo userInfo, String damageCase, float repairCost, Integer repairState, Integer befAssetState) {
        this.asset = asset;
        this.userInfo = userInfo;
        this.damageCase = damageCase;
        this.repairCost = repairCost;
        this.repairState = repairState;
        this.befAssetState = befAssetState;
    }

   
    // Property accessors

    public Integer getAssetRepairId() {
        return this.assetRepairId;
    }
    
    public void setAssetRepairId(Integer assetRepairId) {
        this.assetRepairId = assetRepairId;
    }

    public Asset getAsset() {
        return this.asset;
    }
    
    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public UserInfo getUserInfo() {
        return this.userInfo;
    }
    
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getDamageCase() {
        return this.damageCase;
    }
    
    public void setDamageCase(String damageCase) {
        this.damageCase = damageCase;
    }

    public float getRepairCost() {
        return this.repairCost;
    }
    
    public void setRepairCost(float repairCost) {
        this.repairCost = repairCost;
    }

    public Integer getRepairState() {
        return this.repairState;
    }
    
    public void setRepairState(Integer repairState) {
        this.repairState = repairState;
    }

    public Integer getBefAssetState() {
        return this.befAssetState;
    }
    
    public void setBefAssetState(Integer befAssetState) {
        this.befAssetState = befAssetState;
    }
   








}