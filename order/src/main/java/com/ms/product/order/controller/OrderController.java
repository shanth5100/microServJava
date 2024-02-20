package com.ms.product.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ms.product.order.model.OrderModel;
import com.ms.product.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderServ;
	
	@PostMapping("/create")
	@ResponseStatus(value = HttpStatus.CREATED)
	public String createOder(@RequestBody OrderModel orderModel) {
		return orderServ.createOder(orderModel);
	}
	
	@GetMapping("/getOreders")
	//@ResponseStatus(value = HttpStatus.OK)
	public List<OrderModel> getOreders() {
		return orderServ.getOreders();
	}
}
