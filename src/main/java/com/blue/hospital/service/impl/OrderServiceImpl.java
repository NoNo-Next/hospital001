package com.blue.hospital.service.impl;

import com.blue.hospital.dao.OrderMapper;
import com.blue.hospital.entity.Order;
import com.blue.hospital.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderMapper orderMapper;

	@Override
	public List<Order> getAllorder() {
	
		return orderMapper.getAll();
	}

}
