package collectionJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
//Insertion order followed in linkedhashset
public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String>s=new LinkedHashSet<String>();

		s.add("Pencil");
		s.add("Pen");
		s.add("Mouse");
		s.add("Phone");
		s.add(null);
		s.add("AC");
		s.add("Bottle");
		s.add("Earphone");
		s.add("Pencil");//not allow duplicate

		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}}
