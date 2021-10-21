package com.Practice1;

import java.util.HashMap;
import java.util.Map;

public class CharInStringCounter {
	
	public void counter(String inputString) {
		HashMap<Character, Integer> counterMap = new HashMap<Character, Integer>();
		
		char[] strArray = inputString.toCharArray();
		
		for (int i=0;i<strArray.length;i++) {
			if(counterMap.containsKey(strArray[i])) {
				counterMap.put(strArray[i], counterMap.get(strArray[i])+1);
			}
			else {
				counterMap.put(strArray[i], 1);
			}
		}
		
		for(Map.Entry entry : counterMap.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
}
