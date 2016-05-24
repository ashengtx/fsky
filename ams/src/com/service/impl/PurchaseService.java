package com.service.impl;

import java.util.List;

import com.dao.impl.PurchaseDao;
import com.model.Purchase;
import com.model.Purchasedetail;
import com.service.IPurchaseService;

/*
 * @author 林连升
 * 
 * */

public class PurchaseService extends BaseService implements IPurchaseService {

	private PurchaseDao purchaseDao;

	public PurchaseDao getPurchaseDao() {
		return purchaseDao;
	}

	public void setPurchaseDao(PurchaseDao purchaseDao) {
		this.purchaseDao = purchaseDao;
	}

	@Override
	public List<Purchase> findPurchase(Integer departmentid, Integer purstate) {
		return this.purchaseDao.findPurchase(departmentid, purstate);
	}

	@Override
	public List<Purchasedetail> getPurchaseDetailList(Integer purid) {
		return this.purchaseDao.getPurchaseDetailList(purid);
	}

	@Override
	public List<Purchasedetail> findPurchaseDetail(Integer purid,
			String assetname) {
		return this.purchaseDao.findPurchaseDetail(purid, assetname);
	}
	
	
}
