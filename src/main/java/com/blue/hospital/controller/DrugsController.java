package com.blue.hospital.controller;


import com.blue.hospital.entity.Drugs;
import com.blue.hospital.service.DrugsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/drugs")
public class DrugsController {
	
	@Resource
	DrugsService drugsService;
	
	@RequestMapping("/queryDrugs")
	@ResponseBody
	public List<Drugs> getDrugs() {
		
		List<Drugs> list = drugsService.getDrugs();
		
		if (list == null) {
			return new ArrayList<>();
		}
		
		return list;
	}
	
	
	@RequestMapping("/getAll")
	@ResponseBody
	public List<Drugs>   getAll(){
	
		return  drugsService.getAll();
	}
	
	@RequestMapping("/getDrugByid")
	@ResponseBody
	public Drugs getDrugByid(Integer drugsid){
		
		return drugsService.getDrugByid(drugsid);
	}
	
	@RequestMapping("/updateDrugs")
	@ResponseBody
	public int  updateDrugs(Drugs drugs){
		
		return drugsService.updateDrugs(drugs);
		
		
	}
	
	@RequestMapping("/insertdrugs")
	@ResponseBody
	public int insertdrugs(Drugs drugs){
		
	return 	drugsService.insertdrugs(drugs);
		
	}
	
	
	@RequestMapping("/delDruds")
	@ResponseBody
	public int delsup(Integer drugsid){
	 return  drugsService.delsup(drugsid);
	}
	


}
