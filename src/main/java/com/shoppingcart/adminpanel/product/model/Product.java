package com.shoppingcart.adminpanel.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="product_name")
	private String Product_Name;
	@Column(name="description")
	private String Description ;
	@Column(name="category")
	private String Category;
	@Column(name="status")
	private String Status;
	@Column(name="colour")
	private String Colour;
	@Column(name="brand")
	private String Brand;
	@Column(name="size")
	private String Size;
	@Column(name="tags")
	private String Tags;
	@Column(name="product_code")
	private String Product_code;
	@Column(name="product_sku")
	private String Product_SKU;
	@Column(name="gender")
	private String Gender;
	@Column(name="quantity")
	private int Quantity;
	@Column(name="regular_price")
	private Double Regular_Price;
	@Column(name="sale_price")
	private Double Sale_Price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public String getTags() {
		return Tags;
	}
	public void setTags(String tags) {
		Tags = tags;
	}
	public String getProduct_code() {
		return Product_code;
	}
	public void setProduct_code(String product_code) {
		Product_code = product_code;
	}
	public String getProduct_SKU() {
		return Product_SKU;
	}
	public void setProduct_SKU(String product_SKU) {
		Product_SKU = product_SKU;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public Double getRegular_Price() {
		return Regular_Price;
	}
	public void setRegular_Price(Double regular_Price) {
		Regular_Price = regular_Price;
	}
	public Double getSale_Price() {
		return Sale_Price;
	}
	public void setSale_Price(Double sale_Price) {
		Sale_Price = sale_Price;
	}
	
	
	
}
