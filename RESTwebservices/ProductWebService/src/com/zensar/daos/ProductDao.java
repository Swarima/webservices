package com.zensar.daos;

import java.util.List;

import com.zensar.entities.Product;
/*
 * Author:Swarima Sharma
 * Date:26th july 2019 10:00AM
 * version:1.0
 * Copyright:Zensar Technologies
 * Description:data access Object Interface
 * It is used to access Product data from database. 
 */
public interface ProductDao {
	
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	Product getById(int productId);
	List<Product>getAll();



}
