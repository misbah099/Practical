package collectionJava;

import java.util.LinkedList;

public class LinkedListMethodEg {

	public static void main(String[] args) {
		LinkedList<String>l=new LinkedList<String>();
		l.add("Misbah");
		l.add("Abhishek");
		l.add("Atif");
		l.add("Niladri");
		l.add("Amit");
		System.out.println("List is: "+l);
		//retrieve the 1 st element fron list
	//	l.peek();
		System.out.println("Retrieve elment "+l.peek());//pick the 1st elemment
		//Retieve the last element of the  list
		System.out.println("Retieve the last element :"+l.peekLast());
		//Remove the 1 st element from the list
		System.out.println("Remove the 1 st element:"+l.poll());//remove the 1 st element default
		//Remove the Last element from the list
		System.out.println("Remove the last element:"+l.pollLast());//remove the Last element default
		//POP 
		System.out.println("pop use: "+l.pop());
	}

}
