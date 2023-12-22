package com.oasys.Office.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.Office.Dao.OfficeDao;
import com.oasys.Office.Entity.Office;
@Service
public class OfficeService {
@Autowired
OfficeDao oDao;
	public Office insertOffice(Office o) {
		// TODO Auto-generated method stub
		return oDao.insertOffice(o);
	}

	public Office findOffice(int o) {
		// TODO Auto-generated method stub
		return oDao.findOffice(o);
	}

	public Office deleteOffice(int o) {
		// TODO Auto-generated method stub
		return oDao.deleteOffice(o);
	}

	public Office updateoffice(Office o) {
		// TODO Auto-generated method stub
		return oDao.updateoffice(o);
	}

	public List<Office> findAllOffice() {
		// TODO Auto-generated method stub
		return oDao.findAllOffice();
	}

}
