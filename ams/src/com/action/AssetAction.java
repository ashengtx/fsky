package com.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.json.annotations.JSON;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.util.Assert;

import com.model.Assetclass;
import com.model.Baofei;
import com.model.Department;
import com.model.Purchase;
import com.model.Purchasedetail;
import com.model.Repairs;
import com.model.Roletype;
import com.model.Transbill;
import com.model.Userinformation;
import com.model.Asset;
import com.model.Zclygh;
import com.model.Zctrans;
import com.model.Zctransdetail;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.IAssetClassService;
import com.service.IAssetService;
import com.service.IBaseService;
import com.service.IDepartmentService;
import com.service.IPurchaseService;
import com.service.IUserService;

public class AssetAction extends ActionSupport {
	private IAssetService assetService;
	// private IDepartmentService iDepartmentService;
	// private IUserService iUserService;
	private IAssetClassService iAssetClassService;
	// private IParametersInfoService iParametersInfoService;
	private Integer assetid;
	private Integer assetclassid;
	private Integer passetclassid;
	private Integer departmentid;
	private Integer userid;
	private Integer useruid;
	private Integer cwuid;
	private Integer pdid;
	private String cardnum;
	private Integer zkstate; // 在库状态 5 调出
	private Integer cwstate;
	private String ggxh;
	private Integer usestate;
	private String assetname;
	private Integer cgbid;
	private Timestamp intodate;
	private String cwcoding;
	private String assetcoding;
	private String manufacturer;
	private String provider;
	private Date insertdate;
	private String aunit;
	private Integer amount;
	private String remark;
	private Float price;
	private List<Asset> assets;

	/*
	 * @author 林连升
	 * 
	 * @description 资产领用归还
	 */
	private Integer lyghid;
	private Integer lyuserid;
	private Integer ghuserid;
	private Date lydate;
	private Date ghdate;
	private Integer lyghstate;
	private List<Zclygh> zclyghs;
	private Asset asset;

	/*
	 * @author 林连升
	 * 
	 * @description 资产报废
	 */
	private Date bfdate;
	private Date checkdate;
	private Integer bfstate;
	private Integer bfid;
	private Integer checkuid;
	private List<Baofei> baofeis;

	/*
	 * @author 林连升
	 * 
	 * @description 资产维修
	 */
	private Integer rid;
	private String shqk; // 使用情况
	private Float rprice;
	private Integer rstate; // 维修状态
	private Integer beforestate; // 送修前资产使用状态
	private List<Repairs> repair;

	/*
	 * @author 林连升
	 * 
	 * @description 调拨单
	 */
	private Integer tbid;
	private Date outdate;
	private String outnote; // 调出事由
	private Integer tbstate; // 调拨状态 0 调出待确认
	private Date inputdate;
	private Integer dcuid;
	private Integer dcdid;
	private Integer druid;
	private Integer drdid;
	private List<Transbill> transbills;

	private Integer jsuserid;
	private Integer tdid;
	private Integer transid;
	private List<Zctransdetail> zctransdetails;

	private List<Zctrans> zctranss;
	private static final long serialVersionUID = 1L;
	private Map<String, Object> dataMap;
	private String key = "Just see see";
	private int start;
	private int length;

	/*
	 * @author Guohui Li
	 * 
	 * @description 统计报表
	 */
	private String typeFlag;
	private int iassetclassid;

	public IAssetClassService getiAssetClassService() {
		return iAssetClassService;
	}

	public void setiAssetClassService(IAssetClassService iAssetClassService) {
		this.iAssetClassService = iAssetClassService;
	}

	public String addAsset() {
		Asset asset = new Asset();
		Purchasedetail purchasedetail = new Purchasedetail();

		Userinformation userinformationByUserid = new Userinformation();
		Userinformation userinformationByCwuid = new Userinformation();
		// Department department = new Department();
		Assetclass assetclass = new Assetclass();
		Assetclass passetclass = new Assetclass();

		purchasedetail.setPdid(pdid);

		userinformationByUserid.setUserid(userid);
		userinformationByCwuid.setUserid(cwuid);
		assetclass.setAssetclassid(assetclassid);
		passetclass.setAssetclassid(passetclassid);
		// department.setDepartmentid(departmentid);

		asset.setAmount(amount);
		asset.setAssetcoding(assetcoding);
		asset.setAssetname(assetname);
		asset.setAunit(aunit);
		asset.setCardnum(cardnum);
		asset.setCgbid(cgbid);
		asset.setCwcoding(cwcoding);
		asset.setCwstate(cwstate);
		asset.setGgxh(ggxh);
		asset.setInsertdate(insertdate);
		asset.setIntodate(intodate);
		asset.setManufacturer(manufacturer);
		asset.setPrice(price);
		asset.setProvider(provider);
		asset.setRemark(remark);
		asset.setZkstate(zkstate);
		asset.setUsestate(usestate);

		asset.setAssetclassByAssetclassid(assetclass);
		asset.setAssetclassByPassetclassid(passetclass);
		// asset.setDepartment(department);
		asset.setUserinformationByCwuid(userinformationByCwuid);
		asset.setUserinformationByUserid(userinformationByUserid);

		asset.setPurchasedetail(purchasedetail);

		assetService.create(asset);

		return SUCCESS;
	}

