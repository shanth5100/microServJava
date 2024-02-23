package com.ms.product.order.model;

import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "ORDER_T")
public class OrderModel {

	@Id
	@Column(name = "ORD_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ord_id;

	@Column(name = "ORD_AMT")
	@Nonnull
	private Double amount;

	@Column(name = "ORD_ITM_COUNT")
	private int itemsNum;
	
	@OneToMany(cascade=CascadeType.ALL)
	@Column(name = "ORD_ITEMS")
	private List<OrderItems> ordItems;
	
	public Long getOrdid() {
		return ord_id;
	}
	public void setOrdid(Long ordid) {
		this.ord_id = ordid;
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
