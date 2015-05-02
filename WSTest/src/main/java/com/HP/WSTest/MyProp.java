package com.HP.WSTest;

//import javax.json.Json;
//import javax.json.JsonException;
//import javax.json.JsonObject;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyProp {
	private String javaVendor;
	private String osName;
	private String userName;
	private String userCountry;
	private int count;
	

	public MyProp(){}; //default constructor required by JAXB
	
	
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
	
/*	@Override
	public String toString() {
		try {
			JsonObject jO = Json.createObjectBuilder()
					.add("javaVendor", getJavaVendor())
					.add("osName", getOsName())
					.add("userName", getUserName())
					.add("userCountry", getUserCountry())
					.add("count", getCount())
					.build();
			return jO.toString();
		} catch (JsonException e) {
			return null;
		}
	} */
}
