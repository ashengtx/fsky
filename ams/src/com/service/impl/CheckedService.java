package com.service.impl;

import java.util.List;

import com.dao.ICheckedDao;
import com.model.Checkdetail;
import com.model.Checked;
import com.service.ICheckedService;


public class CheckedService extends BaseService implements ICheckedService {
	private  ICheckedDao iCheckedDao;
	
	

	public ICheckedDao getiCheckedDao() {
		return iCheckedDao;
	}



	public void setiCheckedDao(ICheckedDao iCheckedDao) {
		this.iCheckedDao = iCheckedDao;
	}



	public List<Checked> getCheckedlList(Integer cstate){
		return iCheckedDao.getCheckedList(cstate);
	}
	
	public List<Checked> getAllChecked(){
		return iCheckedDao.getAllChecked();
	}
	
	public List<Checkdetail> getCheckdetailList(Integer checkid,Integer cresult){
		return iCheckedDao.getCheckdetailList(checkid,cresult);
	}


}
