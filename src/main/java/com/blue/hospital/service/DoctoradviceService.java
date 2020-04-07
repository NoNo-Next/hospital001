package com.blue.hospital.service;


import com.blue.hospital.entity.Doctoradvice;

import java.util.List;

public interface DoctoradviceService {

	/**
	 * 查询所有的医嘱名称
	 * @return
	 */
	List<Doctoradvice> getDoctoradvice();
}
