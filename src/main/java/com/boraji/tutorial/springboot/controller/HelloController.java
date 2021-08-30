package com.boraji.tutorial.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boraji.tutorial.springboot.model.Products;
import com.boraji.tutorial.springboot.model.Suppliers;
import com.boraji.tutorial.springboot.service.ProductService;

@RestController
public class HelloController {

	
	@Autowired
    ProductService productservice;

	
	@RequestMapping(value="/findallproducts")
	  public ResponseEntity<Products> findByproductid() {
	       Products list = productservice.findallproducts();
	 
	        return new ResponseEntity<Products>(list, new HttpHeaders(), HttpStatus.OK);
	    } 
	 
	
	@RequestMapping(value="/saveproduct")
	  public ResponseEntity<Products> saveproduct() {
	       Products list = productservice.savedata();
	 
	        return new ResponseEntity<Products>(list, new HttpHeaders(), HttpStatus.OK);
	    } 
	
	@RequestMapping(value="/Productavailabile")
	  public ResponseEntity<List<Products>> Productavailabile() {
	       List<Products> list = productservice.Productavailabile();
	 
	        return new ResponseEntity<List<Products>>(list, new HttpHeaders(), HttpStatus.OK);
	    } 
	

	@RequestMapping(value="/ProductpriceLessThan")
	  public ResponseEntity<List<Products>> ProductpriceLessThan() {
	       List<Products> list = productservice.ProductpriceLessThan();
	 
	        return new ResponseEntity<List<Products>>(list, new HttpHeaders(), HttpStatus.OK);
	    } 

	@RequestMapping(value="/ProductpriceGreaterThan")
	  public ResponseEntity<List<Products>> ProductpriceGreaterThan() {
	       List<Products> list = productservice.ProductpriceGreaterThan();
	 
	        return new ResponseEntity<List<Products>>(list, new HttpHeaders(), HttpStatus.OK);
	    } 

	@RequestMapping(value="/SupplierlocationWhereSuppliername")
	  public ResponseEntity<List<Suppliers>> SupplierlocationWhereSuppliername() {
	       List<Suppliers> list = productservice.SupplierlocationWhereSuppliername();
	 
	        return new ResponseEntity<List<Suppliers>>(list, new HttpHeaders(), HttpStatus.OK);
	    } 

	
	@RequestMapping(value="/findBySuppliernamenot")
	  public ResponseEntity<List<Suppliers>> findBySuppliernamenot() {
	       List<Suppliers> list = productservice.findBySuppliernamenot();
	 
	        return new ResponseEntity<List<Suppliers>>(list, new HttpHeaders(), HttpStatus.OK);
	    } 


	
	@RequestMapping(value="/findBySupplierid")
	  public ResponseEntity<List<Products>> findBySupplierid() {
	       List<Products> list = productservice.findBySupplierid();
	 
	        return new ResponseEntity<List<Products>>(list, new HttpHeaders(), HttpStatus.OK);
	    } 

	

	
	/*
	 * @RequestMapping(value="/saveproducts") public ResponseEntity<List<Products>>
	 * saveproducts(@RequestParam("product") Products product) { List<Products> list
	 * = productservice.saveproducts();
	 * 
	 * return new ResponseEntity<List<Products>>(list, new HttpHeaders(),
	 * HttpStatus.OK); }
	 */
	 
	 
	/*
	 * @RequestMapping("/") public String index() { return "login"; }
	 * 
	 * @PostMapping("/hello") public String sayHello(@RequestParam("name") String
	 * name, Model model) { model.addAttribute("name", name); return "hello"; }
	 */


}
