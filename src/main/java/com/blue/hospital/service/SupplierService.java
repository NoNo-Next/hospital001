package com.blue.hospital.service;


import com.blue.hospital.entity.Supplier;

import java.util.List;

public interface SupplierService {
	
	
	List<Supplier> getAllsupplier();
		
	Supplier selectSupplierByid(Integer supplierid);
	
	int updatesupplier(Supplier supplier);
	
	int delSupplierByid(Integer supplierid);
	
	int addsupplier(Supplier supplier);

}
