package com.service;

import java.util.List;

import com.model.Assetclass;

public interface IAssetClassService extends IBaseService{
	public List<Assetclass> getLikeName(String name);

}
