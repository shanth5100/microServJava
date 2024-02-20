package com.ms.product.order.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ms.product.order.model.OrderModel;

@Service
public class OrderService {

	
	private static final Logger log = LoggerFactory.getLogger(OrderService.class);

	public String createOder(OrderModel orderModel) {
		log.info("order palced " + orderModel.getOrdid());
		return "order palced " + orderModel.getOrdid();
	}

	public List<OrderModel> getOreders() {
		log.info("I am returning order palced " );
		return null;
	}

	

}
