package com.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.Assetclass;
import com.model.Department;
import com.model.Purchase;
import com.model.Purchasedetail;
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
	private Purchasedetail purchasedetail;
	private Userinformation userinformation;
	private Department department;
	private Assetclass assetclass;
	
	private List<Purchase> purchases;
	private List<Purchasedetail> purchasedetails;
	private int start;  
    private int length; 
	private Map<String,Object> dataMap;  
	
	// purchase
	private Integer userid;			// 经办人
	private Date buydate;			// 购买日期
	private String cgyt;			// 采购用途
	private Integer departmentid;	// 部门
	private Integer purstate;		// 采购状态
	
	// purchasedetail
	private Integer assetclassid;
	private Integer passetclassid;
	private Integer purid;
	private String punit;
	private String zcxh;
	private String assetname;
	private Integer amount;
	private String remark;
	private String manufacturer;
	private String provider;
	private Float price;
	private Integer pdid;
	
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
		purchaseService.create(purchase);
		return SUCCESS;
	}
	
	public String getPur() throws Exception{
		System.out.println("getPur");
		this.purchase = purchaseService.findById(Purchase.class, purid);
		if(this.purchase.getPurstate()==0)
		{
			return "update";
		}
		else {
			return "check";
		}
	}
	public String updatePurchase() {
		System.out.println("udpatePurchase");
		System.out.println("purid: " + purid + " buydate: " + buydate + " departmentid: " + departmentid + " userid: " + userid + " cgyt: " +
				cgyt + " purstate: " + purstate);
		Purchase purchase = new Purchase();
	    Userinformation userinformation = new Userinformation();
		Department department = new Department();
        department.setDepartmentid(departmentid);
        userinformation.setUserid(userid);
        purchase.setPurid(purid);
		purchase.setBuydate(buydate);
		purchase.setCgyt(cgyt);
		purchase.setPurstate(purstate);
		purchase.setDepartment(department);
		purchase.setUserinformation(userinformation);
		purchaseService.saveOrUpdate(purchase);
		return SUCCESS;
	}
	public String addPurchasedetail() {
		System.out.println("addPurchasedetail");
		Purchasedetail purchasedetail = new Purchasedetail();
		Purchase purchase = new Purchase();
		Assetclass assetclass = new Assetclass();
		Assetclass passetclass = new Assetclass();
	    Userinformation userinformation = new Userinformation();
		purchase.setPurid(purid);
		assetclass.setAssetclassid(assetclassid);
		passetclass.setAssetclassid(passetclassid);
        userinformation.setUserid(userid);
		purchasedetail.setAssetclassByAssetclassid(assetclass);
		purchasedetail.setAssetclassByPassetclassid(passetclass);
		purchasedetail.setUserinformation(userinformation);
		purchasedetail.setPurchase(purchase);
		purchasedetail.setAmount(amount);
		purchasedetail.setAssetname(assetname);
		purchasedetail.setManufacturer(manufacturer);
		purchasedetail.setPrice(price);
		purchasedetail.setProvider(provider);
		purchasedetail.setPunit(punit);
		purchasedetail.setRemark(remark);
		purchasedetail.setZcxh(zcxh);
		purchaseService.create(purchasedetail);
		return SUCCESS;
	}
	
	public String getPurD() throws Exception {
		System.out.println("getPurD");
		this.purchasedetail = purchaseService.findById(Purchasedetail.class, pdid);
		return SUCCESS;
	}
	
	public String purchaseList(){  
		System.out.println("purchaseList");
	    this.purchases = purchaseService.findPurchase(departmentid, purstate);
	    List<Object> aaData = new ArrayList<Object>();
	    for(int i = 0; i < this.purchases.size(); i++)
	    {    
	        Purchase purchase = new Purchase();
		    Userinformation userinformation = new Userinformation();
			Department department = new Department();
			userinformation.setUserid(this.purchases.get(i).getUserinformation().getUserid());
	        department.setDepartmentid(this.purchases.get(i).getDepartment().getDepartmentid());
	
			purchase.setPurid(this.purchases.get(i).getPurid());
			purchase.setBuydate(this.purchases.get(i).getBuydate());
			purchase.setCgyt(this.purchases.get(i).getCgyt());
			purchase.setPurstate(this.purchases.get(i).getPurstate());
			purchase.setDepartment(department);
			purchase.setUserinformation(userinformation);
	    	aaData.add(purchase);  	
	    }
	    int recordsTotal;
	    int recordsFiltered;
	    // dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据  
        dataMap = new HashMap<String, Object>(); 
        recordsTotal = aaData.size();
        recordsFiltered = recordsTotal;
        if(start + length > recordsTotal){
            dataMap.put("aaData", aaData.subList(start,recordsTotal)); 
        }
        else{
        	dataMap.put("aaData", aaData.subList(start,length)); 
        }
        dataMap.put("recordsTotal", recordsTotal); 
        dataMap.put("recordsFiltered", recordsFiltered); 
        return SUCCESS;  
    }
	
	public String purchasedetailList() {
		System.out.println("purchasedetailList");
		System.out.println(purid);
		//System.out.println(assetname);
		/*this.purchasedetails = purchaseService.findPurchasedetail(purid,assetname);*/
		this.purchasedetails = purchaseService.getPurchasedetailList(purid);
	    List<Object> aaData = new ArrayList<Object>();
	    System.out.println(this.purchasedetails.size());
	    for(int i = 0; i < this.purchasedetails.size(); i++)
	    {   
	    	System.out.println();
	    	Purchasedetail purchasedetail = new Purchasedetail();
	    	Purchase purchase = new Purchase();
			Assetclass assetclass = new Assetclass();
			Assetclass passetclass = new Assetclass();
		    Userinformation userinformation = new Userinformation();
		    purchase.setPurid(this.purchasedetails.get(i).getPurchase().getPurid());
		    assetclass.setAssetclassid(this.purchasedetails.get(i).getAssetclassByAssetclassid().getAssetclassid());
		    passetclass.setAssetclassid(this.purchasedetails.get(i).getAssetclassByPassetclassid().getAssetclassid());
			userinformation.setUserid(this.purchasedetails.get(i).getUserinformation().getUserid());
	       
			purchasedetail.setAssetclassByAssetclassid(assetclass);
			purchasedetail.setAssetclassByPassetclassid(passetclass);
			purchasedetail.setUserinformation(userinformation);
			purchasedetail.setPurchase(purchase);
			purchasedetail.setPdid(this.purchasedetails.get(i).getPdid());
			purchasedetail.setAssetname(this.purchasedetails.get(i).getAssetname());
			purchasedetail.setPrice(this.purchasedetails.get(i).getPrice());
		
	    	aaData.add(purchasedetail);  	
	    }
	    int recordsTotal;
	    int recordsFiltered;
	    // dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据  
        dataMap = new HashMap<String, Object>(); 
        recordsTotal = aaData.size();
        recordsFiltered = recordsTotal;
        if(start+length>recordsTotal){
            dataMap.put("aaData", aaData.subList(start,recordsTotal)); 
        }
        else{
        	dataMap.put("aaData", aaData.subList(start,length)); 
        }
        dataMap.put("recordsTotal", recordsTotal); 
        dataMap.put("recordsFiltered", recordsFiltered); 
        return SUCCESS;  
	}
	
	
	public Assetclass getAssetclass() {
		return assetclass;
	}

	public void setAssetclass(Assetclass assetclass) {
		this.assetclass = assetclass;
	}

	public Purchasedetail getPurchasedetail() {
		return purchasedetail;
	}

	public void setPurchasedetail(Purchasedetail purchasedetail) {
		this.purchasedetail = purchasedetail;
	}

	public List<Purchasedetail> getPurchasedetails() {
		return purchasedetails;
	}

	public void setPurchasedetails(List<Purchasedetail> purchasedetails) {
		this.purchasedetails = purchasedetails;
	}

	public Integer getAssetclassid() {
		return assetclassid;
	}

	public void setAssetclassid(Integer assetclassid) {
		this.assetclassid = assetclassid;
	}

	public Integer getPassetclassid() {
		return passetclassid;
	}

	public void setPassetclassid(Integer passetclassid) {
		this.passetclassid = passetclassid;
	}

	public Integer getPurid() {
		return purid;
	}

	public void setPurid(Integer purid) {
		this.purid = purid;
	}

	public String getPunit() {
		return punit;
	}

	public void setPunit(String punit) {
		this.punit = punit;
	}

	public String getZcxh() {
		return zcxh;
	}

	public void setZcxh(String zcxh) {
		this.zcxh = zcxh;
	}

	public String getAssetname() {
		return assetname;
	}

	public void setAssetname(String assetname) {
		this.assetname = assetname;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getPdid() {
		return pdid;
	}

	public void setPdid(Integer pdid) {
		this.pdid = pdid;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public List<Purchase> getPurchases() {
		return purchases;
	}

	public void setPurchases(List<Purchase> purchases) {
		this.purchases = purchases;
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
