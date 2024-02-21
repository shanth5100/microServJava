package com.ms.product.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ms.product.model.ProductModel;

@Service
public class ProductService {

	private static final Logger log = LoggerFactory.getLogger(ProductService.class);

	public String createProduct(ProductModel proModel) {
		log.info("product was created with {} ", proModel.getProdId());
		return "Product was created with id " + proModel.getProdId();
	}

}
