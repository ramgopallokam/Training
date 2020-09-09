package com.pack.model;

import javax.persistence.Embeddable;

@Embeddable
public class Distributor {
	int distId;
	String distName;
	String address;
	public int getDistId() {
		return distId;
	}
	public void setDistId(int distId) {
		this.distId = distId;
	}
	public String getDistName() {
		return distName;
	}
	public void setDistName(String distName) {
		this.distName = distName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Distributor(int distId, String distName, String address) {
		super();
		this.distId = distId;
		this.distName = distName;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Distributor [distId=" + distId + ", distName=" + distName + ", address=" + address + "]";
	}
	
}
