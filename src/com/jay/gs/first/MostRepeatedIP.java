package com.jay.gs.first;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MostRepeatedIP {

	public static void main(String[] args) {
		String[] ips = new String[] {"10.10.0.1-frank [10/dec/17 10:14:27]", "10.0.0.1-frank [10/dec/17 10:14:28]","10.0.0.2-nancy [10/dec/17 10:14:28]", "10.0.0.1-frank [10/dec/17 10:14:27]"};
		getMostRepeatedIP(ips);
	}

	public static void getMostRepeatedIP(String[] urls) {
		Map<String, Integer> repeatedIps = new LinkedHashMap<>();

		for (String str : urls) {
			String[] sa = str.split("-");
			if(sa[0].split("\\.").length==4) {
				repeatedIps.put(sa[0], (repeatedIps.get(sa[0]) == null ? 1
						: repeatedIps.get(sa[0]) + 1));	
			}
		}
		Iterator<String> ips = repeatedIps.keySet().iterator();
		
		while(ips.hasNext()) {
			String ip = ips.next();
			System.out.println(ip +  " : " + repeatedIps.get(ip));
		}
	}
}
