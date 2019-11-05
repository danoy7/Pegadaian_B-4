package com.pegadaian.git;

public class GadaiMenu {
	String NamaCustomer;
	String[] Product_Category= {"Laptop","Motor","Emas"};
	String Description;
	double Price;
	
	public String getNama() {
		return NamaCustomer;
	}
	public void setNama(String namacustomer) {
		this.NamaCustomer= namacustomer;
	}
	public String[] getProduct_Category() {
		return Product_Category;
	}
	public void setProduct_Category(String[] product_Category) {
		Product_Category = product_Category;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	
}
