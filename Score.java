package com.tka.jan15;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Score {
	
	public static void main(String[] args) {
		Map<String, Integer> s = new LinkedHashMap<>();
		
		s.put("Rohit", 24);
		s.put("Gill", 56);
		s.put("Virat", 23);
		s.put("Shreyash", 8);
		s.put("kl", 112);
		s.put("Jadeja", 27);
		s.put("NK", 20);
		s.put("Rana", 2);
		s.put("Siraj", 2);
		s.put("Kuldeep", 0);
		s.put("PK", 0);
		
		System.out.println("AllPlayer name with score");
		s.forEach((k,v) -> System.out.println(k+ "="+v));
		
		System.out.println("\nOnly players scores:");
		Collection<Integer> values = s.values();
		values.forEach(System.out::println);
		
		System.out.println("\nEnter name:- key index: Virat" );
		String pn="Virat";
		Integer pnscore = s.get(pn);
		System.out.println(pn+"--"+pnscore);
		
		System.out.println("\n Only players names");
		Set<String> keyName=s.keySet();
		keyName.forEach(System.out::println);
		System.out.println();
		
		for(String k:s.keySet()) {
			Integer v=s.get(k);
			System.out.println(k+">>"+v);
		}
		
		
		
	}

}
