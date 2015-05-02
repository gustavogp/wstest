package com.HP.WSTest;

public class MyPropType {
	private String javaVendor;
	private String osName;
	private String userName;
	private String userCountry;
	private int count;
	

	public MyPropType(){}; //default constructor required by JAXB
	
	
	public String getJavaVendor() {
		return javaVendor;
	}
	public void setJavaVendor(String javaVendor) {
		this.javaVendor = javaVendor;
	}
	public String getOsName() {
		return osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