	/*
	 * dh:资产列表
	 */
	public String assetList() {

		System.out.println("资产列表！");
		System.out.println("assetname" + assetname);
		System.out.println("assetcoding" + assetcoding);
		// this.assets = assetService.getList(Asset.class);
		this.assets = assetService.getAssetList(assetname, assetcoding);
		List<Asset> data = new ArrayList<Asset>();
		for (int i = 0; i < assets.size(); i++) {
			Asset asset = new Asset();
			Assetclass assetclass = new Assetclass();
			Assetclass passetclass = new Assetclass();
			Department department = new Department();
			Userinformation userinformationByUserid = new Userinformation();
			Purchasedetail purchasedetail = new Purchasedetail();

			assetclass.setAssetclassid(this.assets.get(i)
					.getAssetclassByAssetclassid().getAssetclassid());
			assetclass.setAssetclassname(this.assets.get(i)
					.getAssetclassByAssetclassid().getAssetclassname());
			userinformationByUserid.setUserid(this.assets.get(i)
					.getUserinformationByUserid().getUserid());
			asset.setAssetid(this.assets.get(i).getAssetid());
			asset.setUsestate(this.assets.get(i).getUsestate());
			asset.setAssetclassByAssetclassid(assetclass);
			asset.setUserinformationByUserid(userinformationByUserid);
			asset.setCardnum(this.assets.get(i).getCardnum());
			asset.setAssetname(this.assets.get(i).getAssetname());
			asset.setAssetcoding(this.assets.get(i).getAssetcoding());
			asset.setPrice(this.assets.get(i).getPrice());
			asset.setCgbid(this.assets.get(i).getCgbid());
			asset.setInsertdate(this.assets.get(i).getInsertdate());
			data.add(asset);
		}
		System.out.println("assetList大小：" + assets.size());
		dataMap = new HashMap<String, Object>();
		int total = data.size();
		System.out.println(total);
		int filter = total;
		if (start + length > total) {
			dataMap.put("aaData", data.subList(start, total));

		} else {
			dataMap.put("aaData", data.subList(start, length));
		}
		dataMap.put("recordsTotal", total);
		dataMap.put("recordsFiltered", filter);
		return SUCCESS;
	}

	/*
	 * @author 林连升
	 * 
	 * @description 资产领用
	 */
	public String assetUse() throws Exception {
		System.out.println("assetUse");
		Zclygh zclygh = new Zclygh();
		Userinformation userinformationByLyuserid = new Userinformation();
		Asset asset = new Asset();
		Department department = new Department();
		Userinformation userinformationByUseruid = new Userinformation();
		department.setDepartmentid(departmentid);
		userinformationByUseruid.setUserid(lyuserid);
		userinformationByLyuserid.setUserid(lyuserid);
		asset.setAssetid(assetid);

		zclygh.setUserinformationByLyuserid(userinformationByLyuserid);
		zclygh.setAsset(asset);
		zclygh.setLydate(lydate);
		zclygh.setLyghstate(0);
		assetService.create(zclygh);

		Asset lyasset = assetService.findById(Asset.class, assetid);
		lyasset.setUserinformationByUseruid(userinformationByUseruid);
		lyasset.setDepartment(department);
		lyasset.setUsestate(1);
		lyasset.setZkstate(1);

		assetService.saveOrUpdate(lyasset);
		return SUCCESS;

	}

	/*
	 * @author 林连升
	 * 
	 * @description 资产归还列表
	 */
	public String returnList() {
		System.out.println("returnList");
		this.zclyghs = assetService.getLyList(0);
		System.out.println(this.zclyghs.size());
		List<Object> aaData = new ArrayList<Object>();
		for (int i = 0; i < this.zclyghs.size(); i++) {
			Zclygh zclygh = new Zclygh();
			Userinformation userinformationByLyuserid = new Userinformation();
			Asset asset = new Asset();
			userinformationByLyuserid.setUserid(this.zclyghs.get(i)
					.getUserinformationByLyuserid().getUserid());
			asset.setAssetid(this.zclyghs.get(i).getAsset().getAssetid());

			zclygh.setLyghid(this.zclyghs.get(i).getLyghid());
			zclygh.setAsset(asset);
			zclygh.setUserinformationByLyuserid(userinformationByLyuserid);
			zclygh.setLydate(this.zclyghs.get(i).getLydate());
			aaData.add(zclygh);
		}
		int recordsTotal;
		int recordsFiltered;
		// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
		dataMap = new HashMap<String, Object>();
		recordsTotal = aaData.size();
		recordsFiltered = recordsTotal;
		if (start + length > recordsTotal) {
			dataMap.put("aaData", aaData.subList(start, recordsTotal));
		} else {
			dataMap.put("aaData", aaData.subList(start, length));
		}

		/* dataMap.put("aaData", aaData); */
		dataMap.put("recordsTotal", recordsTotal);
		dataMap.put("recordsFiltered", recordsFiltered);
		// 返回结果
		return SUCCESS;
	}

	/*
	 * @author 林连升
	 * 
	 * @description 资产归还
	 */
	public String assetReturn() throws Exception {
		Zclygh zclygh = assetService.findById(Zclygh.class, lyghid);
		this.assetid = zclygh.getAsset().getAssetid();

		Userinformation user = new Userinformation();
		user.setUserid(ghuserid);
		zclygh.setUserinformationByGhuserid(user);
		zclygh.setGhdate(ghdate);
		zclygh.setLyghstate(1);
		assetService.saveOrUpdate(zclygh);

		Asset ghasset = assetService.findById(Asset.class, this.assetid);
		ghasset.setUsestate(2);
		ghasset.setZkstate(2);
		assetService.saveOrUpdate(ghasset);
		return SUCCESS;

	}

	/*
	 * dh：dele资产
	 */
	public String deleteAsset() throws Exception {
		Asset asset = assetService.findById(Asset.class, assetid);
		asset.setZkstate(0);
		assetService.saveOrUpdate(asset);
		return SUCCESS;

	}

	// dh：查看资产详情
	public String getAssetDetail() throws Exception {
		System.out.println("assetid" + assetid);
		this.asset = assetService.findById(Asset.class, assetid);
		System.out.println("查看资产详情");
		System.out.println(this.asset.getAssetname());
		return SUCCESS;
	}

	// dh：编辑资产--》获取资产详情
	public String getAssetByAssetId() throws Exception {
		System.out.println("assetid" + assetid);
		this.asset = assetService.findById(Asset.class, assetid);
		System.out.println("修资产");
		System.out.println(this.asset.getAssetname());
		return SUCCESS;
	}

