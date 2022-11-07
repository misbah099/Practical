package inheritance;

import java.util.ArrayList;

public class UnboxingColletion {
public static void main(String[] args) {
	ArrayList <Integer>a1=new ArrayList<Integer>(); 
	//Autoboxing
	a1.add(5);
	a1.add(2);
	System.out.println("ArrayList="+a1);
	//unboxing
	int a=a1.get(0);//Integer converted into int
	int b=a1.get(1);
	System.out.println("Value of index 0"+a+" "+b);
}
}
