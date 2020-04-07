package com.blue.hospital.controller;

import com.blue.hospital.entity.Bed;
import com.blue.hospital.entity.BedExample;
import com.blue.hospital.service.BedSerevice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/bed")
public class BedController {
	
	@Resource(name="bedServiceImpl")
	BedSerevice bs;
	
	@Resource
	BedSerevice bedService;
	
	@RequestMapping("/queryBed")
	@ResponseBody
	public List<Bed> queryAllBed(){
		
		BedExample be = new BedExample();
		
		return bedService.queryAllBed(be);
	}
	
	@RequestMapping("/queryBedUserIcu")
	@ResponseBody
	public List<Bed> queryBedUser(){
		
		return bedService.queryBedUserIcu();
	}
	
	@RequestMapping("updateBed")
	@ResponseBody
	public Bed sendUpdate(Integer bid) {
		
		Bed bed = bs.selectByPrimaryKey(bid);
		
		return bed;
	}
	
	@RequestMapping("/saveBed")
	@ResponseBody
	public Integer saveUpdateBed(Bed bed) {
		
		return bedService.updateBedById(bed);
	}
	
	@RequestMapping("/addBed")
	@ResponseBody
	public Integer addBed(Bed bed) {
		
		return bedService.insertBed(bed);
	}

}
