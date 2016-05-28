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

	public List<Zclygh> getLyList(Integer lyghstate) {
		return this.assetDao.getLyList(lyghstate);
	}

	public List<Asset> getAssetList(Integer zkstate, String assetname) {
		return this.assetDao.getAssetList(zkstate, assetname);
	}

	public List<Asset> getTransAssetList(Integer zkstate, Integer userid) {
		return this.assetDao.getTransAssetList(zkstate, userid);
	}

	public List<Baofei> getBaofeiList(Integer bfstate) {
		return this.assetDao.getBaofeiList(bfstate);
	}

	public List<Repairs> getRepairsList(Integer rstate) {
		return this.assetDao.getRepairsList(rstate);
	}

	public List<Transbill> getTransbillList(Integer tbstate) {
		return this.assetDao.getTransbillList(tbstate);
	}

	public List<Transbill> getAssetTransbillList(Integer assetid) {
		return this.assetDao.getAssetTransbillList(assetid);
	}

	public List<Zctransdetail> getZctransdetailList(Integer userid) {
		return this.assetDao.getZctransdetailList(userid);
	}

	public List<Zctrans> getZctransList(Integer yjuserid) {
		return this.assetDao.getZctransList(yjuserid);
	}

	@Override
	public List<Asset> getBigAssetList(Integer iassetclassid) {
		Integer myiassetclassid;
		if (iassetclassid != null) {
			List<Asset> assets = assetDao.getList(Asset.class);
			for (int i = 0; i < assets.size();) {
				myiassetclassid = assets.get(i).getAssetclassByAssetclassid()
						.getIassetclassid();
				if (myiassetclassid != null) {
					if (!myiassetclassid.equals(iassetclassid)) {
						assets.remove(i);
					} else {
						i++;
					}
				} else {
					if (!iassetclassid.equals(assets.get(i)
							.getAssetclassByAssetclassid().getAssetclassid())) {
						assets.remove(i);
					} else {
						i++;
					}
				}
			}
			return assets;
		} else {
			return assetDao.getList(Asset.class);
		}
	}

	@Override
	public List<Asset> getSmallAssetList(Integer assetclassid) {
		Integer myassetclassid;
		if (assetclassid != null) {
			List<Asset> assets = assetDao.getList(Asset.class);
			for (int i = 0; i < assets.size();) {
				myassetclassid = assets.get(i).getAssetclassByAssetclassid()
						.getAssetclassid();
				if (!myassetclassid.equals(assetclassid)) {
					assets.remove(i);
				} else {
					i++;
				}
			}
			return assets;
		} else {
			return assetDao.getList(Asset.class);
		}
	}

	public List<Asset> getAssetList(String assetname, String assetcoding) {
		return this.assetDao.getAssetList(assetname, assetcoding);
	}
}
