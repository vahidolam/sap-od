package com.olam.samplesap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sap_grn_master")
public class SAPGRNMasterEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="transaction_id")
	private String transaction_id;
	
	@Column(name="vendor_id")
	private String vendor_id;
	
	@Column(name="po_number")
	private String po_number;
	
	@Column(name="grn_number")
	private String grn_number;
	
	@Column(name="grn_year")
	private String grn_year;
	
	@Column(name="invoice_number")
	private String invoice_number;
	
	@Column(name="wh_location")
	private String wh_location;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getPo_number() {
		return po_number;
	}
	public void setPo_number(String po_number) {
		this.po_number = po_number;
	}
	public String getGrn_number() {
		return grn_number;
	}
	public void setGrn_number(String grn_number) {
		this.grn_number = grn_number;
	}
	public String getGrn_year() {
		return grn_year;
	}
	public void setGrn_year(String grn_year) {
		this.grn_year = grn_year;
	}
	public String getInvoice_number() {
		return invoice_number;
	}
	public void setInvoice_number(String invoice_number) {
		this.invoice_number = invoice_number;
	}
	public String getWh_location() {
		return wh_location;
	}
	public void setWh_location(String wh_location) {
		this.wh_location = wh_location;
	}
	
	
	

}
