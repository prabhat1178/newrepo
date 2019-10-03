package com.hashmap;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;



 
public class LinkedfHashMapDemo {
		
	public static void main(String[] args) {

	LinkedHashMap<String,String> maps=new LinkedHashMap<String,String>();
	
	//here same rules of set will be applicable for key
	//like = key cannot be dulplicate
	//    =>> key can be null
	 //=>>>>>>>key must overridden hashcode and equals method
	maps.put("122", "Nagendra");
	maps.put("133", "Swapnil");
	maps.put("144", "Ashish");
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
	