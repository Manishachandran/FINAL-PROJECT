package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FoodieModel 
{
	@Id
	private int item_id;
	private String item_name;
	private String item_category;
	private int price;
	
	
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_category() {
		return item_category;
	}
	public void setItem_category(String item_category) {
		this.item_category = item_category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public FoodieModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodieModel(int item_id, String item_name, String item_category, int price) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_category = item_category;
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodieModel [item_id=" + item_id + ", item_name=" + item_name + ", item_category=" + item_category
				+ ", price=" + price + "]";
	}
	
	
	

}
