package com.olam.samplesap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sap_vendor_master")
public class SAPVendorMasterEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="vendor_code")
	private String vendor_code;
	
	@Column(name="vendor_id")
	private String vendor_id;
	
	@Column(name="company_code")
	private String company_code;
	
	@Column(name="purchase_org")
	private String purchase_org;
	
	@Column(name="postal_code")
	private String postal_code;
	
	@Column(name="tax_number")
	private String tax_number;
	
	@Column(name="wh_tax_country")
	private String wh_tax_country;
	
	@Column(name="wh_tax_type")
	private String wh_tax_type;
	
	@Column(name="wh_tax_code")
	private String wh_tax_code;
	
	@Column(name="is_wh_tax")
	private char is_wh_tax='0';
	
	@Column(name="is_company_block")
	private char is_company_block='0';
	
	@Column(name="is_purchase_org_block")
	private char is_purchase_org_block='0';
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVendor_code() {
		return vendor_code;
	}
	public void setVendor_code(String vendor_code) {
		this.vendor_code = vendor_code;
	}
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getCompany_code() {
		return company_code;
	}
	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}
	public String getPurchase_org() {
		return purchase_org;
	}
	public void setPurchase_org(String purchase_org) {
		this.purchase_org = purchase_org;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getTax_number() {
		return tax_number;
	}
	public void setTax_number(String tax_number) {
		this.tax_number = tax_number;
	}
	public String getWh_tax_country() {
		return wh_tax_country;
	}
	public void setWh_tax_country(String wh_tax_country) {
		this.wh_tax_country = wh_tax_country;
	}
	public String getWh_tax_type() {
		return wh_tax_type;
	}
	public void setWh_tax_type(String wh_tax_type) {
		this.wh_tax_type = wh_tax_type;
	}
	public String getWh_tax_code() {
		return wh_tax_code;
	}
	public void setWh_tax_code(String wh_tax_code) {
		this.wh_tax_code = wh_tax_code;
	}
	public char getIs_wh_tax() {
		return is_wh_tax;
	}
	public void setIs_wh_tax(char is_wh_tax) {
		this.is_wh_tax = is_wh_tax;
	}
	public char getIs_company_block() {
		return is_company_block;
	}
	public void setIs_company_block(char is_company_block) {
		this.is_company_block = is_company_block;
	}
	public char getIs_purchase_org_block() {
		return is_purchase_org_block;
	}
	public void setIs_purchase_org_block(char is_purchase_org_block) {
		this.is_purchase_org_block = is_purchase_org_block;
	}
	
	
	

}
