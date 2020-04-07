package com.blue.hospital.controller;

import com.blue.hospital.entity.Worktime;
import com.blue.hospital.service.WorkTimeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;



@Controller
@RequestMapping("/worktime")
public class WorkTimeController {

	@Resource
	WorkTimeService workTimeService;

	@RequestMapping("/addWorktime")
	@ResponseBody
	public Integer addWorktime(Worktime worktime) {

		return workTimeService.addWorkTime(worktime);
	}
	
	
	@RequestMapping("/updateWorkTimeById")
	@ResponseBody
	public Integer updateWorkTimeById(Worktime worktime) {
		
		return workTimeService.updateWorkTimeById(worktime);
	}

	@RequestMapping("/queryWorkTime")
	@ResponseBody
	public List<Worktime> queryWorkTime() {

		List<Worktime> list = workTimeService.queryWorkTimeInfo();

		return list;
	}

	@RequestMapping("/getWorktimeById")
	@ResponseBody
	public Worktime getWorktimeById(Integer wkid) {

		return workTimeService.queryWorkTimeById(wkid);
	}

}
