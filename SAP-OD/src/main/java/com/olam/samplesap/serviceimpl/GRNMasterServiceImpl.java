package com.olam.samplesap.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.olam.samplesap.dto.SAPGRNMasterDTO;
import com.olam.samplesap.entity.SAPGRNMasterEntity;
import com.olam.samplesap.entity.SAPVendorMasterEntity;
import com.olam.samplesap.repository.GRNMasterRepository;
import com.olam.samplesap.repository.VendorMasterRepository;
import com.olam.samplesap.service.GRNMasterService;

@Service
public class GRNMasterServiceImpl implements GRNMasterService {
	
	@Resource
	private GRNMasterRepository  grnMasterRepository;
	
	@Resource
	private VendorMasterRepository vendorMasterRepository;

	@Override
	public void sendVendorTxId(SAPGRNMasterEntity grnEntity) {
		
		SAPVendorMasterEntity vendorMaster =new SAPVendorMasterEntity();
		
		
		
		 SAPGRNMasterEntity saveAndFlush = grnMasterRepository.saveAndFlush(grnEntity);
		SAPVendorMasterEntity saveAndFlush2 = vendorMasterRepository.saveAndFlush(vendorMaster);
		
		
	}

	@Override
	public void sendInvoiceNumber(SAPGRNMasterEntity grnEntity) {
		
		grnMasterRepository.save(grnEntity);
		
	}

	

}
