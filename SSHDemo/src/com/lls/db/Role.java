package com.lls.db;

import java.util.Set;


/**
 * Role entity. @author MyEclipse Persistence Tools
 */
public class Role extends AbstractRole implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Role() {
    }

    
    /** full constructor */
    public Role(String rname, Set userInfos) {
        super(rname, userInfos);        
    }
   
}
