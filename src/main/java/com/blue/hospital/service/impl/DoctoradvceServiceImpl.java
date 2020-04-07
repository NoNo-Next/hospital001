package com.blue.hospital.service.impl;

import com.blue.hospital.dao.DoctoradviceMapper;
import com.blue.hospital.entity.Doctoradvice;
import com.blue.hospital.entity.DoctoradviceExample;
import com.blue.hospital.service.DoctoradviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class DoctoradvceServiceImpl implements DoctoradviceService {

	
	@Autowired
	DoctoradviceMapper doctoradviceMapper;
	@Override
	public List<Doctoradvice> getDoctoradvice() {
	
		return doctoradviceMapper.selectByExample(new DoctoradviceExample());
	}

}
