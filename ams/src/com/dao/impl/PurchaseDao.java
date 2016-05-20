package com.dao.impl;

import java.io.Serializable;

import org.springframework.transaction.annotation.Transactional;

import com.dao.IPurchaseDao;
import com.model.Purchase;

@Transactional
public class PurchaseDao extends BaseDao implements IPurchaseDao {

	@Override
	public boolean create(Purchase purchase) {
		try{
			System.out.println("PurchaseDao Create");
			System.out.println(purchase.getBuydate());
			System.out.println(purchase.getPurstate());
			super.getHibernateTemplate().save(purchase);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	
}
