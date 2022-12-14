package collectionJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
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
hm.putIfAbsent(102,"Custard Apple");
hm.putIfAbsent(101,"Water Melon");
for(Map.Entry m:hm.entrySet()) {
System.out.println(m.getKey()+" "+m.getValue());	
}
hm.remove(103);
System.out.println(hm);
	}
}
