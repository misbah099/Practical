package collectionJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
List<String>al=new ArrayList<String>();
al.add("Ram");
al.add("Sham");
al.add("Rose");
al.add("Liza");
al.add("Devid");
al.add("Maria");
String element=al.get(2);
System.out.println("Get index :"+element);
System.out.println("Array list is :"+al.isEmpty());
String element1=al.remove(4);
System.out.println("Travesing using for loop");
for(int i=0;i<al.size();i++) {
	System.out.println(al.get(i));
}
	}

}
