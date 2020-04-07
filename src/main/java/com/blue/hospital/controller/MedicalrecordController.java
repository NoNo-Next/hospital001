package com.blue.hospital.controller;


import com.blue.hospital.entity.Medicalrecord;
import com.blue.hospital.service.MedicalrecordService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/medicalrecord")
public class MedicalrecordController {

	@Resource
	MedicalrecordService medicalrecordService;

	@RequestMapping("/queryMedicalrecord")
	@ResponseBody
	public List<Medicalrecord> getAllMedicalrecord() {

		List<Medicalrecord> list = medicalrecordService.getMedicalrecord();

		return list;
	}

	@RequestMapping("/addMedicalrecord")
	@ResponseBody

	public Integer addMedicalrecord(Medicalrecord medicalrecord) {

		Integer m = medicalrecordService.addMedicalrecord(medicalrecord);
		return m;

	}

	@RequestMapping("/getById")
	@ResponseBody
	public Medicalrecord getById(Integer mid) {

		Medicalrecord medicalrecord = medicalrecordService.getMedicalrecordById(mid);
		return medicalrecord;

	}

	@RequestMapping("/saveUpdateMedicalRecord")
	@ResponseBody

	public Integer saveUpdateMedicalRecord(Medicalrecord medicalrecordid) {

		return medicalrecordService.updateMedicalRecordById(medicalrecordid);
	}

	@RequestMapping("/deleteById")
	@ResponseBody
	public Integer deleteById(Integer medicalrecordid) {

		Integer m = medicalrecordService.deleteMedicalRecordById(medicalrecordid);

		return m;

	}

}
