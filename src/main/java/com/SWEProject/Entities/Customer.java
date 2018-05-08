package com.SWEProject.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	private int userID;
	private String cname;
	private int cphone;
	private String caddress;
	private int cage;
	private String cgender;
	private String cmail;
	private String cpass;
	
	
	public Customer() {
		super();
		id = 0;
		userID = 0;
		cname = "";
		cphone = 0;
		caddress = "";
		cage = 0;
		cgender = "";
		cmail = "";
		cpass = "";
	}

	public Customer(Integer id, int userID, String uname, int uphone, String uaddress, 
			int uage, String ugender, String umail, String upass) {
		super();
		this.id = id;
		this.userID = userID;
		this.cname = uname;
		this.cphone = uphone;
		this.caddress = uaddress;
		this.cage = uage;
		this.cgender = ugender;
		this.cmail = umail;
		this.cpass = upass;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getUserID() {
		return userID;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCname() {
		return cname;
	}

	public void setCphone(int cphone) {
		this.cphone = cphone;
	}
	public int getCphone() {
		return cphone;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCaddress() {
		return caddress;
	}

	public void setCage(int cage) {
		this.cage = cage;
	}
	public int getCage() {
		return cage;
	}
	
	public void setCgender(String cgender) {
		this.cgender = cgender;
	}
	public String getCgender() {
		return cgender;
	}

	public void setCmail(String cmail) {
		this.cmail = cmail;
	}
	public String getCmail() {
		return cmail;
	}

	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
}
