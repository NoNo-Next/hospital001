package com.blue.hospital.service.impl;

import com.blue.hospital.dao.DrugsMapper;
import com.blue.hospital.entity.Drugs;
import com.blue.hospital.entity.DrugsExample;
import com.blue.hospital.service.DrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class DrugsServiceImpl implements DrugsService {

	@Autowired
	DrugsMapper drugsMapper;

	@Override
	public List<Drugs> getDrugs() {

		return drugsMapper.selectByExample(new DrugsExample());
	}

	@Override
	public List<Drugs> getAll() {

		/*
		 * List<Drugs> list = drugsMapper.getAll();
		 * 
		 * ArrayList<Drugs> arrayList = new ArrayList<>();
		 * 
		 * for (Drugs a : list) {
		 * 
		 * if(a.getSpecifications()=="1") {
		 * 
		 * arrayList.add(a);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * return arrayList;
		 */

		return drugsMapper.getAll();
	}

	@Override
	public Drugs getDrugByid(Integer drugsid) {

		return drugsMapper.getDrugByid(drugsid);
	}

	@Override
	public int updateDrugs(Drugs drugs) {

		return drugsMapper.updateByPrimaryKeySelective(drugs);
	}

	@Override
	public int insertdrugs(Drugs drugs) {

		return drugsMapper.insert(drugs);
	}

	@Override
	public int delsup(Integer drugsid) {
		return drugsMapper.deleteByPrimaryKey(drugsid);
	}
}
