package com.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.IPurchaseDao;
import com.model.Purchase;
import com.model.Purchasedetail;

/*
 * @author 林连升
 * 
 * */
@Transactional
public class PurchaseDao extends BaseDao implements IPurchaseDao {

	/*@Override
	public boolean create(Purchase purchase) {
		try {
			System.out.println("PurchaseDao Create");
			System.out.println(purchase.getBuydate());
			System.out.println(purchase.getPurstate());
			super.getHibernateTemplate().save(purchase);
			return true;
		} catch (Exception e) {
			return false;
		}
	}*/

	@Override
	public List<Purchase> findPurchase(Integer departmentid, Integer purstate) {
		int i = 0;
		List<Object> condList = new ArrayList<Object>();
		String selection = "select purchase from Purchase as purchase";
		if (departmentid != null) {
			condList.add(departmentid);
			i++;
			selection = selection
					+ " where purchase.department.departmentid=? ";
		}
		if (purstate != null) {
			condList.add(purstate);
			if (i == 1) {
				selection = selection + "and purchase.purstate=?";
			} else {
				selection = selection + " where purchase.purstate=?";
			}

		}
		Object o[] = condList.toArray();
		return this.getHibernateTemplate().find(selection, o);
	}

	@Override
	public List<Purchasedetail> getPurchaseDetailList(Integer purid) {
		Object o[]={purid};
		return this.getHibernateTemplate().find(
			"select purchasedetail from Purchasedetail as purchasedetail where purchasedetail.purchase.purid=? ", o);
	}

	@Override
	public List<Purchasedetail> findPurchaseDetail(Integer purid, String assetname) {
		List<Object> condList = new ArrayList<Object>();
		condList.add(purid);
		String selection="select purchasedetail from Purchasedetail as purchasedetail where purchasedetail.purchase.purid=?";
		if(assetname != null){
			condList.add("%"+assetname+"%");
			selection =selection+" and purchasedetail.assetname like ?";
		}
		Object o[] = condList.toArray();
		return this.getHibernateTemplate().find(selection, o);
	}

}
