package com.model;

import java.util.Date;


/**
 * Scrap entity. @author MyEclipse Persistence Tools
 */

public class Scrap  implements java.io.Serializable {


    // Fields    

     private Integer scrapListId;
     private UserInfo userInfoByAuditorId;
     private UserInfo userInfoByScrapUserId;
     private Integer assetId;
     private Date scrapDate;
     private Date auditDate;
     private Integer scrapState;


    // Constructors

    /** default constructor */
    public Scrap() {
    }

    
    /** full constructor */
    public Scrap(UserInfo userInfoByAuditorId, UserInfo userInfoByScrapUserId, Integer assetId, Date scrapDate, Date auditDate, Integer scrapState) {
        this.userInfoByAuditorId = userInfoByAuditorId;
        this.userInfoByScrapUserId = userInfoByScrapUserId;
        this.assetId = assetId;
        this.scrapDate = scrapDate;
        this.auditDate = auditDate;
        this.scrapState = scrapState;
    }

   
    // Property accessors

    public Integer getScrapListId() {
        return this.scrapListId;
    }
    
    public void setScrapListId(Integer scrapListId) {
        this.scrapListId = scrapListId;
    }

    public UserInfo getUserInfoByAuditorId() {
        return this.userInfoByAuditorId;
    }
    
    public void setUserInfoByAuditorId(UserInfo userInfoByAuditorId) {
        this.userInfoByAuditorId = userInfoByAuditorId;
    }

    public UserInfo getUserInfoByScrapUserId() {
        return this.userInfoByScrapUserId;
    }
    
    public void setUserInfoByScrapUserId(UserInfo userInfoByScrapUserId) {
        this.userInfoByScrapUserId = userInfoByScrapUserId;
    }

    public Integer getAssetId() {
        return this.assetId;
    }
    
    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public Date getScrapDate() {
        return this.scrapDate;
    }
    
    public void setScrapDate(Date scrapDate) {
        this.scrapDate = scrapDate;
    }

    public Date getAuditDate() {
        return this.auditDate;
    }
    
    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public Integer getScrapState() {
        return this.scrapState;
    }
    
    public void setScrapState(Integer scrapState) {
        this.scrapState = scrapState;
    }
   








}