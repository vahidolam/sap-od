package com.olam.samplesap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olam.samplesap.entity.SAPGRNMasterEntity;
import com.olam.samplesap.service.GRNMasterService;

@RestController
public class SapController {
	
	@Autowired
	private GRNMasterService grnMasterService;
	
	@GetMapping(value="/message")
	public String message() {
		System.out.println("vahid modified");
		return "hello ! i am from sap-od controller";
	}
	
	
	
	public void sendVendorTxId(SAPGRNMasterEntity grnMaster){
		
		grnMasterService.sendVendorTxId(grnMaster);
		
		
		
	}

}
