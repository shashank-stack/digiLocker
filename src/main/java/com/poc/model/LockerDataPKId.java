package com.poc.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class LockerDataPKId implements Serializable{
	

	private int customerId ;
	private int assetSerialNo;
	
	public int getCustomerId() {
		return customerId;
	}
	public int getAssetSerialNo() {
		return assetSerialNo;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setAssetSerialNo(int assetSerialNo) {
		this.assetSerialNo = assetSerialNo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + assetSerialNo;
		result = prime * result + customerId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LockerDataPKId other = (LockerDataPKId) obj;
		if (assetSerialNo != other.assetSerialNo)
			return false;
		if (customerId != other.customerId)
			return false;
		return true;
	}
	
	

}

