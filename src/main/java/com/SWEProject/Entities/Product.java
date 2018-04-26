package com.SWEProject.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	private String ProdName;
	private int ProdPrice;
	private String ProdCategory;
	private String ProdType;
	private String BrandName;
	private String StoreName;
	
	public Product() {
		super();
		id = 0;
		ProdName = "";
		ProdPrice = 0;
		ProdCategory = "";
		ProdType = "";
		BrandName = "";
		StoreName = "";
	}
	
	public Product(Integer id, String prodName, int prodPrice, String prodCategory, 
			String prodType, String brandName, String storeName) {
		super();
		this.id = id;
		this.ProdName = prodName;
		this.ProdPrice = prodPrice;
		this.ProdCategory = prodCategory;
		this.ProdType = prodType;
		this.BrandName = brandName;
		this.StoreName = storeName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public String getProdName() {
		return ProdName;
	}

	public void setProdPrice(int prodPrice) {
		ProdPrice = prodPrice;
	}
	public int getProdPrice() {
		return ProdPrice;
	}

	public void setProdCategory(String prodCategory) {
		ProdCategory = prodCategory;
	}
	public String getProdCategory() {
		return ProdCategory;
	}

	public void setProdType(String prodType) {
		ProdType = prodType;
	}
	public String getProdType() {
		return ProdType;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	public String getBrandName() {
		return BrandName;
	}

	public void setStoreName(String storeName) {
		StoreName = storeName;
	}
	public String getStoreName() {
		return StoreName;
	}

}
