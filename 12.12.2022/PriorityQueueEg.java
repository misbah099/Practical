package collectionJava;

import java.util.PriorityQueue;

public class PriorityQueueEg {

	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("prakash");
		q.add("bumba");
		q.add("sankhajit");
		q.add("hasan");
		q.add("babai");
		q.add("owashim");
		q.add("tanmoy");
		System.out.println("Head:"+q.poll());//Fist element acc to lexi
		System.out.println("Queue: "+q);
		System.out.println("Head :"+q.peek());//First element acc to lexi
		System.out.println("Iterating the elements");
		//Iterator itr=q.iterator();
		//while(itr.hasNext()){
		//		System.out.println(itr.next());}
		System.out.println("head :"+q.poll());
		System.out.println("Queue :"+q);
		System.out.println("Head :"+q.remove());
		System.out.println("Queur :"+q);
		/* 		System.out.println("After removing);
		 Iterator itr1=q.iterator();
		 while(itr1.hasNext()){
		 		System.out.println(itr1.next()); */
  	}

}
