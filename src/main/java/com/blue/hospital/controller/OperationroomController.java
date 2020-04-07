package com.blue.hospital.controller;


import com.blue.hospital.entity.Operationroom;
import com.blue.hospital.entity.OperationroomExample;
import com.blue.hospital.service.OperationroomService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OperationroomController {
	
	@Resource
	OperationroomService operationroomService;
	
	@RequestMapping("/queryOperationroom")
	@ResponseBody
	public List<Operationroom> queryAll(){
		
		OperationroomExample oe = new OperationroomExample();
		
		return operationroomService.queryAll(oe);
	}

}