	public String updateAsset() throws Exception {
		System.out.println("改资产" + assetid);
		Asset asset = new Asset();
		Purchasedetail purchasedetail = new Purchasedetail();

		asset = assetService.findById(Asset.class, assetid);

		Userinformation userinformationByUserid = new Userinformation();
		Userinformation userinformationByCwuid = new Userinformation();

		// Department department = new Department();

		Assetclass assetclass = new Assetclass();
		Assetclass passetclass = new Assetclass();
		if (pdid != null)
			purchasedetail.setPdid(pdid);
		if (userid != null)
			userinformationByUserid.setUserid(userid);
		if (cwuid != null)
			userinformationByCwuid.setUserid(cwuid);
		if (assetclassid != null)
			assetclass.setAssetclassid(assetclassid);
		if (passetclassid != null)
			passetclass.setAssetclassid(passetclassid);

		// department.setDepartmentid(departmentid);
		// if (assetid != null)
		// asset.setAssetid(assetid);
		if (amount != null)
			asset.setAmount(amount);
		if (assetcoding != null)
			asset.setAssetcoding(assetcoding);
		if (assetname != null)
			asset.setAssetname(assetname);
		if (aunit != null)
			asset.setAunit(aunit);
		if (cardnum != null)
			asset.setCardnum(cardnum);
		if (cgbid != null)
			asset.setCgbid(cgbid);
		if (cwcoding != null)
			asset.setCwcoding(cwcoding);
		// asset.setCwstate(cwstate);
		if (ggxh != null)
			asset.setGgxh(ggxh);
		if (insertdate != null)
			asset.setInsertdate(insertdate);
		if (intodate != null)
			asset.setIntodate(intodate);
		if (manufacturer != null)
			asset.setManufacturer(manufacturer);
		if (price != null)
			asset.setPrice(price);
		if (provider != null)
			asset.setProvider(provider);
		if (remark != null)
			asset.setRemark(remark);
		if (zkstate != null)
			asset.setZkstate(zkstate);
		if (usestate != null)
			asset.setUsestate(usestate);
		if (assetclassid != null)
			asset.setAssetclassByAssetclassid(assetclass);
		if (passetclassid != null)
			asset.setAssetclassByPassetclassid(passetclass);
		// asset.setDepartment(department);
		if (cwuid != null)
			asset.setUserinformationByCwuid(userinformationByCwuid);
		if (userid != null)
			asset.setUserinformationByUserid(userinformationByUserid);
		if (pdid != null)
			asset.setPurchasedetail(purchasedetail);

		assetService.saveOrUpdate(asset);

		return SUCCESS;
	}

	/*
	 * @author 林连升
	 * 
	 * @description 资产报废
	 */
	public String assetScrap() throws Exception {
		System.out.println("assetScrap");
		Baofei baofei = new Baofei();
		Userinformation userinformationByUserid = new Userinformation();
		Asset asset = new Asset();
		userinformationByUserid.setUserid(userid);
		asset.setAssetid(assetid);

		baofei.setAsset(asset);
		baofei.setUserinformationByUserid(userinformationByUserid);
		baofei.setBfdate(bfdate);
		baofei.setBfstate(0);
		assetService.create(baofei);

		return SUCCESS;

	}

	/*
	 * @author 林连升
	 * 
	 * @description 资产报废列表
	 */
	//
	public String scrapList() {
		System.out.println("scrapList");
		this.baofeis = assetService.getBaofeiList(0);
		List<Object> aaData = new ArrayList<Object>();
		for (int i = 0; i < this.baofeis.size(); i++) {
			Baofei baofei = new Baofei();
			Userinformation userinformationByUserid = new Userinformation();
			Asset asset = new Asset();
			userinformationByUserid.setUserid(this.baofeis.get(i)
					.getUserinformationByUserid().getUserid());
			asset.setAssetid(this.baofeis.get(i).getAsset().getAssetid());

			baofei.setBfid(this.baofeis.get(i).getBfid());
			baofei.setAsset(asset);
			baofei.setUserinformationByUserid(userinformationByUserid);
			baofei.setBfdate(this.baofeis.get(i).getBfdate());
			baofei.setBfstate(0);
			aaData.add(baofei);
		}
		int recordsTotal;
		int recordsFiltered;
		// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
		dataMap = new HashMap<String, Object>();
		recordsTotal = aaData.size();
		recordsFiltered = recordsTotal;
		if (start + length > recordsTotal) {
			dataMap.put("aaData", aaData.subList(start, recordsTotal));
		} else {
			dataMap.put("aaData", aaData.subList(start, length));
		}

		/* dataMap.put("aaData", aaData); */
		dataMap.put("recordsTotal", recordsTotal);
		dataMap.put("recordsFiltered", recordsFiltered);
		// 返回结果
		return SUCCESS;
	}

	/*
	 * @author 林连升
	 * 
	 * @description 资产报废审核
	 */
	public String scrapCheck() throws Exception {
		System.out.println("scrapCheck");
		Baofei baofei = assetService.findById(Baofei.class, bfid);
		this.assetid = baofei.getAsset().getAssetid();
		Userinformation userinformationByCheckuid = new Userinformation();
		userinformationByCheckuid.setUserid(checkuid);

		baofei.setUserinformationByCheckuid(userinformationByCheckuid);
		baofei.setCheckdate(checkdate);
		baofei.setBfstate(1);
		assetService.saveOrUpdate(baofei);

		Asset baofeiasset = assetService.findById(Asset.class, this.assetid);
		baofeiasset.setZkstate(4);
		baofeiasset.setUsestate(4);

		assetService.saveOrUpdate(baofeiasset);
		return SUCCESS;

	}

	/*
	 * @author 林连升
	 * 
	 * @description 资产报修
	 */
	public String assetRepair() throws Exception {
		System.out.println("assetRepair");
		Repairs repairs = new Repairs();
		Userinformation userinformation = new Userinformation();
		Asset asset = new Asset();
		userinformation.setUserid(userid);
		asset.setAssetid(assetid);

		this.beforestate = assetService.findById(Asset.class, this.assetid)
				.getUsestate();

		repairs.setAsset(asset);
		repairs.setUserinformation(userinformation);
		repairs.setBeforestate(beforestate);
		repairs.setShqk(shqk);
		repairs.setRstate(0);
		assetService.create(repairs);

		Asset repairasset = assetService.findById(Asset.class, this.assetid);
		repairasset.setUsestate(3);
		repairasset.setZkstate(3);
		assetService.saveOrUpdate(repairasset);

		return SUCCESS;

	}

