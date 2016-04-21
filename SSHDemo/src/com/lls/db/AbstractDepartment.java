package com.lls.db;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractDepartment entity provides the base persistence definition of the Department entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDepartment  implements java.io.Serializable {


    // Fields    

     private Integer did;
     private String dname;
     private Set userInfos = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractDepartment() {
    }

    
    /** full constructor */
    public AbstractDepartment(String dname, Set userInfos) {
        this.dname = dname;
        this.userInfos = userInfos;
    }

   
    // Property accessors

    public Integer getDid() {
        return this.did;
    }
    
    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return this.dname;
    }
    
    public void setDname(String dname) {
        this.dname = dname;
    }

    public Set getUserInfos() {
        return this.userInfos;
    }
    
    public void setUserInfos(Set userInfos) {
        this.userInfos = userInfos;
    }
   








}