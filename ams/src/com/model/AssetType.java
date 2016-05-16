package com.model;

import java.util.HashSet;
import java.util.Set;


/**
 * AssetType entity. @author MyEclipse Persistence Tools
 */

public class AssetType  implements java.io.Serializable {


    // Fields    

     private Integer assetTypeId;
     private String assetTypeCode;
     private String assetTypeName;
     private Integer upAssetTypeId;
     private String upAssetTypeName;
     private Set assetsForAssetTypeId = new HashSet(0);
     private Set assetsForUpAssetTypeId = new HashSet(0);


    // Constructors

    /** default constructor */
    public AssetType() {
    }

    
    /** full constructor */
    public AssetType(String assetTypeCode, String assetTypeName, Integer upAssetTypeId, String upAssetTypeName, Set assetsForAssetTypeId, Set assetsForUpAssetTypeId) {
        this.assetTypeCode = assetTypeCode;
        this.assetTypeName = assetTypeName;
        this.upAssetTypeId = upAssetTypeId;
        this.upAssetTypeName = upAssetTypeName;
        this.assetsForAssetTypeId = assetsForAssetTypeId;
        this.assetsForUpAssetTypeId = assetsForUpAssetTypeId;
    }

   
    // Property accessors

    public Integer getAssetTypeId() {
        return this.assetTypeId;
    }
    
    public void setAssetTypeId(Integer assetTypeId) {
        this.assetTypeId = assetTypeId;
    }

    public String getAssetTypeCode() {
        return this.assetTypeCode;
    }
    
    public void setAssetTypeCode(String assetTypeCode) {
        this.assetTypeCode = assetTypeCode;
    }

    public String getAssetTypeName() {
        return this.assetTypeName;
    }
    
    public void setAssetTypeName(String assetTypeName) {
        this.assetTypeName = assetTypeName;
    }

    public Integer getUpAssetTypeId() {
        return this.upAssetTypeId;
    }
    
    public void setUpAssetTypeId(Integer upAssetTypeId) {
        this.upAssetTypeId = upAssetTypeId;
    }

    public String getUpAssetTypeName() {
        return this.upAssetTypeName;
    }
    
    public void setUpAssetTypeName(String upAssetTypeName) {
        this.upAssetTypeName = upAssetTypeName;
    }

    public Set getAssetsForAssetTypeId() {
        return this.assetsForAssetTypeId;
    }
    
    public void setAssetsForAssetTypeId(Set assetsForAssetTypeId) {
        this.assetsForAssetTypeId = assetsForAssetTypeId;
    }

    public Set getAssetsForUpAssetTypeId() {
        return this.assetsForUpAssetTypeId;
    }
    
    public void setAssetsForUpAssetTypeId(Set assetsForUpAssetTypeId) {
        this.assetsForUpAssetTypeId = assetsForUpAssetTypeId;
    }
   








}