	/*
	 * @author 林连升
	 * 
	 * @description 资产维修列表
	 * 
	 * @problem 如果列表中价格为空就会有问题？
	 */
	public String repairList() {
		System.out.println("repairList");
		this.repair = assetService.getRepairsList(0);
		List<Object> aaData = new ArrayList<Object>();
		for (int i = 0; i < this.repair.size(); i++) {
			Repairs repairs = new Repairs();
			Userinformation userinformation = new Userinformation();
			Asset asset = new Asset();
			userinformation.setUserid(this.repair.get(i).getUserinformation()
					.getUserid());
			asset.setAssetid(this.repair.get(i).getAsset().getAssetid());

			repairs.setAsset(asset);
			repairs.setUserinformation(userinformation);
			repairs.setBeforestate(this.repair.get(i).getBeforestate());
			repairs.setRid(this.repair.get(i).getRid());
			repairs.setShqk(this.repair.get(i).getShqk());
			aaData.add(repairs);
		}
		int recordsTotal;
		int recordsFiltered;
		// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
		dataMap = new HashMap<String, Object>();
		recordsTotal = aaData.size();
		recordsFiltered = recordsTotal;
		if (start + length > recordsTotal) {
			dataMap.put("aaData", aaData.subList(start, recordsTotal));
		} else {
			dataMap.put("aaData", aaData.subList(start, length));
		}

		/* dataMap.put("aaData", aaData); */
		dataMap.put("recordsTotal", recordsTotal);
		dataMap.put("recordsFiltered", recordsFiltered);
		// 返回结果
		return SUCCESS;
	}

	/*
	 * @author 林连升
	 * 
	 * @description 维修完成
	 */
	public String repairComplete() throws Exception {
		System.out.println("repairComplete");
		Repairs repairs = assetService.findById(Repairs.class, rid);
		this.assetid = repairs.getAsset().getAssetid();
		this.beforestate = repairs.getBeforestate();
		repairs.setRprice(rprice);
		repairs.setRstate(1);
		assetService.saveOrUpdate(repairs);

		Asset asset = assetService.findById(Asset.class, this.assetid);
		asset.setUsestate(this.beforestate);
		asset.setZkstate(this.beforestate);
		assetService.saveOrUpdate(asset);
		return SUCCESS;

	}

	/*
	 * @author 林连升
	 * 
	 * @description 资产调拨
	 */
	public String assetTransfer() throws Exception {
		System.out.println("assetTransfer");
		Transbill transbill = new Transbill();
		Userinformation userinformationByDcuid = new Userinformation();
		Asset asset = new Asset();
		Department departmentByDcdid = new Department();
		userinformationByDcuid.setUserid(dcuid);
		departmentByDcdid.setDepartmentid(dcdid);
		asset.setAssetid(assetid);

		transbill.setAsset(asset);
		transbill.setDepartmentByDcdid(departmentByDcdid);
		transbill.setUserinformationByDcuid(userinformationByDcuid);
		transbill.setOutdate(outdate);
		transbill.setOutnote(outnote);
		transbill.setTbstate(0);
		assetService.create(transbill);

		Asset transasset = assetService.findById(Asset.class, this.assetid);
		transasset.setUsestate(5);
		transasset.setZkstate(5);
		assetService.saveOrUpdate(transasset);

		return SUCCESS;

	}

	/*
	 * @author 林连升
	 * 
	 * @description 资产调出列表
	 */
	public String transferList() {
		System.out.println("transferList");
		this.transbills = assetService.getTransbillList(0);
		List<Object> aaData = new ArrayList<Object>();
		for (int i = 0; i < this.transbills.size(); i++) {
			Transbill transbill = new Transbill();
			Userinformation userinformationByDcuid = new Userinformation();
			Asset asset = new Asset();
			Department departmentByDcdid = new Department();
			userinformationByDcuid.setUserid(this.transbills.get(i)
					.getUserinformationByDcuid().getUserid());
			asset.setAssetid(this.transbills.get(i).getAsset().getAssetid());
			departmentByDcdid.setDepartmentid(this.transbills.get(i)
					.getDepartmentByDcdid().getDepartmentid());

			transbill.setAsset(asset);
			transbill.setUserinformationByDcuid(userinformationByDcuid);
			transbill.setDepartmentByDcdid(departmentByDcdid);
			transbill.setOutdate(this.transbills.get(i).getOutdate());
			transbill.setOutnote(this.transbills.get(i).getOutnote());
			transbill.setTbid(this.transbills.get(i).getTbid());
			aaData.add(transbill);
		}
		int recordsTotal;
		int recordsFiltered;
		// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
		dataMap = new HashMap<String, Object>();
		recordsTotal = aaData.size();
		recordsFiltered = recordsTotal;
		if (start + length > recordsTotal) {
			dataMap.put("aaData", aaData.subList(start, recordsTotal));
		} else {
			dataMap.put("aaData", aaData.subList(start, length));
		}

		/* dataMap.put("aaData", aaData); */
		dataMap.put("recordsTotal", recordsTotal);
		dataMap.put("recordsFiltered", recordsFiltered);
		// 返回结果
		return SUCCESS;
	}

	/*
	 * @author 林连升
	 * 
	 * @description 资产调入
	 */
	public String transferIn() throws Exception {
		System.out.println("transferIn");
		Transbill transbill = assetService.findById(Transbill.class, tbid);
		this.assetid = transbill.getAsset().getAssetid();
		Userinformation userinformationByDruid = new Userinformation();
		Department departmentByDrdid = new Department();
		userinformationByDruid.setUserid(druid);
		departmentByDrdid.setDepartmentid(drdid);

		transbill.setDepartmentByDrdid(departmentByDrdid);
		transbill.setInputdate(inputdate);
		transbill.setTbstate(1);
		transbill.setUserinformationByDruid(userinformationByDruid);
		assetService.saveOrUpdate(transbill);

		Asset transasset = assetService.findById(Asset.class, this.assetid);
		transasset.setUsestate(2);
		transasset.setZkstate(2);
		assetService.saveOrUpdate(transasset);

		return SUCCESS;

	}

