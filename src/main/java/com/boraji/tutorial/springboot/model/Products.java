package com.boraji.tutorial.springboot.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="products_catalog")
public class Products {	
	
	@Id
	@GeneratedValue
	@Column(name="product_id")
	private Integer productid;
	
	@Column(name="product_name")
	private String productname;
	
	@Column(name="product_price")
	private int productprice;
	
	@Column(name="product_availability")
	private String productavailability;
	

	@ManyToOne
	@JoinColumn
	private Suppliers suppliers;
	
	public Suppliers getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(Suppliers suppliers) {
		this.suppliers = suppliers;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public String getProductavailability() {
		return productavailability;
	}

	public void setProductavailability(String productavailability) {
		this.productavailability = productavailability;
	}

	@Override
	public String toString() {
		return "Products [productid=" + productid + ", productname=" + productname + ", productprice=" + productprice
				+ ", productavailability=" + productavailability + ", suppliers=" + suppliers + "]";
	}

	
	


}
