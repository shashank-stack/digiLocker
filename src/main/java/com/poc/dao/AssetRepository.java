package com.poc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.model.LockerData;
import com.poc.model.LockerDataPKId;

@Repository
public interface AssetRepository extends JpaRepository<LockerData, LockerDataPKId>{

}
