package collectionJava;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueExample1 {

	public static void main(String[] args) {
		Deque<String>dq=new ArrayDeque<String>();
		dq.add("pallabi");
		dq.add("subhrajit");
		dq.add("mamta");
		dq.add("monalisa");
		dq.offerFirst("anju");//first print on the top
		System.out.println("After offer first");
		dq.offerLast("Monalisa");
		System.out.println("After offer last");
		//traversing
		for(String s:dq) {
			System.out.println(s);
		}
		//dq.peek() & dq.peekFirst same as peek()
		System.err.println("Peek :"+dq.peekLast());
		System.out.println("After peek last");
		for(String s1:dq) {
			System.out.println(s1);
		}
		//dq.poll() & dq.peekFirst same as poll()
		System.err.println("Poll :"+dq.pollLast());
		System.out.println("After poll last");
		for(String s2:dq) {
			System.out.println(s2);
		}
	}
}
