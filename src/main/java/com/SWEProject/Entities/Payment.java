package com.SWEProject.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	
	private String cname;
	private String cmail;
	private String ProdName;
	private String BrandName;
	private String PaymentType;
	
	public Payment() {
		super();
		cname = "";
		cmail = "";
		ProdName = "";
		PaymentType = "";
	}

	public Payment(String cname, String cmail, String prodName, String brandName,
			String paymentType) {
		super();
		this.cname = cname;
		this.cmail = cmail;
		this.ProdName = prodName;
		this.BrandName = brandName;
		this.PaymentType = paymentType;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCname() {
		return cname;
	}

	public void setCmail(String cmail) {
		this.cmail = cmail;
	}
	public String getCmail() {
		return cmail;
	}

	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public String getProdName() {
		return ProdName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	public String getBrandName() {
		return BrandName;
	}

	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}
	public String getPaymentType() {
		return PaymentType;
	}
}
