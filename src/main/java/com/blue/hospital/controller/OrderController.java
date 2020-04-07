package com.blue.hospital.controller;


import com.blue.hospital.entity.Order;
import com.blue.hospital.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/order")
@Controller
public class OrderController {
	
	
	@Autowired
	OrderService orderService;
	
	@RequestMapping("/getAllorder")
	@ResponseBody
	public List<Order> getAllorder(){
		
		return  orderService.getAllorder();
		
	}

}
