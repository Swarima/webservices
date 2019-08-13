package com.zensar.daos;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;
/*Author:Swarima Sharma
* Date:25th july 2019 10:00AM
* version:2.0
* Copyright:Zensar Technologies
* Description:data access object interface implements ProductDao
* It is persistent class of hibernate
* value object of application,
* domain or application object.
* It is also POJO.
*/
public class ProductDaoImpl implements ProductDao {

	private Session session;
	
	
	public ProductDaoImpl() {
		
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		session=factory.openSession();
		System.out.println("Connection established");
		
	}

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		Transaction tx=session.beginTransaction();
		session.save(product);
		tx.commit();
		System.out.println("product inserted");

	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		Transaction tx=session.beginTransaction();
		session.update(product);
		tx.commit();
		System.out.println("product updated");
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		Transaction tx=session.beginTransaction();
		session.delete(product);
		tx.commit();
		System.out.println("product deleted");
	}

	@Override
	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return session.get(Product.class,productId );
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		Query query=session.createQuery("from Product");
		return query.getResultList();
	}

}
