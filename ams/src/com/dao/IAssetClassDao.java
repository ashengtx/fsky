package com.dao;

import java.util.List;

import com.model.Assetclass;

public  interface IAssetClassDao {
	public List<Assetclass> findAssetclassLikeName(String name);
}

