package com.oasys.Office.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.Office.Entity.Office;
import com.oasys.Office.Service.OfficeService;


@RestController
@RequestMapping(value="/office")
@CrossOrigin(origins="http://localhost:4200")
public class OfficeController {
	@Autowired
	 OfficeService Oservice;
		
		@PostMapping(value="/insert")
		public Office insertOffice(@RequestBody Office o){
			return Oservice.insertOffice(o);
		}
		@GetMapping(value="/findOffice/{o}")
		public Office findOffice(@PathVariable int o)
		{
			return Oservice.findOffice(o);
		}
		@DeleteMapping(value="/iddelete/{o                                                                          }")
		public Office deleteOffice(@PathVariable int o)
		{
			return Oservice.deleteOffice(o);
		}
		@PutMapping(value="/update")
		public Office updateoffice(@RequestBody Office o)
		{
			return Oservice.updateoffice(o);
		}
		@GetMapping(value="/getAll")
		public List<Office> findAllOffice()
		{
			return Oservice.findAllOffice();
		}
		

}
