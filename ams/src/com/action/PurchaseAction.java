package com.action;

import java.util.Date;

import com.model.Department;
import com.model.Purchase;
import com.model.Userinformation;
import com.opensymphony.xwork2.ActionSupport;
import com.service.impl.PurchaseService;


/*
 * @author 林连升
 * 
 * */
public class PurchaseAction extends ActionSupport{
	
	private PurchaseService purchaseService;
	private Purchase purchase;
	private Userinformation userinformation;
	private Department department;
	
	private Integer userid;			// 经办人
	private Date buydate;			// 购买日期
	private String cgyt;			// 采购用途
	private Integer departmentid;	// 部门
	private Integer purstate;		// 采购状态
	
	public String addPurchase(){
		System.out.println("addPurchase");
		System.out.println("用途 " + cgyt);
		Purchase purchase = new Purchase();
	    Userinformation userinformation = new Userinformation();
		Department department = new Department();
        department.setDepartmentid(departmentid);
        userinformation.setUserid(userid);
		purchase.setBuydate(buydate);
		purchase.setCgyt(cgyt);
		purchase.setPurstate(purstate);
		purchase.setDepartment(department);
		purchase.setUserinformation(userinformation);
		System.out.println(purchase.getBuydate());
		System.out.println(purchase.getPurstate());
		purchaseService.creat(purchase);
		return SUCCESS;
	}
	
	public PurchaseService getPurchaseService() {
		return purchaseService;
	}

	public void setPurchaseService(PurchaseService purchaseService) {
		this.purchaseService = purchaseService;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public Userinformation getUserinformation() {
		return userinformation;
	}

	public void setUserinformation(Userinformation userinformation) {
		this.userinformation = userinformation;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Date getBuydate() {
		return buydate;
	}

	public void setBuydate(Date buydate) {
		this.buydate = buydate;
	}

	public String getCgyt() {
		return cgyt;
	}

	public void setCgyt(String cgyt) {
		this.cgyt = cgyt;
	}

	public Integer getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	public Integer getPurstate() {
		return purstate;
	}

	public void setPurstate(Integer purstate) {
		this.purstate = purstate;
	}
	
	
}
