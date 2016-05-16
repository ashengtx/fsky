package com.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * AssetTransfer entity. @author MyEclipse Persistence Tools
 */

public class AssetTransfer  implements java.io.Serializable {


    // Fields    

     private Integer assetTransferId;
     private UserInfo userInfoByTransferUserId;
     private UserInfo userInfoByRecipientId;
     private Date transferBeginDate;
     private Date transferFinishDate;
     private Integer transferState;
     private Integer transferType;
     private Set assetTransferLists = new HashSet(0);


    // Constructors

    /** default constructor */
    public AssetTransfer() {
    }

    
    /** full constructor */
    public AssetTransfer(UserInfo userInfoByTransferUserId, UserInfo userInfoByRecipientId, Date transferBeginDate, Date transferFinishDate, Integer transferState, Integer transferType, Set assetTransferLists) {
        this.userInfoByTransferUserId = userInfoByTransferUserId;
        this.userInfoByRecipientId = userInfoByRecipientId;
        this.transferBeginDate = transferBeginDate;
        this.transferFinishDate = transferFinishDate;
        this.transferState = transferState;
        this.transferType = transferType;
        this.assetTransferLists = assetTransferLists;
    }

   
    // Property accessors

    public Integer getAssetTransferId() {
        return this.assetTransferId;
    }
    
    public void setAssetTransferId(Integer assetTransferId) {
        this.assetTransferId = assetTransferId;
    }

    public UserInfo getUserInfoByTransferUserId() {
        return this.userInfoByTransferUserId;
    }
    
    public void setUserInfoByTransferUserId(UserInfo userInfoByTransferUserId) {
        this.userInfoByTransferUserId = userInfoByTransferUserId;
    }

    public UserInfo getUserInfoByRecipientId() {
        return this.userInfoByRecipientId;
    }
    
    public void setUserInfoByRecipientId(UserInfo userInfoByRecipientId) {
        this.userInfoByRecipientId = userInfoByRecipientId;
    }

    public Date getTransferBeginDate() {
        return this.transferBeginDate;
    }
    
    public void setTransferBeginDate(Date transferBeginDate) {
        this.transferBeginDate = transferBeginDate;
    }

    public Date getTransferFinishDate() {
        return this.transferFinishDate;
    }
    
    public void setTransferFinishDate(Date transferFinishDate) {
        this.transferFinishDate = transferFinishDate;
    }

    public Integer getTransferState() {
        return this.transferState;
    }
    
    public void setTransferState(Integer transferState) {
        this.transferState = transferState;
    }

    public Integer getTransferType() {
        return this.transferType;
    }
    
    public void setTransferType(Integer transferType) {
        this.transferType = transferType;
    }

    public Set getAssetTransferLists() {
        return this.assetTransferLists;
    }
    
    public void setAssetTransferLists(Set assetTransferLists) {
        this.assetTransferLists = assetTransferLists;
    }
   








}