package com.SWEProject.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	private String userID;
	private String uname;
	private int uphone;
	private String uaddress;
	private int uage;
	private String ugender;
	private String umail;
	private String upass;
	
	
	public User() {
		super();
		id = 0;
		userID = "";
		uname = "";
		uphone = 0;
		uaddress = "";
		uage = 0;
		ugender = "";
		umail = "";
		upass = "";
	}

	public User(Integer id, String userID, String uname, int uphone, String uaddress, int uage, String ugender,
			String umail, String upass) {
		super();
		this.id = id;
		this.userID = userID;
		this.uname = uname;
		this.uphone = uphone;
		this.uaddress = uaddress;
		this.uage = uage;
		this.ugender = ugender;
		this.umail = umail;
		this.upass = upass;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUname() {
		return uname;
	}
	
	public void setUphone(int uphone) {
		this.uphone = uphone;
	}
	public int getUphone() {
		return uphone;
	}
	
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public String getUaddress() {
		return uaddress;
	}
	
	public void setUage(int uage) {
		this.uage = uage;
	}
	public int getUage() {
		return uage;
	}
	
	public void setUgender(String ugender) {
		this.ugender = ugender;
	}
	public String getUgender() {
		return ugender;
	}
	
	public void setUmail(String umail) {
		this.umail = umail;
	}
	public String getUmail() {
		return umail;
	}
	
	
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUpass() {
		return upass;
	}
}
