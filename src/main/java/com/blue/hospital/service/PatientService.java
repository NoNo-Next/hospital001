package com.blue.hospital.service;


import com.blue.hospital.entity.Patient;

import java.util.List;

public interface PatientService {

	Patient getinfoByid(Integer patientid);

	int updateinfo(Patient patient);

	int delinfo(Integer patientid);

	int addinfo(Patient patient);

	/*返回所有病人信息*/
    List<Patient> getAllPatient();
}
