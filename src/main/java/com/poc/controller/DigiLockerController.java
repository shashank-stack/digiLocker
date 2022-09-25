package com.poc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.dao.AssetRepository;
import com.poc.model.LockerData;
import com.poc.model.LockerDataPKId;

@RestController
@RequestMapping("digitalAsset")
public class DigiLockerController {
	
	@Autowired
	private AssetRepository assetRespository;
	
	@PostMapping("/addAsset")
	public String saveLockerData (@RequestBody LockerData lockerData) {
		assetRespository.save(lockerData);
		return "Asset Saved";
	}
	
	@GetMapping("/allAssets")
	public List<LockerData> getAllAssets(){		
		return assetRespository.findAll();
		
	}
	
	@PostMapping("/assetByCustId")
	public Optional<LockerData> getbyId(@RequestBody LockerDataPKId lockerDataPKId){		
		return assetRespository.findById(lockerDataPKId);
		
	}
	

}
