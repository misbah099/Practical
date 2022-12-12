package collectionJava;

import java.util.Stack;

public class StackEg {

	public static void main(String[] args) {
Stack<Integer> s=new Stack<Integer>();
//Checking empty or not
boolean result=s.empty();
System.out.println("Is the stack is Empty :"+result);
//Adding element (Push)
s.push(25);//5
s.push(35);//4
s.push(40);//3
s.push(55);//2
s.push(80);//1
s.push(75);//0
//result
System.out.println("Stack element is: "+s);
Integer digit =s.peek();//access the element from the top
System.err.println("top element:"+digit);
System.out.println("Stack element afte peek: "+s);
Integer digit2=s.pop();
System.err.println("Top element:"+digit2);
System.out.println("Stack element after pop:"+s);
//search any element
int digit1=s.search(35);
System.out.println("Searched element i:"+digit1);
//find the size of the stack
int x=s.size();
System.out.println("Stack size is: "+x);
//checking empty or not
result=s.empty();
System.out.println("Is the stack is empty or not: "+result);
	}

}
