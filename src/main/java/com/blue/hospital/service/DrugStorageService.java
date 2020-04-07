package com.blue.hospital.service;


import com.blue.hospital.entity.Drugstorage;

import java.util.List;

public interface DrugStorageService {

	List<Drugstorage> getAllDrugStorage();

    int delDsById(Integer dsid);
}
