package collectionJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//set contains unique elements and does not follow insertion order and also not print duplicte elelment
public class HashSetEg {

	public static void main(String[] args) {
Set<String>s=new HashSet<String>();
s.add("Pencil");
s.add("Pen");
s.add("Mouse");
s.add("Phone");
s.add(null);
s.add("AC");
s.add("Bottle");
s.add("Earphone");
s.add("Pencil");

Iterator<String> itr=s.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
