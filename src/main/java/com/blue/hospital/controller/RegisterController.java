package com.blue.hospital.controller;


import com.blue.hospital.entity.Register;
import com.blue.hospital.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@Resource
	RegisterService registerService;

	@RequestMapping("/queryRegister")
	@ResponseBody
	public List<Register> getRegister() {

		List<Register> list = registerService.getRegister();

		return list;
	}

	@RequestMapping("/addRegister")
	@ResponseBody

	public Integer addRegister(Register Register) {

		Integer r = registerService.addRegister(Register);
		return r;
	}

	@RequestMapping("getById")
	@ResponseBody
	public Register getById(Integer rid) {

		Register Register = registerService.getRegisterById(rid);

		return Register;
	}

	@RequestMapping("saveUpdateRegister")
	@ResponseBody
	public Integer saveUpdateRegister(Register registerid) {

		return registerService.updateRegisterById(registerid);
	}

	
	@RequestMapping("/deleteById")
	@ResponseBody
	public Integer deleteById(Integer registerid) {

		Integer m = registerService.deleteRegisterById(registerid);

		return m;

	}
	
}
