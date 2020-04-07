package com.blue.hospital.controller;


import com.blue.hospital.entity.Patient;
import com.blue.hospital.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/patient")
public class PatientController {

	@Resource
	PatientService patientService;

	@RequestMapping("/getPatient")
	@ResponseBody
	public List<Patient> getPatient() {

		List<Patient> list = patientService.getAllPatient();
		return list;
	}
 
	@RequestMapping("/getinfoByid")
	@ResponseBody
	public Patient getinfoByid(Integer patientid) {

		return patientService.getinfoByid(patientid);
	}

	@RequestMapping("/updateinfo")
	@ResponseBody
	public int updateinfo(Patient patient) {

		return patientService.updateinfo(patient);

	}

	@RequestMapping("/delPatient")
	@ResponseBody
	public int delPatient(Integer patientid) {

		return patientService.delinfo(patientid);

	}

//	添加病人
	@RequestMapping("/addPatient")
	@ResponseBody
	public int addPatient(Patient patient) {
		return patientService.addinfo(patient);
	}

}
