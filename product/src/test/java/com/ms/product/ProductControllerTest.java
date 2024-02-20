package com.ms.product;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.junit.jupiter.Testcontainers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ms.product.model.ProductModel;


@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
class ProductControllerTest {

	@Autowired(required=true)
	MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper mapper;
	
	@Test
	void shouldCreateProduct() {
		ProductModel pm = getProdRequest();
		try {
			mockMvc.perform(MockMvcRequestBuilders.post("/product/create")
					.contentType(MediaType.APPLICATION_JSON)
					.content(mapper.writeValueAsString(pm))
					).andExpect(status().isCreated());
			Assertions.assertEquals("", "null");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private ProductModel getProdRequest() {
		return new ProductModel(1, "SOAP", 10D, 102);
	}

}
