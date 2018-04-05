package com.SWEProject.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brand {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	private String BrandName;
	private String BrandType;
	
	public Brand(Integer id, String brandName, String brandType) {
		super();
		this.id = id;
		BrandName = brandName;
		BrandType = brandType;
	}

	public Brand() {
		super();
		id = 0;
		BrandName = "";
		BrandType = "";
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	public String getBrandName() {
		return BrandName;
	}

	public void setBrandType(String brandType) {
		BrandType = brandType;
	}
	public String getBrandType() {
		return BrandType;
	}

}
