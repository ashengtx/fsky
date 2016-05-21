package com.service.impl;

import com.dao.impl.AssetClassDao;
import com.service.IAssetClassService;
import com.service.IUserService;

public class AssetClassService extends BaseService implements IAssetClassService {
	private AssetClassDao assetClassDao;

	public AssetClassDao getAssetClassDao() {
		return assetClassDao;
	}

	public void setAssetClassDao(AssetClassDao assetClassDao) {
		this.assetClassDao = assetClassDao;
	}
}
