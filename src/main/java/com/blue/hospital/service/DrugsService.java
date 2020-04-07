package com.blue.hospital.service;


import com.blue.hospital.entity.Drugs;

import java.util.List;

public interface DrugsService {

	List<Drugs> getDrugs = null;

	List<Drugs> getDrugs();

	List<Drugs> getAll();

	Drugs getDrugByid(Integer drugsid);

	int updateDrugs(Drugs drugs);

	int insertdrugs(Drugs drugs);
	
	int delsup(Integer drugsid);

}
