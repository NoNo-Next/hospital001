package com.blue.hospital.service;


import com.blue.hospital.entity.Inpatient;
import com.blue.hospital.entity.InpatientExample;

import java.util.List;

public interface InpatientService {
	
	/**
	 * 查询所有下拉信息
	 * @param Example
	 * @return
	 */
	List<Inpatient> queryAllInpatient(InpatientExample example);
	
	/**
	 * 全查询
	 * @return
	 */
	List<Inpatient> queryInpatientDepartment();
	
	/**
	 * 根据主键查询对象
	 * @param hid
	 * @return
	 */
	Inpatient selectByPrimaryKey(Integer hid);
	
	/**
	 * 修改
	 * @param inpatient
	 * @return
	 */
	Integer updateInpatientById(Inpatient inpatient);
	
	/**
	 * 添加
	 * @param inpatient
	 * @return
	 */
	Integer insertInpatient(Inpatient inpatient);

	//根据id查询病人号
	Integer getHospitalizationId(Integer patientid);

}