	public String assetTransferList() {

		this.transbills = assetService.getAssetTransbillList(assetid);
		System.out.print(assetid);
		List<Object> aaData = new ArrayList<Object>();
		for (int i = 0; i < this.transbills.size(); i++) {
			if (this.transbills.get(i).getTbstate() == 0) {
				Transbill transbill = new Transbill();
				Userinformation userinformationByDcuid = new Userinformation();
				Asset asset = new Asset();
				Department departmentByDcdid = new Department();
				userinformationByDcuid.setUserid(this.transbills.get(i)
						.getUserinformationByDcuid().getUserid());
				asset.setAssetid(this.transbills.get(i).getAsset().getAssetid());
				departmentByDcdid.setDepartmentid(this.transbills.get(i)
						.getDepartmentByDcdid().getDepartmentid());

				transbill.setAsset(asset);
				transbill.setUserinformationByDcuid(userinformationByDcuid);
				transbill.setDepartmentByDcdid(departmentByDcdid);

				transbill.setOutdate(this.transbills.get(i).getOutdate());
				transbill.setOutnote(this.transbills.get(i).getOutnote());
				transbill.setTbid(this.transbills.get(i).getTbid());
				transbill.setTbstate(this.transbills.get(i).getTbstate());
				aaData.add(transbill);
			} else {
				Transbill transbill = new Transbill();
				Userinformation userinformationByDcuid = new Userinformation();
				Userinformation userinformationByDruid = new Userinformation();
				Asset asset = new Asset();
				Department departmentByDcdid = new Department();
				Department departmentByDrdid = new Department();
				userinformationByDcuid.setUserid(this.transbills.get(i)
						.getUserinformationByDcuid().getUserid());
				userinformationByDruid.setUserid(this.transbills.get(i)
						.getUserinformationByDruid().getUserid());
				asset.setAssetid(this.transbills.get(i).getAsset().getAssetid());
				departmentByDcdid.setDepartmentid(this.transbills.get(i)
						.getDepartmentByDcdid().getDepartmentid());
				departmentByDrdid.setDepartmentid(this.transbills.get(i)
						.getDepartmentByDrdid().getDepartmentid());

				transbill.setAsset(asset);
				transbill.setUserinformationByDcuid(userinformationByDcuid);
				transbill.setUserinformationByDruid(userinformationByDruid);
				transbill.setDepartmentByDcdid(departmentByDcdid);
				transbill.setDepartmentByDrdid(departmentByDrdid);
				transbill.setOutdate(this.transbills.get(i).getOutdate());
				transbill.setOutnote(this.transbills.get(i).getOutnote());
				transbill.setTbid(this.transbills.get(i).getTbid());
				transbill.setInputdate(this.transbills.get(i).getInputdate());
				transbill.setTbstate(this.transbills.get(i).getTbstate());
				aaData.add(transbill);

			}

		}
		int recordsTotal;
		int recordsFiltered;
		// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
		dataMap = new HashMap<String, Object>();
		recordsTotal = aaData.size();
		recordsFiltered = recordsTotal;
		if (start + length > recordsTotal) {
			dataMap.put("aaData", aaData.subList(start, recordsTotal));
		} else {
			dataMap.put("aaData", aaData.subList(start, length));
		}

		/* dataMap.put("aaData", aaData); */
		dataMap.put("recordsTotal", recordsTotal);
		dataMap.put("recordsFiltered", recordsFiltered);
		// 返回结果
		return SUCCESS;
	}

	/*
	 * dingh 获取用户资产列表
	 */
	public String assetChangeList() {
		Userinformation userinformation = new Userinformation();
		userinformation = (Userinformation) ActionContext.getContext()
				.getSession().get("loginUser");
		userid = userinformation.getUserid();
		System.out.println("userid:" + userid);
		// this.assets = assetService.getList(Asset.class);
		this.assets = assetService.getTransAssetList(3, userid);

		List<Asset> data = new ArrayList<Asset>();
		for (int i = 0; i < assets.size(); i++) {
			Asset asset = new Asset();
			Assetclass assetclass = new Assetclass();
			Assetclass passetclass = new Assetclass();
	
			Userinformation userinformationByUserid = new Userinformation();
			Purchasedetail purchasedetail = new Purchasedetail();

			assetclass.setAssetclassid(this.assets.get(i)
					.getAssetclassByAssetclassid().getAssetclassid());
			assetclass.setAssetclassname(this.assets.get(i)
					.getAssetclassByAssetclassid().getAssetclassname());
			userinformationByUserid.setUserid(this.assets.get(i)
					.getUserinformationByUserid().getUserid());
			asset.setAssetid(this.assets.get(i).getAssetid());
			asset.setUsestate(this.assets.get(i).getUsestate());
			asset.setAssetclassByAssetclassid(assetclass);
			asset.setUserinformationByUserid(userinformationByUserid);
			asset.setCardnum(this.assets.get(i).getCardnum());
			asset.setZkstate(this.assets.get(i).getZkstate());
			asset.setAssetname(this.assets.get(i).getAssetname());
			asset.setAssetcoding(this.assets.get(i).getAssetcoding());
			asset.setPrice(this.assets.get(i).getPrice());
			asset.setCgbid(this.assets.get(i).getCgbid());
			asset.setInsertdate(this.assets.get(i).getInsertdate());
			data.add(asset);
		}
		System.out.println("assetList大小：" + assets.size());
		// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
		dataMap = new HashMap<String, Object>();
		int total = data.size();
		System.out.println(total);
		int filter = total;
		if (start + length > total) {
			dataMap.put("aaData", data.subList(start, total));

		} else {
			dataMap.put("aaData", data.subList(start, length));
		}
		/* dataMap.put("aaData", aaData); */
		dataMap.put("recordsTotal", total);
		dataMap.put("recordsFiltered", filter);
		return SUCCESS;
	}

