
package com.HP.WSTest;

import java.util.Properties;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {
	Properties prop = System.getProperties();
	
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
	@GET 
    @Produces("text/plain")
    @Path("/full")
    public String getIt() {
    	
    	StringBuffer sb = new StringBuffer();
    	for (Object pr : prop.keySet()) {
    		sb.append(pr.toString() + ": " + prop.getProperty(pr.toString()) + "\n");
    	}
    	
        return sb.toString();
    }
    
    
    @GET
    @Path("/json")
    @Produces("application/json")
    public MyProp getJson() {
    	
    	//create myPropMap
    	Properties myPropMap = new Properties();
    	myPropMap.put("javaVendor", prop.getProperty("java.vendor"));
    	myPropMap.put("osName", prop.getProperty("os.name"));
    	myPropMap.put("userName", prop.getProperty("user.name"));
    	myPropMap.put("userCountry", prop.getProperty("user.country"));
    	
    		MyProp myPropBean = new MyProp();
        	myPropBean.setJavaVendor(myPropMap.getProperty("javaVendor"));
        	myPropBean.setOsName(myPropMap.getProperty("osName"));
        	myPropBean.setUserName(myPropMap.getProperty("userName"));
        	myPropBean.setUserCountry(myPropMap.getProperty("userCountry"));
        	myPropBean.setCount(1);
        	

    	
    	return myPropBean;
    } 
}
