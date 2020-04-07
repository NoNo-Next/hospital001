package com.blue.hospital.controller;


import com.blue.hospital.entity.Drugstorage;
import com.blue.hospital.service.DrugStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/DrugStorage")
@Controller
public class DrugStorageController {
	
	
	@Autowired
	DrugStorageService drugStorageService;
	
	
	@RequestMapping("/getAllDrugStorage")
	@ResponseBody
	public List<Drugstorage> getAllDrugStorage(){
		return 	drugStorageService.getAllDrugStorage();
	}

	@RequestMapping("/delDsById")
	@ResponseBody
	public int delDsById(Integer dsid){
		return 	drugStorageService.delDsById(dsid);
	}

}
