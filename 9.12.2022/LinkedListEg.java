package collectionJava;
//Adding using LinkedList
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg {

	public static void main(String[] args) {
LinkedList<String>l=new LinkedList<String>();
l.add("Arnab");
l.add("Abhishek");
l.add("Akash");
l.add("Avik");
l.add("Amit");
System.out.println("List is: "+l);
Iterator<String>itr=l.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
//Adding element to a Specific position
l.add(2,"Nisha");
System.out.println("After adding new list 1"+l);
LinkedList<String>ll=new LinkedList<String>();
ll.add("peso");
ll.add("Atif");
ll.add("Shree");
System.out.println("List 2 elements");
//Adding all second list elements to the first list
l.addAll(ll);
System.out.println("List 1 element added to the list 2 :"+ll);
//Adding all second list element at special position of list 1
l.addAll(2, ll);
System.out.println("New specific added element in list 1 :"+l);
//Adding to the First element
l.addFirst("New 1st element");
System.err.println("1st Added element is"+l);
//Adding to the Last element
l.addLast("New Last element");
System.err.println("Last Added element is"+l);
	}

}
