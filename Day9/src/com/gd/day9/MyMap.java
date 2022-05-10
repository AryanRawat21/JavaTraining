package com.gd.day9;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//it will work on key and value pair
//name -salary
//id --name
//Int ---employee
//employee-int(id)

//it is not part of collections

public class MyMap {

	// id and name
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();

		// HashMap--it does not have key as duplicate
		// it does not maintain the order also

		// insert into map
		map.put(1001, "Ravinder");
		map.put(1002, "kumar");
		map.put(1009, "Mahesh");
		map.put(1001, "Mahesh");
		map.put(1003, "Mahesh");

		// method to check value is there in map or not
		System.out.println(map.containsValue("kumar1"));

		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		for (Integer i : keys) {
			System.out.println("keys as " + i);
			System.out.println("value is " + map.get(i));
		}
		
		//join two map togahter
		map.putAll(map);
		
		
		map.size();
		
		Collection<String> ls=map.values();
		for(String str:ls)
		{
			System.out.println(str);
		}
		System.out.println(map);

	}
}
