package com.abc.planyourtrip.model;

import java.util.Objects;


public class Package {
	
	private int packageId;
	
	
	private String packageName;
	private String packageLocation;
	private String packageDesc;
	private int packageDuration;
	private int price;
	
	
	public Package() {
		super();
	}
	
	
	public Package(int packageId, String packageName,String packageLocation, String packageDesc, int packageDuration, int price) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.packageLocation = packageLocation;
		this.packageDesc = packageDesc;
		this.packageDuration = packageDuration;
		this.price = price;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(packageLocation);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Package other = (Package) obj;
		return Objects.equals(packageLocation, other.packageLocation);
	}


	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getPackageLocation() {
		return packageLocation;
	}
	
	
	public void setPackageLocation(String packageLocation) {
		this.packageLocation = packageLocation;
	}
	public String getPackageDesc() {
		return packageDesc;
	}
	public void setPackageDesc(String packageDesc) {
		this.packageDesc = packageDesc;
	}
	public int getPackageDuration() {
		return packageDuration;
	}
	public void setPackageDuration(int packageDuration) {
		this.packageDuration = packageDuration;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Package [packageId=" + packageId + ", packageName=" + packageName + ", packageLocation="
				+ packageLocation + ", packageDesc=" + packageDesc + ", packageDuration=" + packageDuration + ", price="
				+ price + "]";
	}


	


	
	
	
	
}
