package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import com.dao.IAssetDao;
import com.model.Asset;
import com.model.Baofei;
import com.model.Repairs;
import com.model.Transbill;
import com.model.Userinformation;
import com.model.Zclygh;
import com.model.Zctrans;
import com.model.Zctransdetail;

public class AssetDao extends BaseDao implements IAssetDao {
	
	public List<Zclygh> getLyList(Integer lyghstate){
		System.out.println("AssetDao getLyList");
		String hql = "from Zclygh where lyghstate=" + lyghstate;
		System.out.println(hql);
		try {
			Query query = super.getSession().createQuery(hql);
			return query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Asset> getAssetList(Integer zkstate,String assetname){
		  List<Object> condList = new ArrayList<Object>();
		  condList.add(zkstate);
		  String selection="select asset from Asset as asset where asset.zkstate!=?";
		  if(assetname != null){
			  condList.add("%"+assetname+"%");
			  selection =selection+" and asset.assetname like ?"; 
		  }
		  Object o[] = condList.toArray();
		  return this.getHibernateTemplate().find(selection,o);
		
	}
	public List<Asset> getTransAssetList(Integer zkstate,Integer userid){
		 
		Object o[]={zkstate,userid};
		  String selection="select asset from Asset as asset where asset.zkstate!=? and asset.userinformationByUserid.userid=?";
		  
		 
		  return this.getHibernateTemplate().find(selection,o);
		
	}
	public List<Zctrans> getZctransList(Integer yjuserid){
		 
		Object o[]={yjuserid,0};
		  String selection="select zctrans from Zctrans as zctrans where zctrans.userinformationByYjuserid.userid=? and zctrans.transtate=?  ";
		  
		 
		  return this.getHibernateTemplate().find(selection,o);
		
	}
	
	public List<Baofei> getBaofeiList(Integer bfstate){
		System.out.println("AssetDao getTransbillList");
		String hql = "from Baofei where bfstate=" + bfstate;
		System.out.println(hql);
		try {
			Query query = super.getSession().createQuery(hql);
			return query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Repairs> getRepairsList(Integer rstate){
		System.out.println("AssetDao getRepairsList");
		String hql = "from Repairs where rstate=" + rstate;
		System.out.println(hql);
		try {
			Query query = super.getSession().createQuery(hql);
			return query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Transbill> getTransbillList(Integer tbstate){
		System.out.println("AssetDao getTransbillList");
		String hql = "from Transbill where tbstate=" + tbstate;
		System.out.println(hql);
		try {
			Query query = super.getSession().createQuery(hql);
			return query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Transbill> getAssetTransbillList(Integer assetid){
		Object o[]={assetid};
		return this.getHibernateTemplate().find("select transbill from Transbill as transbill where transbill.asset.assetid=? ",o);
		
	}
	
	public List<Zctransdetail> getZctransdetailList(Integer userid){
		Object o[]={userid,2};
		return this.getHibernateTemplate().find("select zctransdetail from Zctransdetail as zctransdetail where zctransdetail.userinformation.userid=? and zctransdetail.jsresult=?",o);
		
	}
	
}
