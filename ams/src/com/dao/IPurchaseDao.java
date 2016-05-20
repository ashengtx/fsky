package com.dao;

import com.model.Purchase;

public interface IPurchaseDao extends IBaseDao{

	public boolean create(Purchase purchase);
}
