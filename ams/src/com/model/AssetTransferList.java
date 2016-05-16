package com.model;



/**
 * AssetTransferList entity. @author MyEclipse Persistence Tools
 */

public class AssetTransferList  implements java.io.Serializable {


    // Fields    

     private Integer assetTransferListId;
     private AssetTransfer assetTransfer;
     private Asset asset;
     private UserInfo userInfo;
     private Integer receiveResult;


    // Constructors

    /** default constructor */
    public AssetTransferList() {
    }

    
    /** full constructor */
    public AssetTransferList(AssetTransfer assetTransfer, Asset asset, UserInfo userInfo, Integer receiveResult) {
        this.assetTransfer = assetTransfer;
        this.asset = asset;
        this.userInfo = userInfo;
        this.receiveResult = receiveResult;
    }

   
    // Property accessors

    public Integer getAssetTransferListId() {
        return this.assetTransferListId;
    }
    
    public void setAssetTransferListId(Integer assetTransferListId) {
        this.assetTransferListId = assetTransferListId;
    }

    public AssetTransfer getAssetTransfer() {
        return this.assetTransfer;
    }
    
    public void setAssetTransfer(AssetTransfer assetTransfer) {
        this.assetTransfer = assetTransfer;
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

    public Integer getReceiveResult() {
        return this.receiveResult;
    }
    
    public void setReceiveResult(Integer receiveResult) {
        this.receiveResult = receiveResult;
    }
   








}