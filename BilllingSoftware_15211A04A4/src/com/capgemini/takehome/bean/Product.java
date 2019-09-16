package com.capgemini.takehome.bean;

public class Product {
	private int product_id;
	private String product_name;
	private String product_category;
	private int product_price;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) { //generation of setters and getters
		this.product_id = product_id;
	}
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_category() {
		return product_category;
	}
	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	
	public Product(int product_id, String product_name,
			String product_category, int product_price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_category = product_category;
		this.product_price = product_price;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
}
