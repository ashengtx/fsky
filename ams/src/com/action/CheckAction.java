package com.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.json.annotations.JSON;

import com.model.Asset;
import com.model.Checkdetail;
import com.model.Checked;
import com.model.Userinformation;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IAssetService;
import com.service.ICheckedService;

public class CheckAction extends ActionSupport {
	private ICheckedService iCheckedService;
	private IAssetService iAssetService;
	private Integer checkid;
	private Integer cdid;
	private Userinformation userinformation;
	private Integer userid;
	private Date startdate;
	private Integer cstate;
	private Checked checked;
	private List<Checked> checkeds;
	private Checkdetail checkdetail;
	private List<Checkdetail> checkdetails;
	private Integer cresult;
	
	private int start;  
    private int length; 
	private Map<String,Object> dataMap;  
    private String key = "Just see see";  
    private static final long serialVersionUID = 1L;  
    @JSON(serialize=false)  
    public String getKey() {  
        return key;  
    }
    
	public Integer getCdid() {
		return cdid;
	}

	public void setCdid(Integer cdid) {
		this.cdid = cdid;
	}

	public IAssetService getiAssetService() {
		return iAssetService;
	}

	public void setiAssetService(IAssetService iAssetService) {
		this.iAssetService = iAssetService;
	}

	public Integer getCresult() {
		return cresult;
	}

	public void setCresult(Integer cresult) {
		this.cresult = cresult;
	}

	public Checkdetail getCheckdetail() {
		return checkdetail;
	}

	public void setCheckdetail(Checkdetail checkdetail) {
		this.checkdetail = checkdetail;
	}

	public List<Checkdetail> getCheckdetails() {
		return checkdetails;
	}

	public void setCheckdetails(List<Checkdetail> checkdetails) {
		this.checkdetails = checkdetails;
	}

