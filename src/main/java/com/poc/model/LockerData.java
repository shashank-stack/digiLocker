package com.poc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "LOCKER_DATA")
@IdClass(LockerDataPKId.class)
public class LockerData {
	@Id
	private int customerId ;
	@Id
	private int assetSerialNo;
	private String assetType;
	private String assetSource;
	private String assetEcosystem;
	private int assetQuantity;
	private String publicKey;
	private String privateKey;
	public int getCustomerId() {
		return customerId;
	}
	public int getAssetSerialNo() {
		return assetSerialNo;
	}
	public String getAssetType() {
		return assetType;
	}
	public String getAssetSource() {
		return assetSource;
	}
	public String getAssetEcosystem() {
		return assetEcosystem;
	}
	public int getAssetQuantity() {
		return assetQuantity;
	}
	public String getPublicKey() {
		return publicKey;
	}
	public String getPrivateKey() {
		return privateKey;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setAssetSerialNo(int assetSerialNo) {
		this.assetSerialNo = assetSerialNo;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	public void setAssetSource(String assetSource) {
		this.assetSource = assetSource;
	}
	public void setAssetEcosystem(String assetEcosystem) {
		this.assetEcosystem = assetEcosystem;
	}
	public void setAssetQuantity(int assetQuantity) {
		this.assetQuantity = assetQuantity;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

}
