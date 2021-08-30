package com.boraji.tutorial.springboot.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pro_supplier")
public class Suppliers {


	@Id
	@Column(name = "supplier_id")
	private Integer supplierid;

	@Column(name = "supplier_name")
	private String suppliername;

	@Column(name = "supplier_location")
	private String supplierlocation;
	

	public Integer getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}

	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	public String getSupplierlocation() {
		return supplierlocation;
	}

	public void setSupplierlocation(String supplierlocation) {
		this.supplierlocation = supplierlocation;
	}

	@Override
	public String toString() {
		return "Suppliers [supplierid=" + supplierid + ", suppliername=" + suppliername + ", supplierlocation="
				+ supplierlocation + "]";
	}


}
