package com.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * Asset entity. @author MyEclipse Persistence Tools
 */

public class Asset  implements java.io.Serializable {


    // Fields    

     private Integer assetId;
     private UserInfo userInfoByServantId;
     private AssetType assetTypeByUpAssetTypeId;
     private Department department;
     private AssetType assetTypeByAssetTypeId;
     private UserInfo userInfoByAccounterId;
     private UserInfo userInfoByKeeperId;
     private String cardNum;
     private Integer libraryState;
     private Integer ifEntry;
     private String specification;
     private Integer userState;
     private String assetName;
     private Date entryDate;
     private String financeCode;
     private String assetCode;
     private String producer;
     private String supplier;
     private Date storageTime;
     private float unit;
     private Integer amount;
     private String note;
     private float price;
     private Integer labelIfPrint;
     private String odLabelPath;
     private String barcode;
     private Set assetRepairs = new HashSet(0);
     private Set dispatchLists = new HashSet(0);
     private Set checkDetails = new HashSet(0);
     private Set assetTransferLists = new HashSet(0);
     private Set assetGetBacks = new HashSet(0);


    // Constructors

    /** default constructor */
    public Asset() {
    }

    
    /** full constructor */
    public Asset(UserInfo userInfoByServantId, AssetType assetTypeByUpAssetTypeId, Department department, AssetType assetTypeByAssetTypeId, UserInfo userInfoByAccounterId, UserInfo userInfoByKeeperId, String cardNum, Integer libraryState, Integer ifEntry, String specification, Integer userState, String assetName, Date entryDate, String financeCode, String assetCode, String producer, String supplier, Date storageTime, float unit, Integer amount, String note, float price, Integer labelIfPrint, String odLabelPath, String barcode, Set assetRepairs, Set dispatchLists, Set checkDetails, Set assetTransferLists, Set assetGetBacks) {
        this.userInfoByServantId = userInfoByServantId;
        this.assetTypeByUpAssetTypeId = assetTypeByUpAssetTypeId;
        this.department = department;
        this.assetTypeByAssetTypeId = assetTypeByAssetTypeId;
        this.userInfoByAccounterId = userInfoByAccounterId;
        this.userInfoByKeeperId = userInfoByKeeperId;
        this.cardNum = cardNum;
        this.libraryState = libraryState;
        this.ifEntry = ifEntry;
        this.specification = specification;
        this.userState = userState;
        this.assetName = assetName;
        this.entryDate = entryDate;
        this.financeCode = financeCode;
        this.assetCode = assetCode;
        this.producer = producer;
        this.supplier = supplier;
        this.storageTime = storageTime;
        this.unit = unit;
        this.amount = amount;
        this.note = note;
        this.price = price;
        this.labelIfPrint = labelIfPrint;
        this.odLabelPath = odLabelPath;
        this.barcode = barcode;
        this.assetRepairs = assetRepairs;
        this.dispatchLists = dispatchLists;
        this.checkDetails = checkDetails;
        this.assetTransferLists = assetTransferLists;
        this.assetGetBacks = assetGetBacks;
    }

   
    // Property accessors

    public Integer getAssetId() {
        return this.assetId;
    }
    
    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public UserInfo getUserInfoByServantId() {
        return this.userInfoByServantId;
    }
    
    public void setUserInfoByServantId(UserInfo userInfoByServantId) {
        this.userInfoByServantId = userInfoByServantId;
    }

    public AssetType getAssetTypeByUpAssetTypeId() {
        return this.assetTypeByUpAssetTypeId;
    }
    
    public void setAssetTypeByUpAssetTypeId(AssetType assetTypeByUpAssetTypeId) {
        this.assetTypeByUpAssetTypeId = assetTypeByUpAssetTypeId;
    }

    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

    public AssetType getAssetTypeByAssetTypeId() {
        return this.assetTypeByAssetTypeId;
    }
    
    public void setAssetTypeByAssetTypeId(AssetType assetTypeByAssetTypeId) {
        this.assetTypeByAssetTypeId = assetTypeByAssetTypeId;
    }

    public UserInfo getUserInfoByAccounterId() {
        return this.userInfoByAccounterId;
    }
    
    public void setUserInfoByAccounterId(UserInfo userInfoByAccounterId) {
        this.userInfoByAccounterId = userInfoByAccounterId;
    }

    public UserInfo getUserInfoByKeeperId() {
        return this.userInfoByKeeperId;
    }
    
    public void setUserInfoByKeeperId(UserInfo userInfoByKeeperId) {
        this.userInfoByKeeperId = userInfoByKeeperId;
    }

    public String getCardNum() {
        return this.cardNum;
    }
    
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public Integer getLibraryState() {
        return this.libraryState;
    }
    
    public void setLibraryState(Integer libraryState) {
        this.libraryState = libraryState;
    }

    public Integer getIfEntry() {
        return this.ifEntry;
    }
    
    public void setIfEntry(Integer ifEntry) {
        this.ifEntry = ifEntry;
    }

    public String getSpecification() {
        return this.specification;
    }
    
    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Integer getUserState() {
        return this.userState;
    }
    
    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public String getAssetName() {
        return this.assetName;
    }
    
    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public Date getEntryDate() {
        return this.entryDate;
    }
    
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getFinanceCode() {
        return this.financeCode;
    }
    
    public void setFinanceCode(String financeCode) {
        this.financeCode = financeCode;
    }

    public String getAssetCode() {
        return this.assetCode;
    }
    
    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public String getProducer() {
        return this.producer;
    }
    
    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getSupplier() {
        return this.supplier;
    }
    
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Date getStorageTime() {
        return this.storageTime;
    }
    
    public void setStorageTime(Date storageTime) {
        this.storageTime = storageTime;
    }

    public float getUnit() {
        return this.unit;
    }
    
    public void setUnit(float unit) {
        this.unit = unit;
    }

    public Integer getAmount() {
        return this.amount;
    }
    
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    public float getPrice() {
        return this.price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getLabelIfPrint() {
        return this.labelIfPrint;
    }
    
    public void setLabelIfPrint(Integer labelIfPrint) {
        this.labelIfPrint = labelIfPrint;
    }

    public String getOdLabelPath() {
        return this.odLabelPath;
    }
    
    public void setOdLabelPath(String odLabelPath) {
        this.odLabelPath = odLabelPath;
    }

    public String getBarcode() {
        return this.barcode;
    }
    
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Set getAssetRepairs() {
        return this.assetRepairs;
    }
    
    public void setAssetRepairs(Set assetRepairs) {
        this.assetRepairs = assetRepairs;
    }

    public Set getDispatchLists() {
        return this.dispatchLists;
    }
    
    public void setDispatchLists(Set dispatchLists) {
        this.dispatchLists = dispatchLists;
    }

    public Set getCheckDetails() {
        return this.checkDetails;
    }
    
    public void setCheckDetails(Set checkDetails) {
        this.checkDetails = checkDetails;
    }

    public Set getAssetTransferLists() {
        return this.assetTransferLists;
    }
    
    public void setAssetTransferLists(Set assetTransferLists) {
        this.assetTransferLists = assetTransferLists;
    }

    public Set getAssetGetBacks() {
        return this.assetGetBacks;
    }
    
    public void setAssetGetBacks(Set assetGetBacks) {
        this.assetGetBacks = assetGetBacks;
    }
   








}