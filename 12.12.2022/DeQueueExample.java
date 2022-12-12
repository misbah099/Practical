package collectionJava;

import java.util.*;

public class DeQueueExample {

	public static void main(String[] args) {
Deque<String>dq=new ArrayDeque<String>();
dq.add("Ram");
dq.add("Karan");
dq.add("Riya");
dq.add("Sam");
dq.add("Ajay");
System.err.println(dq);
dq.addFirst("Shree");
dq.addLast("Riya");
System.out.println("New list is :");
	for(String s1:dq) {
		System.out.println(s1);
	}
dq.removeFirst();
dq.removeLast();
System.out.println("New updated List :");
for(String s2:dq) {
	System.out.println(s2);
}
}}
