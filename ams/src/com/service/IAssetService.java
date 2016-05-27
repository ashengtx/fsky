package com.service;

import java.util.List;

import com.model.Baofei;
import com.model.Repairs;
import com.model.Transbill;
import com.model.Zclygh;
import com.model.Asset;
import com.model.Zctrans;
import com.model.Zctransdetail;

public interface IAssetService extends IBaseService {
	public  List<Zclygh> getLyList(Integer lyghstate);
	public List<Asset> getAssetList(Integer zkstate,String assetname);
	public List<Baofei> getBaofeiList (Integer bfstate);
	public List<Repairs> getRepairsList(Integer rstate);
	public List<Transbill> getTransbillList(Integer tbstate);
	public List<Transbill> getAssetTransbillList(Integer assetid);
	public List<Asset> getTransAssetList(Integer zkstate,Integer userid);
	public List<Zctransdetail> getZctransdetailList(Integer userid);
	public List<Zctrans> getZctransList(Integer yjuserid);
	
	public List<Asset> getAssetList(String assetname,String assetcoding);
}