	// 移交资产
	public String transAsset() throws Exception {
		Userinformation loginuserinformation = new Userinformation();
		loginuserinformation = (Userinformation) ActionContext.getContext()
				.getSession().get("loginuser");
		userid = loginuserinformation.getUserid();

		Date nowTime = new Date(System.currentTimeMillis());
		/*
		 * SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd");
		 * String retStrFormatNowDate = sdFormatter.format(nowTime);
		 */

		Zctrans zctrans = new Zctrans();
		Userinformation userinformationByYjuserid = new Userinformation();
		Userinformation userinformationByJsuserid = new Userinformation();

		userinformationByYjuserid.setUserid(userid);
		userinformationByJsuserid.setUserid(jsuserid);

		zctrans.setUserinformationByYjuserid(userinformationByYjuserid);
		zctrans.setUserinformationByJsuserid(userinformationByJsuserid);
		zctrans.setStartdate(nowTime);
		zctrans.setTranstate(0);
		assetService.create(zctrans);

		this.assets = assetService.getTransAssetList(0, userid);
		for (int i = 0; i < this.assets.size(); i++) {
			Zctransdetail zctransdetail = new Zctransdetail();
			Userinformation userinformation = new Userinformation();
			Asset asset = assets.get(i);

			userinformation.setUserid(jsuserid);

			zctransdetail.setZctrans(zctrans);
			zctransdetail.setAsset(asset);
			zctransdetail.setUserinformation(userinformation);
			zctransdetail.setJsresult(2);// 初始状态，尚未接收

			assetService.create(zctransdetail);
		}

		return SUCCESS;

	}

	// 待接收清单
	public String transOkList() throws Exception {
		Userinformation loginuserinformation = new Userinformation();
		loginuserinformation = (Userinformation) ActionContext.getContext()
				.getSession().get("loginuser");
		userid = loginuserinformation.getUserid();
		this.zctransdetails = assetService.getZctransdetailList(userid);
		// System.out.print(this.zctransdetails.size());
		List<Object> aaData = new ArrayList<Object>();
		for (int i = 0; i < this.zctransdetails.size(); i++) {
			assetid = this.zctransdetails.get(i).getAsset().getAssetid();
			Zctransdetail zctransdetail = new Zctransdetail();
			Userinformation userinformation = new Userinformation();
			Zctrans zctrans = new Zctrans();

			Asset oneasset = assetService.findById(Asset.class, assetid);
			Asset asset = new Asset();
			asset.setAssetid(oneasset.getAssetid());
			asset.setAssetname(oneasset.getAssetname());
			asset.setZkstate(oneasset.getZkstate());

			userinformation.setUserid(this.zctransdetails.get(i)
					.getUserinformation().getUserid());
			zctrans.setTransid(this.zctransdetails.get(i).getZctrans()
					.getTransid());

			zctransdetail.setUserinformation(userinformation);
			zctransdetail.setAsset(asset);
			zctransdetail.setZctrans(zctrans);
			zctransdetail.setJsresult(this.zctransdetails.get(i).getJsresult());
			zctransdetail.setTdid(this.zctransdetails.get(i).getTdid());

			// aaData.add(asset);
			aaData.add(zctransdetail);
		}
		int recordsTotal;
		int recordsFiltered;
		// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
		dataMap = new HashMap<String, Object>();
		recordsTotal = aaData.size();
		recordsFiltered = recordsTotal;
		if (start + length > recordsTotal) {
			dataMap.put("aaData", aaData.subList(start, recordsTotal));
		} else {
			dataMap.put("aaData", aaData.subList(start, length));
		}

		/* dataMap.put("aaData", aaData); */
		dataMap.put("recordsTotal", recordsTotal);
		dataMap.put("recordsFiltered", recordsFiltered);
		// 返回结果
		return SUCCESS;
	}

	public String transOK() throws Exception {
		Userinformation loginuserinformation = new Userinformation();
		loginuserinformation = (Userinformation) ActionContext.getContext()
				.getSession().get("loginuser");
		userid = loginuserinformation.getUserid();
		int j = 1;
		this.zctransdetails = assetService.getZctransdetailList(userid);
		Date nowTime = new Date(System.currentTimeMillis());
		/*
		 * SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd");
		 * String retStrFormatNowDate = sdFormatter.format(nowTime);
		 */

		Zctransdetail zctransdetail = new Zctransdetail();
		zctransdetail = assetService.findById(Zctransdetail.class, tdid);

		zctransdetail.setJsstate(nowTime);
		zctransdetail.setJsresult(0);
		assetService.saveOrUpdate(zctransdetail);

		assetid = zctransdetail.getAsset().getAssetid();
		Asset asset = new Asset();
		asset = assetService.findById(Asset.class, assetid);
		Userinformation userinformationByUserid = new Userinformation();
		userinformationByUserid.setUserid(userid);

		asset.setUserinformationByUserid(userinformationByUserid);
		assetService.saveOrUpdate(asset);

		for (int i = 0; i < this.zctransdetails.size(); i++) {

			if (zctransdetails.get(i).getJsresult() != 2) {
				j++;
			}
		}
		System.out.print(this.zctransdetails.size());
		System.out.print("==========" + j);
		if (this.zctransdetails.size() == j) {
			transid = zctransdetail.getZctrans().getTransid();
			Zctrans zctrans = new Zctrans();
			zctrans = assetService.findById(Zctrans.class, transid);
			zctrans.setEnddate(nowTime);
			zctrans.setTranstate(1);
			assetService.saveOrUpdate(zctrans);
		}

		return SUCCESS;

	}

	public String transNO() throws Exception {
		Userinformation loginuserinformation = new Userinformation();
		loginuserinformation = (Userinformation) ActionContext.getContext()
				.getSession().get("loginuser");
		userid = loginuserinformation.getUserid();
		int j = 1;
		this.zctransdetails = assetService.getZctransdetailList(userid);
		Date nowTime = new Date(System.currentTimeMillis());
		/*
		 * SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd");
		 * String retStrFormatNowDate = sdFormatter.format(nowTime);
		 */

		Zctransdetail zctransdetail = new Zctransdetail();
		zctransdetail = assetService.findById(Zctransdetail.class, tdid);

		zctransdetail.setJsstate(nowTime);
		zctransdetail.setJsresult(1);
		assetService.saveOrUpdate(zctransdetail);

		for (int i = 0; i < this.zctransdetails.size(); i++) {

			if (zctransdetails.get(i).getJsresult() != 2) {
				j++;
			}
		}
		// System.out.print(j);
		if (this.zctransdetails.size() == j) {
			transid = zctransdetail.getZctrans().getTransid();
			Zctrans zctrans = new Zctrans();
			zctrans = assetService.findById(Zctrans.class, transid);
			zctrans.setEnddate(nowTime);
			zctrans.setTranstate(1);
			assetService.saveOrUpdate(zctrans);
		}

		return SUCCESS;

	}

