package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.dao.IAssetClassDao;
import com.model.Assetclass;

public class AssetClassDao extends BaseDao implements IAssetClassDao {

	@Override
	public List<Assetclass> findAssetclassLikeName(String assetclassname) {
		List<Object> condList = new ArrayList<Object>();
		String selection = "select assetclass from Assetclass as assetclass ";
		if (assetclassname != null) {
			condList.add("%" + assetclassname + "%");
			selection = selection + " where assetclass.assetclassname like ?";
		}
		Object o[] = condList.toArray();
		return this.getHibernateTemplate().find(selection, o);
	}
}
