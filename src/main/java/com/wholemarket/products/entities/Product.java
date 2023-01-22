package com.wholemarket.products.entities;

public class Product {
    public String product_id;
    public String product_name;
    public String product_description;
    public String product_manufacturer_name;
    public String product_manufacturer_description;
    public String product_manufacturing_date;
    public String product_expiring_date;
    public String product_max_retailing_price;
    public String product_seller;
    public String product_discount;
    public String product_type;
    public String product_status;
    public String product_discount_price;
    public String product_batch_id;
    public String product_bar_code;
    
    
	/**
	 * @param product_id
	 * @param product_name
	 * @param product_description
	 * @param product_manufacturer_name
	 * @param product_manufacturer_description
	 * @param product_manufacturing_date
	 * @param product_expiring_date
	 * @param product_max_retailing_price
	 * @param product_seller
	 * @param product_discount
	 * @param product_type
	 * @param product_status
	 * @param product_discount_price
	 * @param product_batch_id
	 * @param product_bar_code
	 */
	public Product(String product_id, String product_name, String product_description, String product_manufacturer_name,
			String product_manufacturer_description, String product_manufacturing_date, String product_expiring_date,
			String product_max_retailing_price, String product_seller, String product_discount, String product_type,
			String product_status, String product_discount_price, String product_batch_id, String product_bar_code) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_description = product_description;
		this.product_manufacturer_name = product_manufacturer_name;
		this.product_manufacturer_description = product_manufacturer_description;
		this.product_manufacturing_date = product_manufacturing_date;
		this.product_expiring_date = product_expiring_date;
		this.product_max_retailing_price = product_max_retailing_price;
		this.product_seller = product_seller;
		this.product_discount = product_discount;
		this.product_type = product_type;
		this.product_status = product_status;
		this.product_discount_price = product_discount_price;
		this.product_batch_id = product_batch_id;
		this.product_bar_code = product_bar_code;
	}


	/**
	 * 
	 */
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getProduct_id() {
		return product_id;
	}


	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public String getProduct_description() {
		return product_description;
	}


	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}


	public String getProduct_manufacturer_name() {
		return product_manufacturer_name;
	}


	public void setProduct_manufacturer_name(String product_manufacturer_name) {
		this.product_manufacturer_name = product_manufacturer_name;
	}


	public String getProduct_manufacturer_description() {
		return product_manufacturer_description;
	}


	public void setProduct_manufacturer_description(String product_manufacturer_description) {
		this.product_manufacturer_description = product_manufacturer_description;
	}


	public String getProduct_manufacturing_date() {
		return product_manufacturing_date;
	}


	public void setProduct_manufacturing_date(String product_manufacturing_date) {
		this.product_manufacturing_date = product_manufacturing_date;
	}


	public String getProduct_expiring_date() {
		return product_expiring_date;
	}


	public void setProduct_expiring_date(String product_expiring_date) {
		this.product_expiring_date = product_expiring_date;
	}


	public String getProduct_max_retailing_price() {
		return product_max_retailing_price;
	}


	public void setProduct_max_retailing_price(String product_max_retailing_price) {
		this.product_max_retailing_price = product_max_retailing_price;
	}


	public String getProduct_seller() {
		return product_seller;
	}


	public void setProduct_seller(String product_seller) {
		this.product_seller = product_seller;
	}


	public String getProduct_discount() {
		return product_discount;
	}


	public void setProduct_discount(String product_discount) {
		this.product_discount = product_discount;
	}


	public String getProduct_type() {
		return product_type;
	}


	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}


	public String getProduct_status() {
		return product_status;
	}


	public void setProduct_status(String product_status) {
		this.product_status = product_status;
	}


	public String getProduct_discount_price() {
		return product_discount_price;
	}


	public void setProduct_discount_price(String product_discount_price) {
		this.product_discount_price = product_discount_price;
	}


	public String getProduct_batch_id() {
		return product_batch_id;
	}


	public void setProduct_batch_id(String product_batch_id) {
		this.product_batch_id = product_batch_id;
	}


	public String getProduct_bar_code() {
		return product_bar_code;
	}


	public void setProduct_bar_code(String product_bar_code) {
		this.product_bar_code = product_bar_code;
	}
    
	
    
	


    
}
