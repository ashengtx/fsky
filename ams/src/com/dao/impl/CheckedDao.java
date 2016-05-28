package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.dao.ICheckedDao;
import com.model.Checkdetail;
import com.model.Checked;
public class CheckedDao extends BaseDao implements ICheckedDao {
	
	public List<Checked> getCheckedList(Integer cstate){
		  List<Object> condList = new ArrayList<Object>();
		  String selection="select checked from Checked as checked where checked.cstate != ? ";
		  condList.add(-1);
		  if(cstate != null){
			  condList.add(cstate);
			  selection =selection+" and checked.cstate = ?";
		  }
		  Object o[] = condList.toArray();
		  return this.getHibernateTemplate().find(selection,o);
	};
	public List<Checked> getAllChecked(){
		  List<Object> condList = new ArrayList<Object>();
		  String selection="select checked from Checked as checked where checked.cstate != ? ";
		  condList.add(-1);
		  Object o[] = condList.toArray();
		  return this.getHibernateTemplate().find(selection,o);
	};
	public List<Checkdetail> getCheckdetailList(Integer checkid,Integer cresult){
		  List<Object> condList = new ArrayList<Object>();
		  String selection="select checkdetail from Checkdetail as checkdetail where checkdetail.checked.checkid = ?";
		  condList.add(checkid);
		  if(cresult != null){
			  condList.add(cresult);
			  selection =selection+" and checkdetail.cresult = ?";
		  }
		  Object o[] = condList.toArray();
		  return this.getHibernateTemplate().find(selection,o);
	};
	
}
