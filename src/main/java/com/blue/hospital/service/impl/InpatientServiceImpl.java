package com.blue.hospital.service.impl;

import com.blue.hospital.dao.InpatientMapper;
import com.blue.hospital.entity.Inpatient;
import com.blue.hospital.entity.InpatientExample;
import com.blue.hospital.service.InpatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InpatientServiceImpl implements InpatientService {

	@Autowired
	InpatientMapper inpatientMapper;

	@Override
	public List<Inpatient> queryAllInpatient(InpatientExample example) {

		return inpatientMapper.selectByExample(example);
	}

	@Override
	public List<Inpatient> queryInpatientDepartment() {

		return inpatientMapper.queryInpatientDepartment();
	}

	@Override
	public Inpatient selectByPrimaryKey(Integer hid) {

		return inpatientMapper.selectByPrimaryKey(hid);
	}

	@Override
	public Integer updateInpatientById(Inpatient inpatient) {

		return inpatientMapper.updateByPrimaryKeySelective(inpatient);
	}

	@Override
	public Integer insertInpatient(Inpatient inpatient) {

		return inpatientMapper.insert(inpatient);
	}

	@Override
	public Integer getHospitalizationId(Integer patientid) {

		InpatientExample example = new InpatientExample();
		example.createCriteria().andPatientidEqualTo(patientid);

		List<Inpatient> list = inpatientMapper.selectByExample(example);

		return list != null ? list.get(0).getHospitalizationid() : -1;
	}

}
