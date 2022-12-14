package collectionJava;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEg {

	public static void main(String[] args) {
TreeSet<String>ts=new TreeSet<String>();
ts.add("A");
ts.add("N");
ts.add("D");
ts.add("P");
ts.add("Q");
ts.add("T");
ts.add("J");
ts.add("F");
ts.add("G");
ts.add("V");
ts.add("C");
ts.add("R");
System.out.println("Orignal set list is :"+ts);
Iterator itr=ts.descendingIterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	System.out.println("Lowest value "+ts.pollFirst());//retrieve and remove the element pollFirst
	System.out.println("Orignal set list is :"+ts);

	System.out.println("Highest value "+ts.pollLast());
	System.out.println("Orignal Updated set list is :"+ts);

	System.out.println("Reverse set:"+ts.descendingSet());
	//sorted set set operation
	System.out.println("Head set :"+ts.headSet("T"));//headSet() prints all the character less ASCII than the Char Pass but in Ascending order
	System.out.println("Sub set :"+ts.subSet("C","N"));//subSet() prints all the value under the ASCII value range bw 'C' to 'N' Ascending Order
	System.out.println("Tail set :"+ts.tailSet("O"));//tailSet() prints all the value after the ASCII of 'O' or value passed in Ascending order
	}

}
