package com.service;

import java.util.List;

import com.model.Purchase;
import com.model.Purchasedetail;

public interface IPurchaseService extends IBaseService {
	public List<Purchase> findPurchase(Integer departmentid, Integer purstate);
	public List<Purchasedetail> getPurchaseDetailList(Integer purid);
	public List<Purchasedetail> findPurchaseDetail(Integer purid, String assetname);
}
