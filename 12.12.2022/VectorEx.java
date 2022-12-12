package collectionJava;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
Vector<String>vc=new Vector<String>();
//Adding elements
vc.add("Dog");
vc.add("Cat");
vc.add(0,"Tiger");
vc.add("Lion");
//Checking size and capacity
System.out.println("size :"+vc.size());
System.out.println("Size:"+vc.capacity());
//add more elements
vc.addElement("Cow");
vc.addElement("Goat");
System.out.println("After adding elements");
System.out.println("size :"+vc.size());
System.out.println("Size:"+vc.capacity());
//checking cat is present in vector or not
System.out.println(vc);
if(vc.contains("Cat")) {
	System.out.println("Elements present");
}else {
	System.out.println("Elements not present");
}
//getting 1st element
System.out.println("1st element is :"+vc.firstElement());
//getting last element
System.out.println("Last element is :"+vc.lastElement());
//checking the  index of specific element
System.out.println("Index is :"+vc.indexOf("Cat"));

	}

}
