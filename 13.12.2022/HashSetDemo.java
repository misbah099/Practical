package collectionJava;

import java.util.HashSet;//does not follow insertion order but we all take 'null' as a element in hashset
import java.util.Set;
public class HashSetDemo {
public static void main(String[] args) {
		HashSet<String>s=new HashSet<String>();
		s.add("Ram");
		s.add("Rima");
		s.add("Shayam");
		s.add("Ram");
		s.add("Ramesh");
		System.out.println("Orignal list: "+s);
		//removing specific element from hash set
		s.remove("Ram");
		System.out.println("After invoking remove "+s);
		HashSet<String>s1=new HashSet<String>();
		s.add("Pallabi");
		s.add("Rahul");
		System.out.println("New set is :"+s1);
		s.addAll(s1);
		System.out.println("Updated list is :"+s);
		
		//remove all 
		s.removeAll(s1);
		s.clear();
		System.out.println("Present list is :"+s);
	}

}
