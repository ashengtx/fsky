package com.lls.db;



/**
 * ParaInfo entity. @author MyEclipse Persistence Tools
 */
public class ParaInfo extends AbstractParaInfo implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public ParaInfo() {
    }

    
    /** full constructor */
    public ParaInfo(String pname, String pvalue, Integer ptid, String ptname) {
        super(pname, pvalue, ptid, ptname);        
    }
   
}
