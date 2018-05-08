package com.SWEProject.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrator {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	private int adminID;
	private String adminName;
	private int adminPhone;
	private String adminAddress;
	private int adminAge;
	private String adminGender;
	private String adminMail;
	private String adminPass;
	
	public Administrator(Integer id, int adminID, String adminName, int adminPhone,
			String adminAddress, int adminAge, String adminGender, String adminMail,
			String adminPass) {
		super();
		this.id = id;
		this.adminID = adminID;
		this.adminName = adminName;
		this.adminPhone = adminPhone;
		this.adminAddress = adminAddress;
		this.adminAge = adminAge;
		this.adminGender = adminGender;
		this.adminMail = adminMail;
		this.adminPass = adminPass;
	}

	public Administrator() {
		super();
		id = 0;
		adminID = 0;
		adminName = "";
		adminPhone = 0;
		adminAddress = "";
		adminAge = 0;
		adminGender = "";
		adminMail = "";
		adminPass = "";
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	public int getAdminID() {
		return adminID;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminName() {
		return adminName;
	}

	public void setAdminPhone(int adminPhone) {
		this.adminPhone = adminPhone;
	}
	public int getAdminPhone() {
		return adminPhone;
	}

	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}
	public String getAdminAddress() {
		return adminAddress;
	}

	public void setAdminAge(int adminAge) {
		this.adminAge = adminAge;
	}
	public int getAdminAge() {
		return adminAge;
	}

	public void setAdminGender(String adminGender) {
		this.adminGender = adminGender;
	}
	public String getAdminGender() {
		return adminGender;
	}

	public void setAdminMail(String adminMail) {
		this.adminMail = adminMail;
	}
	public String getAdminMail() {
		return adminMail;
	}


	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	public String getAdminPass() {
		return adminPass;
	}

}
