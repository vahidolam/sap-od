package com.olam.samplesap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.olam.samplesap.entity.SAPGRNMasterEntity;

public interface GRNMasterRepository extends JpaRepository<SAPGRNMasterEntity, Long> {

	
	@Query(value="")
	void updateInvoiceNumber(SAPGRNMasterEntity grnEntity);
	
	

}
