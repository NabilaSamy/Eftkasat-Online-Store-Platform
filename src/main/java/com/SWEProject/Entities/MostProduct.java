package com.SWEProject.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MostProduct {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	private String ProdName;
	
	public MostProduct() {
		super();
		ProdName = "";
	}
	
	public MostProduct(String prodName) {
		super();
		this.ProdName = prodName;
	}
	
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public String getProdName() {
		return ProdName;
	}
}
