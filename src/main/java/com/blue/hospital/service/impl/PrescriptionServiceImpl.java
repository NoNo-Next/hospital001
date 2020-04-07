package com.blue.hospital.service.impl;

import com.blue.hospital.dao.PrescriptionMapper;
import com.blue.hospital.entity.Prescription;
import com.blue.hospital.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired
	PrescriptionMapper prescriptionMapper;

	@Override
	public List<Prescription> getPrescription() {

		List<Prescription> list = prescriptionMapper.queryAll();

		ArrayList<Prescription> plist = new ArrayList<Prescription>();

		for (Prescription p : list) {

			if (p.getIsdelete() == 0) {

				plist.add(p);
			}
		}
		return plist;
	}

	@Override
	public Integer addPrescription(Prescription prescription) {

		return prescriptionMapper.insertSelective(prescription);
	}

	@Override
	public Prescription getPrescriptionById(Integer pid) {

		return prescriptionMapper.selectByPrimaryKey(pid);
	}

	@Override
	public Integer updatePrescriptionByNumber(Prescription prescriptionnumber) {

		return prescriptionMapper.updateByPrimaryKeySelective(prescriptionnumber);
	}

	@Override
	public Integer deletePrescriptionById(Integer prescriptionnumber) {
		
		return prescriptionMapper.deletePrescriptionById(prescriptionnumber);
	}

}
