package com.service;

import java.util.List;

import com.model.Checkdetail;
import com.model.Checked;


public interface ICheckedService extends IBaseService  {

	public List<Checked> getCheckedlList(Integer cstate);
	public List<Checked> getAllChecked();
	public List<Checkdetail> getCheckdetailList(Integer checkid,Integer cresult);

}
