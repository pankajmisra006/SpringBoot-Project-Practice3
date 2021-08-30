package com.boraji.tutorial.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boraji.tutorial.springboot.model.Products;
import com.boraji.tutorial.springboot.model.Suppliers;

@Repository
public interface SupplierRepository extends JpaRepository<Suppliers, Integer>{

	Suppliers findBySupplierid(Integer supplier_id);
	List<Suppliers> findBySuppliername(String supplier_name);
	List<Suppliers> findBySuppliernameNot(String supplier_name);
	/**/


}
