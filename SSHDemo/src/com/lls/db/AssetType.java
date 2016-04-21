package com.lls.db;



/**
 * AssetType entity. @author MyEclipse Persistence Tools
 */
public class AssetType extends AbstractAssetType implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public AssetType() {
    }

    
    /** full constructor */
    public AssetType(String atcode, String atname, Integer ulId, String ulName) {
        super(atcode, atname, ulId, ulName);        
    }
   
}
