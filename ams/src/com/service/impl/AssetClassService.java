package com.service.impl;

import java.util.List;

import com.dao.impl.AssetClassDao;
import com.model.Assetclass;
import com.service.IAssetClassService;

public class AssetClassService extends BaseService implements IAssetClassService {
	private AssetClassDao assetClassDao;

	public AssetClassDao getAssetClassDao() {
		return assetClassDao;
	}

	public void setAssetClassDao(AssetClassDao assetClassDao) {
		this.assetClassDao = assetClassDao;
	}
	@Override
	public List<Assetclass> getLikeName(String name) {
		return assetClassDao.findAssetclassLikeName(name);
	}

}
