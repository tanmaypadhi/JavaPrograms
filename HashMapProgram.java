package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * This is a program to explain in detail about HashMap.
 * Eg:
 * 1) How to store values in HashMap
 * 2) How to Print values of HashMap
 * 3) How to clone HashMap and print the cloned HashMap
 * 4) How to compare keys of HashMap
 * 5) How to compare values of HashMap
 * 6) How to compare two HashMap.
 */
public class HashMapProgram {
	public static void main (String args[]) {
		HashMap<String, Integer> hMap = new HashMap<>();
		HashMap<String, Integer> hMap1 = new HashMap<>();
		hMap.put("One", 1);
		hMap.put("Two", 2);
		hMap.put("Three", 3);
		hMap.put("Four", 4);
		hMap.put("Five", 5);
		
		for(Map.Entry<String, Integer> entry:hMap.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : "+ value);
		}
		
		hMap1 = (HashMap<String, Integer>) hMap.clone();
		
		for(Map.Entry<String, Integer> entry1:hMap1.entrySet()) {
			String key1 = entry1.getKey();
			Integer value1 = entry1.getValue();
			System.out.println(key1 + " : "+ value1);
		}
		
		//This will compare two hashmaps.
		if(hMap.equals(hMap1))
			System.out.println("Both the HashMaps are same");
		else
			System.out.println("Both the HashMaps are not same");
		
		//This will check whether the keys of both hashmaps are equal.
		if (hMap.keySet().equals(hMap1))
			System.out.println("Both the HashMaps keys are same");
		else
			System.out.println("Both the HashMaps keys are not same");
			
		//This will check whether the values of both hashmaps are equal.
		HashSet<Integer> set1 = new HashSet<Integer>(hMap.values());
		HashSet<Integer> set2 = new HashSet<Integer>(hMap1.values());
		if(set1.equals(set2))
			System.out.println("Both the HashMaps values are same");
		else
			System.out.println("Both the HashMaps values are not same");
			


	}

}
