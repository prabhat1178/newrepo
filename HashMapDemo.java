package com.hashmap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
 public class HashMapDemo {		
	public static void main(String[] args) {
	HashMap<String,String> maps=new HashMap<String,String>();
	
	//here same rules of set will be applicable for key
	//like = key cannot be dulplicate
	//    =>> key can be null
	 //=>>>>>>>key must overridden hashcode and equals method
	maps.put("122", "Nagendra");
	maps.put("133", "Swapnil");
	maps.put("144", "Ashish");
	maps.put("155", "Jeff");
	String old=maps.put("155", "Tridib");//will replace Jeff and return it
	System.out.println("old = "+old);
	maps.put(null, "test");
	maps.put(null, "test2");//overrides test
	System.out.println(maps);
	System.out.println("####### Fetching all the keys ################");
	Set<String> set = maps.keySet();
	for(String i:set){
		System.out.println(i);
	}
	System.out.println("####### Fetching all the values ################");
	Set<String> set2 = maps.keySet();
	for(String key:set2){
		System.out.println(maps.get(key));//It will return the corresponding value 
	}
	System.out.println("####### Fetching all the values by value()method ################");
		
		System.out.println(maps.values());
	
	
	System.out.println("####### Using Map.Entry ################");
	
	Set<Map.Entry<String,String>> entries=maps.entrySet();
	for(Map.Entry<String,String> entry:entries){
		System.out.println("___________________________");
		System.out.println("Key = "+entry.getKey());
		System.out.println("Value = "+entry.getValue());
	}
	System.out.println("####### Using Iterator ################");
	Set<String> id = maps.keySet();
	Iterator<String> iterator=id.iterator();
	while(iterator.hasNext()){
		String mapKey=iterator.next();
		String mapValue=maps.get(mapKey);
		System.out.println(mapKey + " " + mapValue);
	} 
	
	System.out.println("UnsupportedOperationException#######################");	
	Map<String,String> outMap=Collections.unmodifiableMap(maps);
	outMap.put("200","Prabhat");//UnsupportedOperationException
	//Collections.unmodifiableMap(maps);
//	maps.put("900", "value");//no exception
	
	Set<Map.Entry<String,String>> entri=maps.entrySet();
	for(Map.Entry<String,String> entry:entri){
		System.out.println("___________________________");
		System.out.println("Key = "+entry.getKey());
		System.out.println("Value = "+entry.getValue());
	}
	
	}
	
}  

	