package com.blue.hospital.service;


import com.blue.hospital.entity.Register;

import java.util.List;

public interface RegisterService {
	
	
	/**
	 * 查询所有的科室名称
	 * @return
	 */
	List<Register> getRegister();
	
   /**
    * 根据病历id增加
    */
	Integer addRegister(Register Register);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	
	Register getRegisterById(Integer id);

	/**
	 * 根据病历id修改用户信息
	 * 
	 * @param Register
	 * @return
	 */
	Integer updateRegisterById(Register registerid);

	/**
	 * 假删除
	 * @param registerid
	 * @return
	 */
	Integer deleteRegisterById(Integer registerid);

}
