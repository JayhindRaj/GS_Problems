package com.jay.gs.first;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidator{
	
    private static Pattern pattern;
    private static Matcher matcher;
 
    private static final String IPADDRESS_PATTERN = 
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])^";
	  
    public IPAddressValidator(){
	  pattern = Pattern.compile(IPADDRESS_PATTERN);
    }
	  
   /**
    * Validate ip address with regular expression
    * @param ip ip address for validation
    * @return true valid ip address, false invalid ip address
    */
    public static boolean validate(final String ip){		  
	  matcher = pattern.matcher(ip);
	  return matcher.matches();	    	    
    }
    
    public static void main(String[] args) {
    	
    	
    	IPAddressValidator addressValidator = new IPAddressValidator();
//		System.out.println("10.45..45.0");
//		System.out.println(validate("10.45..45.0"));
//		System.out.println(validate("10.45.45.0"));
//		System.out.println(validate("10.45.45.256"));
//		System.out.println(validate("10.45.345.0"));
//		System.out.println(validate("10.45.0.198"));
//		System.out.println(validate("255.45.45.0"));
//		System.out.println(validate("420.45.45.0"));
//		System.out.println(validate("150.45.45.0"));
//		System.out.println(validate("80.48.245.210"));
		
		System.out.println(extarctIp("10.10.0.1-frank [10/dec/17 10:14:27]"));
//		System.out.println(extarctIp("10.10.0.1"));
		System.out.println(extarctIp("IP_10.29.167.187"));
		extractIP1("10.10.0.1-frank [10/dec/17 10:14:27]");
		extractIP1("IP_10.29.167.187");
		extractIP1("10.10.0.1");
		extractIP1("10.29.167.187");
	}
    
    public static String extarctIp(String ip) {
    	
    	String IPADDRESS_PATTERN = 
    	        "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    	        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    	        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    	        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    	
    	String ipS = "hjkhdd 10.36.45.12 fhsdjfh s 101.189.72.15 dfsdf d";
    	
    	String[] s1 = ipS.split(IPADDRESS_PATTERN);
    	
    	for(String s : s1) {
    		System.out.println("gd df: " + s);
    	}
    	
    	Pattern pattern1 = Pattern.compile(IPADDRESS_PATTERN);
    	String[] s = pattern1.split(ip);
    	if(s.length > 0) {
    		System.out.println(s[0]);	
    	}
    	
    	Matcher matcher1 = pattern1.matcher(ip);
    	        if (matcher1.find()) {
    	            return matcher1.group();
    	        }
    	        else{
    	            return "0.0.0.0";
    	        }
    	
    }
    
    
    public static void extractIP1(String ipStr) {
    	String IPADDRESS_PATTERN = 
    	        "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    	        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    	        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    	        "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    	 Pattern p = Pattern.compile(IPADDRESS_PATTERN);
         Matcher m = p.matcher(ipStr);
         List<Object> tokens = new LinkedList<Object>();
         while(m.find())
         {
           String token = m.group( 1 ); 
           tokens.add(token);
         }
         System.out.println(tokens);
    }
}