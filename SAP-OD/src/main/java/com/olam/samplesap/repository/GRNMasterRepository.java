package com.olam.samplesap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olam.samplesap.entity.SAPGRNMasterEntity;

public interface GRNMasterRepository extends JpaRepository<SAPGRNMasterEntity, Long> {
	
	

}
