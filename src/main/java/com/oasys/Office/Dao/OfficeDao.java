package com.oasys.Office.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.Office.Entity.Office;
import com.oasys.Office.Repository.OfficeRepository;
@Repository
public class OfficeDao {
@Autowired
OfficeRepository Or;
	public Office insertOffice(Office o) {
		// TODO Auto-generated method stub
		Or.save(o);
		return o;
	}
	public Office findOffice(int o) {
		// TODO Auto-generated method stub
		return Or.findById(o).get();
	}
	public Office deleteOffice(int o) {
		// TODO Auto-generated method stub
		Office off = Or.findById(o).get();
		Or.deleteById(o);
		return off;
	}
	public Office updateoffice(Office o) {
		// TODO Auto-generated method stub
		Or.save(o);

		return o;
	}
	public List<Office> findAllOffice() {
		// TODO Auto-generated method stub
		return Or.findAll();
	}
	

}
