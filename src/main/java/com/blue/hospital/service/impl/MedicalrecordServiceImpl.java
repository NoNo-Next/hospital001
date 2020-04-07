package com.blue.hospital.service.impl;

import com.blue.hospital.dao.MedicalrecordMapper;
import com.blue.hospital.entity.Medicalrecord;
import com.blue.hospital.service.MedicalrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MedicalrecordServiceImpl implements MedicalrecordService {

	@Autowired
	MedicalrecordMapper medicalrecordMapper;

	@Override
	public List<Medicalrecord> getMedicalrecord() {

		List<Medicalrecord> list = medicalrecordMapper.queryAll();

		ArrayList<Medicalrecord> mlist = new ArrayList<Medicalrecord>();

		for (Medicalrecord m : list) {

			if (m.getIddelete().equals("0") ) {

				mlist.add(m);
			}
		}
		return mlist;
	}

	@Override
	public Integer addMedicalrecord(Medicalrecord medicalrecord) {

		return medicalrecordMapper.insertSelective(medicalrecord);
	}

	@Override
	public Medicalrecord getMedicalrecordById(Integer id) {

		return medicalrecordMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateMedicalRecordById(Medicalrecord medicalrecordid) {

		return medicalrecordMapper.updateByPrimaryKeySelective(medicalrecordid);
	}

	@Override
	public Integer deleteMedicalRecordById(Integer medicalrecordid) {
		
		return medicalrecordMapper.deleteMedicalRecordById(medicalrecordid);
	}

}