	public String transState() {
		Userinformation loginuserinformation = new Userinformation();
		loginuserinformation = (Userinformation) ActionContext.getContext()
				.getSession().get("loginuser");
		userid = loginuserinformation.getUserid();
		/* this.assets = assetService.getList(Asset.class); */
		this.zctranss = assetService.getZctransList(userid);
		// System.out.print(this.zctranss.size());
		dataMap = new HashMap<String, Object>();
		if (this.zctranss.size() == 1) {
			dataMap.put("transState", 0);
		} else {
			dataMap.put("transState", 1);
		}

		// 返回结果
		return SUCCESS;
	}

	/**
	 * 统计报表
	 * 
	 * @return
	 */
	public String getStatistics() {
		dataMap = new HashMap<String, Object>();
		List<Assetclass> assetclasses = new ArrayList<Assetclass>();
		assetclasses = iAssetClassService.getList(Assetclass.class);
		for (Assetclass assetclass : assetclasses) {
			assetclass.setAssetsForAssetclassid(null);
			assetclass.setAssetsForPassetclassid(null);
			assetclass.setPurchasedetailsForAssetclassid(null);
			assetclass.setPurchasedetailsForPassetclassid(null);
		}
		dataMap.put("assetclasses", assetclasses);
		return SUCCESS;
	}

	// 统计报表-按资产类别
	public String getAssetListByClass() {
		List<Asset> aaData = new ArrayList<Asset>();
		List<Asset> myAssets = new ArrayList<Asset>();
		if (typeFlag.equals("big")) {
			myAssets = assetService.getBigAssetList(iassetclassid);
		} else if (typeFlag.equals("small")) {
			myAssets = assetService.getSmallAssetList(assetclassid);
		} else {
			myAssets = assetService.getList(Asset.class);
		}

		for (Asset asset : myAssets) {
			Asset myAsset = new Asset();
			Purchasedetail purchasedetail = new Purchasedetail();
			Userinformation userinformationByUserid = new Userinformation();
			Assetclass assetclass = new Assetclass();
			Assetclass passetclass = new Assetclass();

			userinformationByUserid.setUserid(asset
					.getUserinformationByUserid().getUserid());
			assetclass.setAssetclassid(asset.getAssetclassByAssetclassid()
					.getAssetclassid());
			if (asset.getAssetclassByPassetclassid() != null) {
				passetclass.setAssetclassid(asset
						.getAssetclassByPassetclassid().getAssetclassid());
			}
			purchasedetail.setPdid(asset.getPurchasedetail().getPdid());

			myAsset.setAssetclassByAssetclassid(assetclass);
			myAsset.setAssetclassByPassetclassid(passetclass);
			myAsset.setUserinformationByUserid(userinformationByUserid);
			myAsset.setPurchasedetail(purchasedetail);

			myAsset.setAssetid(asset.getAssetid());
			myAsset.setCardnum(asset.getCardnum());
			myAsset.setAssetname(asset.getAssetname());
			myAsset.setAssetcoding(asset.getAssetcoding());
			myAsset.setPrice(asset.getPrice());
			myAsset.setUsestate(asset.getUsestate());

			aaData.add(myAsset);
		}
		int recordsTotal;
		int recordsFiltered;
		// dataMap中的数据将会被Struts2转换成JSON字符串，所以这里要先清空其中的数据
		dataMap = new HashMap<String, Object>();
		recordsTotal = aaData.size();
		recordsFiltered = recordsTotal;
		if (start + length > recordsTotal) {
			dataMap.put("aaData", aaData.subList(start, recordsTotal));
		} else {
			dataMap.put("aaData", aaData.subList(start, start + length));
		}

		/* dataMap.put("aaData", aaData); */
		dataMap.put("recordsTotal", recordsTotal);
		dataMap.put("recordsFiltered", recordsFiltered);
		// 返回结果
		return SUCCESS;
	}

	@JSON(serialize = false)
	public String getKey() {
		return key;
	}

	public IAssetService getAssetService() {
		return assetService;
	}

	public void setAssetService(IAssetService assetService) {
		this.assetService = assetService;
	}

	public Integer getAssetid() {
		return assetid;
	}

	public void setAssetid(Integer assetid) {
		this.assetid = assetid;
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

	public Integer getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getUseruid() {
		return useruid;
	}

	public void setUseruid(Integer useruid) {
		this.useruid = useruid;
	}

	public Integer getCwuid() {
		return cwuid;
	}

	public void setCwuid(Integer cwuid) {
		this.cwuid = cwuid;
	}

	public Integer getPdid() {
		return pdid;
	}

	public void setPdid(Integer pdid) {
		this.pdid = pdid;
	}

	public String getCardnum() {
		return cardnum;
	}

	public String getTypeFlag() {
		return typeFlag;
	}

	public void setTypeFlag(String typeFlag) {
		this.typeFlag = typeFlag;
	}

	public int getIassetclassid() {
		return iassetclassid;
	}

	public void setIassetclassid(int iassetclassid) {
		this.iassetclassid = iassetclassid;
	}

	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}

	public Integer getZkstate() {
		return zkstate;
	}

	public void setZkstate(Integer zkstate) {
		this.zkstate = zkstate;
	}

	public Integer getCwstate() {
		return cwstate;
	}

	public void setCwstate(Integer cwstate) {
		this.cwstate = cwstate;
	}

	public String getGgxh() {
		return ggxh;
	}

	public void setGgxh(String ggxh) {
		this.ggxh = ggxh;
	}

	public Integer getUsestate() {
		return usestate;
	}

