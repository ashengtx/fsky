package com.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.Assetclass;
import com.model.Department;
import com.model.Roletype;
import com.model.Userinformation;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IAssetClassService;
import com.service.IBaseService;
import com.service.IUserService;

public class AssetClassAction extends ActionSupport {

	private IAssetClassService assetClassService;
	private Integer assetclassid;
	private Assetclass assetclass;

	private String assetclasscoding;
	private String assetclassname;
	private Integer iassetclassid;
	private String iassetclassname;
	private Map<String, Object> dataMap;
	public List<Assetclass> assets;
	private int start;
	private int length;
	private int total;
	private int filter;
	private String key = "Just see see";

	public Assetclass getAssetclass() {
		return assetclass;
	}

	public void setAssetclass(Assetclass assetclass) {
		this.assetclass = assetclass;
	}

	public Integer getAssetclassid() {
		return assetclassid;
	}

	public IAssetClassService getAssetClassService() {
		return assetClassService;
	}

	public void setAssetClassService(IAssetClassService assetClassService) {
		this.assetClassService = assetClassService;
	}

	public void setAssetclassid(Integer assetclassid) {
		this.assetclassid = assetclassid;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public List<Assetclass> getAssets() {
		return assets;
	}

	public void setAssets(List<Assetclass> assets) {
		this.assets = assets;
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

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getFilter() {
		return filter;
	}

	public void setFilter(int filter) {
		this.filter = filter;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getAssetclasscoding() {
		return assetclasscoding;
	}

	public void setAssetclasscoding(String assetclasscoding) {
		this.assetclasscoding = assetclasscoding;
	}

	public String getAssetclassname() {
		return assetclassname;
	}

	public void setAssetclassname(String assetclassname) {
		this.assetclassname = assetclassname;
	}

	public Integer getIassetclassid() {
		return iassetclassid;
	}

	public void setIassetclassid(Integer iassetclassid) {
		this.iassetclassid = iassetclassid;
	}

	public String getIassetclassname() {
		return iassetclassname;
	}

	public void setIassetclassname(String iassetclassname) {
		this.iassetclassname = iassetclassname;
	}

	public String addAssetClass() {
		Assetclass assetclass = new Assetclass();
		assetclass.setAssetclasscoding(assetclasscoding);
		assetclass.setAssetclassname(assetclassname);
		assetclass.setIassetclassid(iassetclassid);
		assetclass.setIassetclassname(iassetclassname);
		System.out.println(assetclasscoding + "!!!" + assetclassname + "!!!"
				+ iassetclassid + "!!!" + iassetclassname + "!!!");
		System.out.println("添加成功！");
		if (assetClassService.create(assetclass)) {
			return SUCCESS;
		}
		return ERROR;

	}

	public String assetClassList() throws Exception {
		this.assets = assetClassService.getLikeName(assetclassname);
		System.out.println("用户列表！");

		List<Assetclass> data = new ArrayList<Assetclass>();
		for (int i = 0; i < assets.size(); i++) {

			Assetclass asset = new Assetclass();
			asset.setAssetclassid(this.assets.get(i).getAssetclassid());
			asset.setAssetclasscoding(this.assets.get(i).getAssetclasscoding());
			asset.setAssetclassname(this.assets.get(i).getAssetclassname());
			asset.setIassetclassid(this.assets.get(i).getIassetclassid());
			asset.setIassetclassname(this.assets.get(i).getIassetclassname());
			data.add(asset);
		}
		// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
		dataMap = new HashMap<String, Object>();
		total = data.size();
		System.out.println(total);
		filter = total;
		if (start + length > total) {
			dataMap.put("aaData", data.subList(start, total));

		} else {
			dataMap.put("aaData", data.subList(start, length));
		}
		/* dataMap.put("aaData", aaData); */
		dataMap.put("recordsTotal", total);
		dataMap.put("recordsFiltered", filter);
		// 返回结果
		return SUCCESS;
	}

	public String updateAssetClass() throws Exception {
		Assetclass assetclass = assetClassService.findById(Assetclass.class, assetclassid);
		assetclass.setAssetclasscoding(assetclasscoding);
		assetclass.setAssetclassname(assetclassname);
		assetclass.setIassetclassid(iassetclassid);
		assetclass.setIassetclassname(iassetclassname);
		assetClassService.saveOrUpdate(assetclass);
		System.out.println(assetclasscoding + "!!!" + assetclassname + "!!!"
				+ iassetclassid + "!!!" + iassetclassname + "!!!");
		System.out.println("修改成功！");
		return SUCCESS;
	}

	public String deleteAssetClass() throws Exception {
		Assetclass assetclass = assetClassService.findById(Assetclass.class, assetclassid);
		assetClassService.doDelete(assetclass);
		System.out.println("删除成功！");
		return SUCCESS;
	}

	public String getAssetClass() {

		System.out.println("获取用户！是多少是多少");
		System.out.println(assetclassid);
//		this.assetclass = assetClassService.getAssetClass(assetclassid);
		// this.setUsername(userinformation.getUsername());
		// this.setUserpassword(userinformation.getUserpwd());
		/*
		 * System.out.println("userid" + userid);
		 * System.out.println(userinformation.getUsername());
		 * System.out.println(userinformation.getUserpwd());
		 */
		// Map request = (Map) ActionContext.getContext().get("request");
		// request.put("userinformation", userinformation);
		return "redirect";
	}

	public String assetClassSearch() throws Exception {
		Assetclass assetclass = new Assetclass();
		assetclass.setAssetclassid(assetclassid);
//		assets = assetClassService.assetClassSearch(assetclass);
		System.out.println("获取搜索列表！");
		return "redirect";
		/*List<Assetclass> data = new ArrayList<Assetclass>();
		for (int i = 0; i < assets.size(); i++) {

			Assetclass asset = new Assetclass();
			asset.setAssetclassid(this.assets.get(i).getAssetclassid());
			asset.setAssetclasscoding(this.assets.get(i).getAssetclasscoding());
			asset.setAssetclassname(this.assets.get(i).getAssetclassname());
			asset.setIassetclassid(this.assets.get(i).getIassetclassid());
			asset.setIassetclassname(this.assets.get(i).getIassetclassname());
			data.add(asset);
		}
		// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
		dataMap = new HashMap<String, Object>();
		total = data.size();
		System.out.println(total);
		filter = total;
		if (start + length > total) {
			dataMap.put("aaData", data.subList(start, total));

		} else {
			dataMap.put("aaData", data.subList(start, length));
		}
		/* dataMap.put("aaData", aaData); */
		/*dataMap.put("recordsTotal", total);
		dataMap.put("recordsFiltered", filter);
		*/
		
		
		

		
	}
}
