package com.SWEProject.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Store {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	private String StoreOwner;
	private String StoreName;
	private String StoreAddress;
	private String StoreType;
	private String StoreInformation;
	
	public Store(Integer id, String storeName, String storeAddress, String storeType, 
			String storeInformation) {
		super();
		this.id = id;
		StoreName = storeName;
		StoreAddress = storeAddress;
		StoreType = storeType;
		StoreInformation = storeInformation;
	}
	
	public Store() {
		super();
		id = 0;
		StoreName = "";
		StoreAddress = "";
		StoreType = "";
		StoreInformation = "";
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}

	public void setStoreName(String storeName) {
		StoreName = storeName;
	}
	public String getStoreName() {
		return StoreName;
	}

	public void setStoreAddress(String storeAddress) {
		StoreAddress = storeAddress;
	}
	public String getStoreAddress() {
		return StoreAddress;
	}
	
	public void setStoreType(String storeType) {
		StoreType = storeType;
	}
	public String getStoreType() {
		return StoreType;
	}

	public void setStoreInformation(String storeInformation) {
		StoreInformation = storeInformation;
	}
	public String getStoreInformation() {
		return StoreInformation;
	}

	public String getStoreOwner() {
		return StoreOwner;
	}

	public void setStoreOwner(String storeOwner) {
		StoreOwner = storeOwner;
	}

}
