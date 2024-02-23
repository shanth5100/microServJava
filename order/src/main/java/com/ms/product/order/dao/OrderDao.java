package com.ms.product.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.product.order.model.OrderModel;

public interface OrderDao extends JpaRepository<OrderModel, Long>{

}
