package com.ms.product.order.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class OrderModel {

	private int ordid;
	private Double amount;
	private int itemsNum;
//	@OneToMany(cascade=Cascade.ALL)
	private List<OrderItems> ordItems;
	public int getOrdid() {
		return ordid;
	}
	public void setOrdid(int ordid) {
		this.ordid = ordid;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public int getItemsNum() {
		return itemsNum;
	}
	public void setItemsNum(int itemsNum) {
		this.itemsNum = itemsNum;
	}
	public List<OrderItems> getOrdItems() {
		return ordItems;
	}
	public void setOrdItems(List<OrderItems> ordItems) {
		this.ordItems = ordItems;
	}
	
}
