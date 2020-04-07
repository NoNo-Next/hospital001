package com.blue.hospital.service.impl;


import com.blue.hospital.dao.BedMapper;
import com.blue.hospital.entity.Bed;
import com.blue.hospital.entity.BedExample;
import com.blue.hospital.service.BedSerevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedServiceImpl implements BedSerevice {

	@Autowired
	BedMapper bedMapper;
	
	@Override
	public List<Bed> queryAllBed(BedExample example) {
		
		return bedMapper.selectByExample(example);
	}

	@Override
	public List<Bed> queryBedUserIcu() {
	
		return bedMapper.queryBedUserIcu();
	}

	@Override
	public Bed selectByPrimaryKey(Integer bid) {
	
		return bedMapper.selectByPrimaryKey(bid);
	}

	@Override
	public Integer updateBedById(Bed bed) {

		return bedMapper.updateByPrimaryKeySelective(bed);
	}

	@Override
	public Integer insertBed(Bed bed) {

		return bedMapper.insertSelective(bed);
	}

}
