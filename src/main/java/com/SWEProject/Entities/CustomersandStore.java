package com.SWEProject.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomersandStore {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	private int cnumber;
	private String StoreName;
	
	public CustomersandStore() {
		super();
		cnumber = 0;
		StoreName = "";
	}
	
	public CustomersandStore(int cnumber, String storeName) {
		super();
		this.cnumber = cnumber;
		this.StoreName = storeName;
	}
	
	public void setCnumber(int cnumber) {
		this.cnumber = cnumber;
	}
	public int getCnumber() {
		return cnumber;
	}

	public void setStoreName(String storedName) {
		StoreName = storedName;
	}
	public String getStoreName() {
		return StoreName;
	}
}
