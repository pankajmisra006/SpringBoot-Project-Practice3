package com.boraji.tutorial.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boraji.tutorial.springboot.model.Products;
import com.boraji.tutorial.springboot.model.Suppliers;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

	public Products findByProductid(Integer product_id);

	public List<Products> findByProductname(String product_name);

	public List<Products> findByProductavailability(String product_availability);

	public List<Products> findByProductpriceLessThan(int product_price);

	public List<Products> findByProductpriceGreaterThan(int product_price);

	public List<Products> findBySuppliers_supplierid(int supplier_id);

}
//GRANT ALL PRIVILEGES ON *.* TO 'root'@'localhost' IDENTIFIED BY 'messithegoat' WITH GRANT OPTION;