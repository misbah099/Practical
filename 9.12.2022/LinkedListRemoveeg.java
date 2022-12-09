package collectionJava;
//Use of remove method
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRemoveeg {

	public static void main(String[] args) {
		LinkedList<String>l=new LinkedList<String>();
		l.add("Misbah");
		l.add("Abhishek");
		l.add("Atif");
		l.add("Niladri");
		l.add("Amit");
		System.out.println("List is: "+l);
		LinkedList<String>ll=new LinkedList<String>();
		ll.add("peso");
		ll.add("Atif");
		ll.add("Shree");
		System.out.println("List 2 elements");
		//Adding all second list elements to the first list
		l.addAll(ll);
		System.out.println("List 1 element added to the list 2 :"+ll);
		//Removing specific element from the list
		l.add("Niladri");
		//Removing specific element from the list from specific position
		l.remove(1);
		//remove all new Elements
		l.removeAll(ll);
		//remove the 1st element from list
		l.removeFirst();
		System.out.println("1st element removed: "+l);
		//remove the Last element from list
		l.removeLast();
		System.out.println("Last element removed: "+l);
		//Adding new Elements
		l.add("Pallabi");
		l.add("Anudip");
		l.add("Java");
		l.add("Pallabi");

		l.add("Collection");
		System.err.println("Updated added list "+l);
 //remove 1st occurence
		l.removeFirstOccurrence("Pallabi");
		System.out.println("After removing 'Pallabi' :"+l);
		 //remove Last occurence
		l.removeFirstOccurrence("Pallabi");
		System.out.println("After removing last 'Pallabi' :"+l);
		//Travesing elemts in reverse order
		Iterator itr=l.descendingIterator();
		while(itr.hasNext()) {
			System.out.println("Reverse Order is: "+itr.next());
		}
		//Remove all elements 
		l.clear();
		Iterator<String> i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
