package com.boraji.tutorial.springboot.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.boraji.tutorial.springboot.model.Products;
import com.boraji.tutorial.springboot.model.Suppliers;
import com.boraji.tutorial.springboot.repository.ProductRepository;
import com.boraji.tutorial.springboot.repository.SupplierRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productrepository;

	@Autowired
	SupplierRepository supplierrepository;

	public Products findallproducts() {

		List<Products> product = productrepository.findByProductname("redmipro");

		return product.get(1);

	}

	public Products savedata() {
		Products obj = new Products();
		Suppliers obj1 = new Suppliers();

		obj.setProductid(1003);
		obj.setProductavailability("yes");
		obj.setProductname("laptop");
		obj.setProductprice(60000);

		/*
		 * obj1.setSupplierid(2000); obj1.setSupplierlocation("mumbai");
		 * obj1.setSuppliername("soumi"); supplierrepository.save(obj1);
		 */

		obj.setSuppliers(supplierrepository.findBySupplierid(2000));

		Products product = productrepository.save(obj);

		return product;

	}

	public List<Products> Productavailabile() {

		List<Products> product = productrepository.findByProductavailability("yes");

		return product;

	}

	public List<Products> ProductpriceLessThan() {

		List<Products> product = productrepository.findByProductpriceLessThan(15000);

		return product;

	}

	public List<Products> ProductpriceGreaterThan() {

		List<Products> product = productrepository.findByProductpriceGreaterThan(7000);
		System.out.println(product.get(0).getProductid());
		return product;

	}

	public List<Suppliers> SupplierlocationWhereSuppliername() {

		List<Suppliers> supplier = supplierrepository.findBySuppliername("uttam");

		return supplier;

	}

	public List<Suppliers> findBySuppliernamenot() {

		List<Suppliers> supplier = supplierrepository.findBySuppliernameNot("pankaj");

		return supplier;

	}

	public List<Products> findBySupplierid() {

		List<Suppliers> supplier = supplierrepository.findBySuppliername("uttam");
		System.out.println(supplier.get(0).getSupplierid());
		List<Products> pro = productrepository.findBySuppliers_supplierid(supplier.get(0).getSupplierid());
		return pro;

	}

}
