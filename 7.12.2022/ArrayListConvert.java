package collectionJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dee.Array;

public class ArrayListConvert {
public static void main(String[] args) {
	//	List<String>al=new ArrayList();//non-generic

	List<String>al1=new ArrayList<String>();//generic
	al1.add("Rose");
	al1.add("Sunflower");
	al1.add("Lily");
	al1.add("Daisy");
	al1.add("Marigold");
	al1.add("Tulip");
	al1.add("Jasmine");
	//conversion of list to array
	System.out.println("List to array");
	String []arr=al1.toArray(new String[al1.size()]);
	for(String s:arr) {
		System.out.println(s);
	}
	//array to list
	System.out.println("Array to list");
	List<String>all=new ArrayList<String>();
	all=Arrays.asList(arr);
	System.out.println(all);
}
}