	public void setUsestate(Integer usestate) {
		this.usestate = usestate;
	}

	public String getAssetname() {
		return assetname;
	}

	public void setAssetname(String assetname) {
		this.assetname = assetname;
	}

	public Integer getCgbid() {
		return cgbid;
	}

	public void setCgbid(Integer cgbid) {
		this.cgbid = cgbid;
	}

	public Timestamp getIntodate() {
		return intodate;
	}

	public void setIntodate(Timestamp intodate) {
		this.intodate = intodate;
	}

	public String getCwcoding() {
		return cwcoding;
	}

	public void setCwcoding(String cwcoding) {
		this.cwcoding = cwcoding;
	}

	public String getAssetcoding() {
		return assetcoding;
	}

	public void setAssetcoding(String assetcoding) {
		this.assetcoding = assetcoding;
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

	public Date getInsertdate() {
		return insertdate;
	}

	public void setInsertdate(Date insertdate) {
		this.insertdate = insertdate;
	}

	public String getAunit() {
		return aunit;
	}

	public void setAunit(String aunit) {
		this.aunit = aunit;
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public List<Asset> getAssets() {
		return assets;
	}

	public void setAssets(List<Asset> assets) {
		this.assets = assets;
	}

	public Integer getLyghid() {
		return lyghid;
	}

	public void setLyghid(Integer lyghid) {
		this.lyghid = lyghid;
	}

	public Date getLydate() {
		return lydate;
	}

	public void setLydate(Date lydate) {
		this.lydate = lydate;
	}

	public Integer getLyghstate() {
		return lyghstate;
	}

	public void setLyghstate(Integer lyghstate) {
		this.lyghstate = lyghstate;
	}

	public Integer getLyuserid() {
		return lyuserid;
	}

	public void setLyuserid(Integer lyuserid) {
		this.lyuserid = lyuserid;
	}

	public Integer getGhuserid() {
		return ghuserid;
	}

	public void setGhuserid(Integer ghuserid) {
		this.ghuserid = ghuserid;
	}

	public Date getGhdate() {
		return ghdate;
	}

	public void setGhdate(Date ghdate) {
		this.ghdate = ghdate;
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

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Date getBfdate() {
		return bfdate;
	}

	public void setBfdate(Date bfdate) {
		this.bfdate = bfdate;
	}

	public Date getCheckdate() {
		return checkdate;
	}

	public void setCheckdate(Date checkdate) {
		this.checkdate = checkdate;
	}

	public Integer getBfstate() {
		return bfstate;
	}

	public void setBfstate(Integer bfstate) {
		this.bfstate = bfstate;
	}

	public Integer getBfid() {
		return bfid;
	}

	public void setBfid(Integer bfid) {
		this.bfid = bfid;
	}

	public Integer getCheckuid() {
		return checkuid;
	}

	public void setCheckuid(Integer checkuid) {
		this.checkuid = checkuid;
	}

	public List<Baofei> getBaofeis() {
		return baofeis;
	}

	public void setBaofeis(List<Baofei> baofeis) {
		this.baofeis = baofeis;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getShqk() {
		return shqk;
	}

	public void setShqk(String shqk) {
		this.shqk = shqk;
	}

	public Float getRprice() {
		return rprice;
	}

	public void setRprice(Float rprice) {
		this.rprice = rprice;
	}

	public Integer getRstate() {
		return rstate;
	}

	public void setRstate(Integer rstate) {
		this.rstate = rstate;
	}

	public Integer getBeforestate() {
		return beforestate;
	}

	public void setBeforestate(Integer beforestate) {
		this.beforestate = beforestate;
	}

	public List<Repairs> getRepair() {
		return repair;
	}

	public void setRepair(List<Repairs> repair) {
		this.repair = repair;
	}

	public List<Zclygh> getZclyghs() {
		return zclyghs;
	}

	public void setZclyghs(List<Zclygh> zclyghs) {
		this.zclyghs = zclyghs;
	}

	public Integer getTbid() {
		return tbid;
	}

	public void setTbid(Integer tbid) {
		this.tbid = tbid;
	}

	public Date getOutdate() {
		return outdate;
	}

	public void setOutdate(Date outdate) {
		this.outdate = outdate;
	}

	public String getOutnote() {
		return outnote;
	}

	public void setOutnote(String outnote) {
		this.outnote = outnote;
	}

	public Integer getTbstate() {
		return tbstate;
	}

	public void setTbstate(Integer tbstate) {
		this.tbstate = tbstate;
	}

	public Date getInputdate() {
		return inputdate;
	}

	public void setInputdate(Date inputdate) {
		this.inputdate = inputdate;
	}

	public Integer getDcuid() {
		return dcuid;
	}

	public void setDcuid(Integer dcuid) {
		this.dcuid = dcuid;
	}

	public Integer getDcdid() {
		return dcdid;
	}

	public void setDcdid(Integer dcdid) {
		this.dcdid = dcdid;
	}

	public List<Transbill> getTransbills() {
		return transbills;
	}

	public void setTransbills(List<Transbill> transbills) {
		this.transbills = transbills;
	}

	public Integer getDruid() {
		return druid;
	}

	public void setDruid(Integer druid) {
		this.druid = druid;
	}

	public Integer getDrdid() {
		return drdid;
	}

	public void setDrdid(Integer drdid) {
		this.drdid = drdid;
	}

	public Integer getJsuserid() {
		return jsuserid;
	}

	public void setJsuserid(Integer jsuserid) {
		this.jsuserid = jsuserid;
	}

	public List<Zctransdetail> getZctransdetails() {
		return zctransdetails;
	}

	public void setZctransdetails(List<Zctransdetail> zctransdetails) {
		this.zctransdetails = zctransdetails;
	}

	public Integer getTdid() {
		return tdid;
	}

	public void setTdid(Integer tdid) {
		this.tdid = tdid;
	}

	public Integer getTransid() {
		return transid;
	}

	public void setTransid(Integer transid) {
		this.transid = transid;
	}

	public List<Zctrans> getZctranss() {
		return zctranss;
	}

	public void setZctranss(List<Zctrans> zctranss) {
		this.zctranss = zctranss;
	}
}
