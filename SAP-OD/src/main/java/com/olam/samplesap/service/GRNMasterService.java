package com.olam.samplesap.service;


import com.olam.samplesap.entity.SAPGRNMasterEntity;


public interface GRNMasterService {
	
	public void sendVendorTxId(SAPGRNMasterEntity grnEntity);
	public void sendInvoiceNumber(SAPGRNMasterEntity grnEntity);
	public void getVendorAndTxDetails(SAPGRNMasterEntity grnEntity);
	

}
