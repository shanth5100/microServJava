package com.ms.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ms.product.model.ProductModel;
import com.ms.product.service.ProductService;

@RestController("/product")
public class ProductController {

	ProductService prodServ;
	
	@PostMapping("/create")
	@ResponseStatus(value = HttpStatus.CREATED)
	public String createProduct(@RequestBody ProductModel proModel) {
		return prodServ.createProduct(proModel);
	}
	
}
