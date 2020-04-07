package com.blue.hospital.service;


import com.blue.hospital.entity.Operationroom;
import com.blue.hospital.entity.OperationroomExample;

import java.util.List;

public interface OperationroomService {
	
	
	/**
	 * 下拉全查询
	 * @param example
	 * @return
	 */
	List<Operationroom> queryAll(OperationroomExample example);

}
