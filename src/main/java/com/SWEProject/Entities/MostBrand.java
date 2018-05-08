package com.SWEProject.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MostBrand {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	private String BrandName;
	
	public MostBrand() {
		super();
		BrandName = "";
	}

	public MostBrand(String brandName) {
		super();
		this.BrandName = brandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	public String getBrandName() {
		return BrandName;
	}
}
