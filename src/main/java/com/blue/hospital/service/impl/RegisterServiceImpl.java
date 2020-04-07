package com.blue.hospital.service.impl;


import com.blue.hospital.dao.RegisterMapper;
import com.blue.hospital.entity.Register;
import com.blue.hospital.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {


	
	@Autowired
	RegisterMapper registerMapper;
	
	
	@Override
	public List<Register> getRegister(){

		List<Register> list =registerMapper.getAllRegister();
		return list;

	}
 
	@Override
	public Integer addRegister(Register Register) {
		
		return registerMapper.insert(Register);
	}

	@Override
	public Register getRegisterById(Integer id) {
		
		return registerMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateRegisterById(Register registerid) {
		
		return registerMapper.updateByPrimaryKeySelective(registerid);
	}

	@Override
	public Integer deleteRegisterById(Integer registerid) {
		return registerMapper.deleteByPrimaryKey(registerid);
		}
}