	public List<Checked> getCheckeds() {
		return checkeds;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public void setCheckeds(List<Checked> checkeds) {
		this.checkeds = checkeds;
	}

	public ICheckedService getiCheckedService() {
		return iCheckedService;
	}

	public void setiCheckedService(ICheckedService iCheckedService) {
		this.iCheckedService = iCheckedService;
	}

	public Integer getCheckid() {
		return checkid;
	}
	public void setCheckid(Integer checkid) {
		this.checkid = checkid;
	}
	public Userinformation getUserinformation() {
		return userinformation;
	}
	public void setUserinformation(Userinformation userinformation) {
		this.userinformation = userinformation;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Integer getCstate() {
		return cstate;
	}
	public void setCstate(Integer cstate) {
		this.cstate = cstate;
	}
	public Checked getChecked() {
		return checked;
	}
	public void setChecked(Checked checked) {
		this.checked = checked;
	}
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
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
    //发起盘点
	public String addChecked(){
		Date nowTime = new Date(System.currentTimeMillis());
		dataMap = new HashMap<String, Object>(); 
		Checked checked = new Checked();
		List<Checked> checkeds = new ArrayList<Checked>();
		if ( iCheckedService.getAllChecked().size() > 0 ){
			checkeds = iCheckedService.getAllChecked();
			checked = checkeds.get(checkeds.size() - 1);
			if ( checked.getCstate() == 1){
				this.cstate = 0;
				Userinformation loginuser = new Userinformation();
				loginuser = (Userinformation)ActionContext.getContext().getSession().get("loginuser");
				checked.setCstate(cstate);
				checked.setStartdate(startdate);
				checked.setUserinformation(loginuser);
				checked.setStartdate(nowTime);
				iCheckedService.create(checked);
				List<Asset> assets = new ArrayList<Asset>();
				assets = iAssetService.getList(Asset.class);
				for( Asset asset : assets ){
					Checkdetail myCheckdetail = new Checkdetail();
					myCheckdetail.setAsset(asset);
					myCheckdetail.setChecked(checked);
					myCheckdetail.setCresult(-1);
					iCheckedService.create(myCheckdetail);
					System.out.println("list");
				}
			}
		}else{
			this.cstate = 0;
			Userinformation loginuser = new Userinformation();
			loginuser = (Userinformation)ActionContext.getContext().getSession().get("loginuser");
			checked.setCstate(cstate);
			checked.setStartdate(startdate);
			checked.setStartdate(nowTime);
			checked.setUserinformation(loginuser);
			iCheckedService.create(checked);
			List<Asset> assets = new ArrayList<Asset>();
			assets = iAssetService.getList(Asset.class);
			for( Asset asset : assets ){
				Checkdetail myCheckdetail = new Checkdetail();
				myCheckdetail.setAsset(asset);
				myCheckdetail.setChecked(checked);
				myCheckdetail.setCresult(-1);
				iCheckedService.create(myCheckdetail);
			}
		}
		dataMap.put("res", "操作成功");
	    return SUCCESS;
	}

	//结束盘点
	public String endChecked(){
		System.out.println("test");

		dataMap = new HashMap<String, Object>(); 
		this.checkeds = iCheckedService.getList(Checked.class);
//		System.out.println(this.checkeds.size());

		if ( this.checkeds.size() > 0){
			this.checked = this.checkeds.get(this.checkeds.size() - 1);
			int ifCheckFinish = 1 ;
			this.checkdetails = iCheckedService.getCheckdetailList(this.checked.getCheckid(),cresult);
//			System.out.println(this.checkdetails.size());
			for(Checkdetail checkdetail : this.checkdetails)
		    {    
		    	if (checkdetail.getCresult() == -1){
		    		ifCheckFinish = 0;
		    	}
		    }
			if ( ifCheckFinish == 1 ){
				Checked checked = new Checked();
				try {
					checked = iCheckedService.findById(Checked.class, checkid);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				checked.setCstate(1);
				iCheckedService.saveOrUpdate(checked);
			}
		}
		dataMap.put("res", "操作成功");
		return SUCCESS;
	}
	//确认盘点
	public String confirmCheckedDetail(){
		Date nowTime = new Date(System.currentTimeMillis());
		try {
			checkdetail = iCheckedService.findById(Checkdetail.class, cdid);
			if (checkdetail != null){
				checkdetail.setCresult(cresult);
				checkdetail.setCdate(nowTime);
				iCheckedService.saveOrUpdate(checkdetail);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	//查找单个盘点
	public String getLastestChecked(){
		Checked checked = new Checked();
		List<Checked> checkeds = new ArrayList<Checked>();
		dataMap = new HashMap<String, Object>(); 
		checkeds = iCheckedService.getAllChecked();
		if (checkeds.size() > 0){
			checked.setCstate(checkeds.get(checkeds.size() - 1).getCstate());
			checked.setCheckid(checkeds.get(checkeds.size() - 1).getCheckid());
		}
		
		dataMap.put("checked", checked);
		return SUCCESS;
	}
	//返回盘点明细列表
	public String getCheckdetailList(){ 
		int recordsTotal = 0;
	    int recordsFiltered = 0;
		List<Object> aaData = new ArrayList<Object>();
		List<Checked> checkeds = new ArrayList();
        dataMap = new HashMap<String, Object>(); 
		Checked checked = new Checked();
		checkeds = iCheckedService.getAllChecked();
		if (checkeds.size() > 0){
			checked.setCheckid(checkeds.get(checkeds.size()-1).getCheckid());
			checked.setCstate(checkeds.get(checkeds.size()-1).getCstate());
			if (checked.getCstate() == 0){
				this.checkdetails = iCheckedService.getCheckdetailList(checked.getCheckid(),cresult);
			    for(Checkdetail checkdetail : this.checkdetails)
			    {    
			    	Checkdetail myCheckdetail = new Checkdetail();
			    	Checked myChecked = new Checked();
			    	Asset myAsset = new Asset();
			    	myAsset.setAssetid(checkdetail.getAsset().getAssetid());
			    	myAsset.setAssetname(checkdetail.getAsset().getAssetname());
			    	myChecked.setCheckid(checkdetail.getChecked().getCheckid());
			    	myCheckdetail.setAsset(myAsset);
			    	myCheckdetail.setCdate(checkdetail.getCdate());
			    	myCheckdetail.setCdid(checkdetail.getCdid());
			    	myCheckdetail.setChecked(myChecked);
			    	myCheckdetail.setCresult(checkdetail.getCresult());
			    	aaData.add(myCheckdetail);  	
			    }
			}
		    
		    // dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据  
            recordsTotal = aaData.size();
            recordsFiltered = recordsTotal;
            if(start+length>recordsTotal){
                dataMap.put("aaData", aaData.subList(start,recordsTotal)); 
            }
            else{
            	dataMap.put("aaData", aaData.subList(start,length)); 
            }
      	    
		}else{
			dataMap.put("aaData", aaData); 
		}
		dataMap.put("recordsTotal", recordsTotal); 
        dataMap.put("recordsFiltered", recordsFiltered); 
	       	    // 返回结果  
	
	    return SUCCESS;  
	}
}
