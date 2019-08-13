package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType(propOrder= {"productid","name","brand","price"})
@Entity
@Table(name="PRODUCT")
public class Product {
	public Product(int productid, String name, String brand, float price) {
		super();
		this.productid = productid;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	@Id
	//@GeneratedValue
	@Column(name="ID")
private int productid;
private String name;
private String brand;
private float price;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Product() {
}
@Override
public String toString() {
	return "Product [productid=" + productid + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
}



}
