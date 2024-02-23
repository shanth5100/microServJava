package com.ms.product.order.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "ORD_ITEM_T")
public class OrderItems {
	
	@Id
	@Column(name = "ITM_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long item_id;
	@Column(name = "ITM_AMT")
	@Nonnull
	private Double item_amount;
	@Column(name = "ITM_NAME")
	@Nonnull
	private String item_Name;
	
	public Long getItem_id() {
		return item_id;
	}
	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}
	public Double getItem_amount() {
		return item_amount;
	}
	public void setItem_amount(Double item_amount) {
		this.item_amount = item_amount;
	}
	public String getItem_Name() {
		return item_Name;
	}
	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}
}
