package collectionJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEg {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
		hm.put(101,"Mango");
		hm.put(108,"Orange");
		hm.put(105,"Banana");
		hm.put(103,"Grapes");
		hm.put(102,"Chiku");
		hm.put(null,null);
		hm.put(102,null);
		hm.put(null,"Apple");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			}
		System.out.println("_______________________________________");
		hm.putIfAbsent(102,"LinkedHashMap");
		hm.putIfAbsent(101,"WaterMelon");
		//Key
		System.out.println("keys"+hm.keySet());
		//key-value
		System.out.println("Keys and values :"+hm.entrySet());
		hm.remove(103);
		System.out.println("After removal");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			}
	}

}
