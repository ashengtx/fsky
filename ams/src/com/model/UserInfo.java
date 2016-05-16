package com.model;

import java.util.HashSet;
import java.util.Set;


/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */

public class UserInfo  implements java.io.Serializable {


    // Fields    

     private Integer userId;
     private Department department;
     private Integer roleId;
     private String username;
     private String password;
     private Integer userState;
     private Integer sex;
     private Set assetsForKeeperId = new HashSet(0);
     private Set dispatchListsForExportUserId = new HashSet(0);
     private Set scrapsForAuditorId = new HashSet(0);
     private Set assetGetBacksForGetUserId = new HashSet(0);
     private Set assetTransfersForTransferUserId = new HashSet(0);
     private Set assetTransferLists = new HashSet(0);
     private Set assetRepairs = new HashSet(0);
     private Set assetTransfersForRecipientId = new HashSet(0);
     private Set assetGetBacksForBackUserId = new HashSet(0);
     private Set dispatchListsForImportUserId = new HashSet(0);
     private Set scrapsForScrapUserId = new HashSet(0);
     private Set assetChecks = new HashSet(0);
     private Set assetsForServantId = new HashSet(0);
     private Set assetsForAccounterId = new HashSet(0);


    // Constructors

    /** default constructor */
    public UserInfo() {
    }

    
    /** full constructor */
    public UserInfo(Department department, Integer roleId, String username, String password, Integer userState, Integer sex, Set assetsForKeeperId, Set dispatchListsForExportUserId, Set scrapsForAuditorId, Set assetGetBacksForGetUserId, Set assetTransfersForTransferUserId, Set assetTransferLists, Set assetRepairs, Set assetTransfersForRecipientId, Set assetGetBacksForBackUserId, Set dispatchListsForImportUserId, Set scrapsForScrapUserId, Set assetChecks, Set assetsForServantId, Set assetsForAccounterId) {
        this.department = department;
        this.roleId = roleId;
        this.username = username;
        this.password = password;
        this.userState = userState;
        this.sex = sex;
        this.assetsForKeeperId = assetsForKeeperId;
        this.dispatchListsForExportUserId = dispatchListsForExportUserId;
        this.scrapsForAuditorId = scrapsForAuditorId;
        this.assetGetBacksForGetUserId = assetGetBacksForGetUserId;
        this.assetTransfersForTransferUserId = assetTransfersForTransferUserId;
        this.assetTransferLists = assetTransferLists;
        this.assetRepairs = assetRepairs;
        this.assetTransfersForRecipientId = assetTransfersForRecipientId;
        this.assetGetBacksForBackUserId = assetGetBacksForBackUserId;
        this.dispatchListsForImportUserId = dispatchListsForImportUserId;
        this.scrapsForScrapUserId = scrapsForScrapUserId;
        this.assetChecks = assetChecks;
        this.assetsForServantId = assetsForServantId;
        this.assetsForAccounterId = assetsForAccounterId;
    }

   
    // Property accessors

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserState() {
        return this.userState;
    }
    
    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public Integer getSex() {
        return this.sex;
    }
    
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Set getAssetsForKeeperId() {
        return this.assetsForKeeperId;
    }
    
    public void setAssetsForKeeperId(Set assetsForKeeperId) {
        this.assetsForKeeperId = assetsForKeeperId;
    }

    public Set getDispatchListsForExportUserId() {
        return this.dispatchListsForExportUserId;
    }
    
    public void setDispatchListsForExportUserId(Set dispatchListsForExportUserId) {
        this.dispatchListsForExportUserId = dispatchListsForExportUserId;
    }

    public Set getScrapsForAuditorId() {
        return this.scrapsForAuditorId;
    }
    
    public void setScrapsForAuditorId(Set scrapsForAuditorId) {
        this.scrapsForAuditorId = scrapsForAuditorId;
    }

    public Set getAssetGetBacksForGetUserId() {
        return this.assetGetBacksForGetUserId;
    }
    
    public void setAssetGetBacksForGetUserId(Set assetGetBacksForGetUserId) {
        this.assetGetBacksForGetUserId = assetGetBacksForGetUserId;
    }

    public Set getAssetTransfersForTransferUserId() {
        return this.assetTransfersForTransferUserId;
    }
    
    public void setAssetTransfersForTransferUserId(Set assetTransfersForTransferUserId) {
        this.assetTransfersForTransferUserId = assetTransfersForTransferUserId;
    }

    public Set getAssetTransferLists() {
        return this.assetTransferLists;
    }
    
    public void setAssetTransferLists(Set assetTransferLists) {
        this.assetTransferLists = assetTransferLists;
    }

    public Set getAssetRepairs() {
        return this.assetRepairs;
    }
    
    public void setAssetRepairs(Set assetRepairs) {
        this.assetRepairs = assetRepairs;
    }

    public Set getAssetTransfersForRecipientId() {
        return this.assetTransfersForRecipientId;
    }
    
    public void setAssetTransfersForRecipientId(Set assetTransfersForRecipientId) {
        this.assetTransfersForRecipientId = assetTransfersForRecipientId;
    }

    public Set getAssetGetBacksForBackUserId() {
        return this.assetGetBacksForBackUserId;
    }
    
    public void setAssetGetBacksForBackUserId(Set assetGetBacksForBackUserId) {
        this.assetGetBacksForBackUserId = assetGetBacksForBackUserId;
    }

    public Set getDispatchListsForImportUserId() {
        return this.dispatchListsForImportUserId;
    }
    
    public void setDispatchListsForImportUserId(Set dispatchListsForImportUserId) {
        this.dispatchListsForImportUserId = dispatchListsForImportUserId;
    }

    public Set getScrapsForScrapUserId() {
        return this.scrapsForScrapUserId;
    }
    
    public void setScrapsForScrapUserId(Set scrapsForScrapUserId) {
        this.scrapsForScrapUserId = scrapsForScrapUserId;
    }

    public Set getAssetChecks() {
        return this.assetChecks;
    }
    
    public void setAssetChecks(Set assetChecks) {
        this.assetChecks = assetChecks;
    }

    public Set getAssetsForServantId() {
        return this.assetsForServantId;
    }
    
    public void setAssetsForServantId(Set assetsForServantId) {
        this.assetsForServantId = assetsForServantId;
    }

    public Set getAssetsForAccounterId() {
        return this.assetsForAccounterId;
    }
    
    public void setAssetsForAccounterId(Set assetsForAccounterId) {
        this.assetsForAccounterId = assetsForAccounterId;
    }
   








}