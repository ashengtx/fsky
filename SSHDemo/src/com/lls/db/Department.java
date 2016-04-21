package com.lls.db;

import java.util.Set;


/**
 * Department entity. @author MyEclipse Persistence Tools
 */
public class Department extends AbstractDepartment implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public Department() {
    }

    
    /** full constructor */
    public Department(String dname, Set userInfos) {
        super(dname, userInfos);        
    }
   
}
