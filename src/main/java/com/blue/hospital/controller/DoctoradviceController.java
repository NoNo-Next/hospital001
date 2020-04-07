package com.blue.hospital.controller;


import com.blue.hospital.entity.Doctoradvice;
import com.blue.hospital.service.DoctoradviceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/doctoradvice")

public class DoctoradviceController {
	
	
	@Resource
	DoctoradviceService doctoradviceService;
	
	@RequestMapping("/queryDoctoradvice")
	@ResponseBody
	public List<Doctoradvice> getDoctoradvice() {
		
		List<Doctoradvice> list = doctoradviceService.getDoctoradvice();
		
		if (list == null) {
			return new ArrayList<Doctoradvice>();
		}
		
		return list;
	}
	
	

}
