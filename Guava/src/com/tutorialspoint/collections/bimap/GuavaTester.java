package com.tutorialspoint.collections.bimap;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class GuavaTester {

	public static void main(String[] args) {
		BiMap<Integer, String> empIdNameMap = HashBiMap.create();
		
		empIdNameMap.put(new Integer(101), "Mahesh");
		empIdNameMap.put(new Integer(102), "Sohan");
		empIdNameMap.put(new Integer(103), "Ramesh");

		// Emp Id of Employee "Mahesh"
		System.out.println(empIdNameMap.inverse().get("Mahesh"));
	}

}
