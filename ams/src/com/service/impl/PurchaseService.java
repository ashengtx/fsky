package com.service.impl;

import com.dao.impl.PurchaseDao;
import com.model.Purchase;
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
	public boolean creat(Purchase purchase) {
		System.out.println("PurchaseService Create");
		System.out.println(purchase.getBuydate());
		System.out.println(purchase.getPurstate());
		return this.purchaseDao.create(purchase);
	}
	
	
}
