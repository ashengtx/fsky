package com.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
//import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
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

	private SessionFactory sessionFactory;
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
	public List<Purchasedetail> getPurchasedetailList(Integer purid) {
		System.out.println("PurchaseDao getPurchasedetailList");
		String hql = "from Purchasedetail where purid=" + purid;
		System.out.println(hql);
		try {
			Query query = super.getSession().createQuery(hql);
			return query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Purchasedetail> findPurchasedetail(Integer purid, String assetname) {
		System.out.println("PurchaseDao findPurchasedetail");
		List<Object> condList = new ArrayList<Object>();
		condList.add(purid);
		String selection="from Purchasedetail where purchasedetail.purchase.purid=?";
		if(assetname != null){
			condList.add("%"+assetname+"%");
			selection =selection+" and purchasedetail.assetname like ?";
		}
		Object o[] = condList.toArray();
		return this.getHibernateTemplate().find(selection, o);
	}
	
	public List<Purchasedetail> findAllPD() {
		return this.getHibernateTemplate().find("select from Purchasedetail");
	}

}
