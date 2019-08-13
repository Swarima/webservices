package com.zensar.services.business;


import java.util.ArrayList;
import java.util.List;

import com.zensar.daos.ProductDao;
import com.zensar.daos.ProductDaoImpl;
import com.zensar.entities.Product;
/* * Description:It interacts with DAO layer to get data from database also interacts with presentation layer to give data as per business requirement

 * It encapsulates business logic of application component
 */
public class ProductServiceImpl implements ProductService {

	private ProductDao dao;
	
	public ProductServiceImpl() {
		dao=new ProductDaoImpl();
	}

	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		dao.insert(product);
	}

	@Override
	public void edit(Product product) {
		// TODO Auto-generated method stub
		Product dbproduct=findProductById(product.getProductid());
				if(dbproduct!=null) {
					dbproduct.setName(product.getName());
					dbproduct.setBrand(product.getBrand());
					dbproduct.setPrice(product.getPrice());
					dao.update(dbproduct);
				}
				else
					System.out.println("Product not found");

	}

	@Override
	public void remove(Product product) {
		// TODO Auto-generated method stub
		Product dbproduct=findProductById(product.getProductid());
		if(dbproduct!=null)
			dao.delete(dbproduct);
		else
			System.out.println("Product not found");
	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return dao.getById(productId);
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public int getProductCount() {
		// TODO Auto-generated method stub
		return findAllProducts().size();
	}

	@Override
	public List<Product> findProductByBrand(String brand) {
		// TODO Auto-generated method stub
		List<Product> pList=findAllProducts();
		List<Product> pBList=new ArrayList<>();
		for(Product p:pList) {
			if(p.getBrand().equals(brand))
			{
				pBList.add(p);
			}
		}

		return pBList;
	}

	@Override
	public List<Product> findProductByPrice(float minPrice, float maxPrice) {
		// TODO Auto-generated method stub
		List<Product> pList=findAllProducts();
		return null;
	}

}
