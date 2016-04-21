package com.lls.db;



/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */
public class UserInfo extends AbstractUserInfo implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public UserInfo() {
    }

    
    /** full constructor */
    public UserInfo(Role role, Department department, String username, String psw, Integer state, Integer sex) {
        super(role, department, username, psw, state, sex);        
    }
   
}
