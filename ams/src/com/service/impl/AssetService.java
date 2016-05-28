package com.service.impl;
import java.util.List;

import com.dao.IAssetDao;
import com.model.Asset;
import com.model.Baofei;
import com.model.Repairs;
import com.model.Transbill;
import com.model.Zclygh;
import com.model.Zctrans;
import com.model.Zctransdetail;
import com.service.IAssetService;

public class AssetService extends BaseService implements IAssetService {
	private IAssetDao assetDao;

	public IAssetDao getAssetDao() {
		return assetDao;
	}

	public void setAssetDao(IAssetDao assetDao) {
		this.assetDao = assetDao;
	}
	public  List<Zclygh> getLyList(Integer lyghstate){
		return this.assetDao.getLyList(lyghstate);
	}
 
	public List<Asset> getAssetList(Integer zkstate,String assetname){
		return this.assetDao.getAssetList(zkstate,assetname);
	}
	public List<Asset> getTransAssetList(Integer zkstate,Integer userid){
		return this.assetDao.getTransAssetList(zkstate, userid);
	}
	
	public List<Baofei> getBaofeiList (Integer bfstate){
		return this.assetDao.getBaofeiList(bfstate);
	}
	
	public List<Repairs> getRepairsList(Integer rstate){
		return this.assetDao.getRepairsList(rstate);
	}
	public List<Transbill> getTransbillList(Integer tbstate){
		return this.assetDao.getTransbillList(tbstate);
	}
	public List<Transbill> getAssetTransbillList(Integer assetid){
		return this.assetDao.getAssetTransbillList(assetid);	
	}
	public List<Zctransdetail> getZctransdetailList(Integer userid){
		return this.assetDao.getZctransdetailList(userid);
	}
	public List<Zctrans> getZctransList(Integer yjuserid){
		return this.assetDao.getZctransList(yjuserid);
	}

	@Override
	public List<Asset> getAssetList(String assetname, String assetcoding) {
		return this.assetDao.getAssetList(assetname, assetcoding);
	}
}
