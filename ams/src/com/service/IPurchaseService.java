package com.service;

import java.util.List;

import com.model.Purchase;
import com.model.Purchasedetail;

public interface IPurchaseService extends IBaseService {
	public List<Purchase> findPurchase(Integer departmentid, Integer purstate);
	public List<Purchasedetail> getPurchasedetailList(Integer purid);
	public List<Purchasedetail> findPurchasedetail(Integer purid, String assetname);
}
