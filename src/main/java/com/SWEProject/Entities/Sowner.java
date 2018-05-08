package com.SWEProject.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sowner {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	private int sownerID;
	private String sownerName;
	private int sownerPhone;
	private String sownerAddress;
	private int sownerAge;
	private String sownerGender;
	private String sownerMail;
	private String sownerPass;
	
	public Sowner() {
		super();
		id = 0;
		sownerID = 0;
		sownerName = "";
		sownerPhone = 0;
		sownerAddress = "";
		sownerAge = 0;
		sownerGender = "";
		sownerMail = "";
		sownerPass = "";
	}
	
	public Sowner(Integer id, int sownerID, String sownerName, int sownerPhone,
			String sownerAddress, int sownerAge, String sownerGender, String sownerMail,
			String sownerPass) {
		super();
		this.id = id;
		this.sownerID = sownerID;
		this.sownerName = sownerName;
		this.sownerPhone = sownerPhone;
		this.sownerAddress = sownerAddress;
		this.sownerAge = sownerAge;
		this.sownerGender = sownerGender;
		this.sownerMail = sownerMail;
		this.sownerPass = sownerPass;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getSownerID() {
		return sownerID;
	}

	public void setSownerID(int sownerID) {
		this.sownerID = sownerID;
	}

	public String getSownerName() {
		return sownerName;
	}

	public void setSownerName(String sownerName) {
		this.sownerName = sownerName;
	}

	public void setSownerPhone(int sownerPhone) {
		this.sownerPhone = sownerPhone;
	}
	public int getSownerPhone() {
		return sownerPhone;
	}

	public void setSownerAddress(String sownerAddress) {
		this.sownerAddress = sownerAddress;
	}
	public String getSownerAddress() {
		return sownerAddress;
	}

	public void setSownerAge(int sownerAge) {
		this.sownerAge = sownerAge;
	}
	public int getSownerAge() {
		return sownerAge;
	}
	
	public void setSownerGender(String sownerGender) {
		this.sownerGender = sownerGender;
	}
	public String getSownerGender() {
		return sownerGender;
	}

	public void setSownerMail(String sownerMail) {
		this.sownerMail = sownerMail;
	}
	public String getSownerMail() {
		return sownerMail;
	}

	public void setSownerPass(String sownerPass) {
		this.sownerPass = sownerPass;
	}
	public String getSownerPass() {
		return sownerPass;
	}	
}
