package collectionJava;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEg {

	public static void main(String[] args) {
	TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		hm.put(101,"Mango");
		hm.put(108,"Orange");
		hm.put(105,"Banana");
		hm.put(103,"Grapes");
	    hm.put(104,"Banana");
	    System.out.println(hm);
	    hm.putIfAbsent(102,"LinkedHashMap");
		hm.putIfAbsent(101,"WaterMelon");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			}
		hm.remove(103);
		System.out.println("After removal");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			}
	}

}
