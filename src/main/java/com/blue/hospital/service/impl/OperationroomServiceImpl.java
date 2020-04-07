package com.blue.hospital.service.impl;

import com.blue.hospital.dao.OperationroomMapper;
import com.blue.hospital.entity.Operationroom;
import com.blue.hospital.entity.OperationroomExample;
import com.blue.hospital.service.OperationroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class OperationroomServiceImpl implements OperationroomService {

	@Autowired
	OperationroomMapper operationroomMapper;
	
	@Override
	public List<Operationroom> queryAll(OperationroomExample example) {
		
		return operationroomMapper.selectByExample(example);
	}

}
