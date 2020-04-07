package com.blue.hospital.controller;


import com.blue.hospital.entity.Inpatient;
import com.blue.hospital.entity.InpatientExample;
import com.blue.hospital.service.InpatientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/inpatient")
public class InpatientController {
	
	@Resource
	InpatientService inpatientservice;
	
	@Resource(name="inpatientServiceImpl")
	InpatientService is;
	
	@RequestMapping("/queryInpatient")
	@ResponseBody
	public List<Inpatient> queryAllInpatient(){
		
		InpatientExample Ie = new InpatientExample();
		
		return inpatientservice.queryAllInpatient(Ie);
	}
	
	@RequestMapping("/queryInpatientDepartment")
	@ResponseBody
	public List<Inpatient> queryInpatientDepartment(){
		
		return inpatientservice.queryInpatientDepartment();
	}
	
	@RequestMapping("/updateInpatient")
	@ResponseBody
	public Inpatient sendUpdate(Integer hid) {
		
		Inpatient inpatient = is.selectByPrimaryKey(hid);
		
		return inpatient;
	}
	
	@RequestMapping("/saveInpatient")
	@ResponseBody
	public Integer saveupdateInpatient(Inpatient inpatient) {
		
		return inpatientservice.updateInpatientById(inpatient);
	}
	
	@RequestMapping("/addInpatient")
	@ResponseBody
	public Integer addInpatient(Inpatient inpatient) {
		
		return inpatientservice.insertInpatient(inpatient);
	}

}
