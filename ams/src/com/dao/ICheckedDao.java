package com.dao;

import java.util.List;

import com.model.Checkdetail;
import com.model.Checked;



public interface ICheckedDao extends IBaseDao{
	public List<Checked> getCheckedList(Integer cstate);
	public List<Checked> getAllChecked();
	public List<Checkdetail> getCheckdetailList(Integer checkid,Integer cresult);
	
}
