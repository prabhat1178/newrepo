package com.hashmap;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapDemo {
		
	public static void main(String[] args) {
	TreeMap<String,String> maps=new TreeMap<String,String>(new SortByKeyDescending());
	//TreeMap<String,String> maps=new TreeMap<String,String>();
	
	maps.put("198", "Nagendra");
	maps.put("133", "Swapnil");
	maps.put("144", "Ashish");
	//maps.put(null, "Ashish");//null not allowed
	
	maps.put("155", "Jeff");
	String old=maps.put("155", "Tridib");
	System.out.println("old = "+old);
	
	Set<Map.Entry<String,String>> entries=maps.entrySet();
	for(Map.Entry<String,String> entry:entries){
		System.out.println("___________________________");
		System.out.println("Key = "+entry.getKey());
		System.out.println("Key = "+entry.getValue());
	}
	
}  
}	
	