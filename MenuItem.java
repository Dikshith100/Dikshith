package com.hyd.hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MenuItem {
	
	@Id
	String  itemName;
	int itemPrice;
	public MenuItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
 
}
