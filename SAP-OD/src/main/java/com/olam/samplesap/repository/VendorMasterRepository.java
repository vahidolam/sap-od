package com.olam.samplesap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olam.samplesap.entity.SAPVendorMasterEntity;

public interface VendorMasterRepository extends JpaRepository<SAPVendorMasterEntity, Long> {

}
