package String;

import java.util.Scanner;

public class StringTest {
	public void show() {//method for printing
Scanner sc=new Scanner(System.in);//taking user input
System.out.println("enter string");
String A =sc.next();//1st String
String B=sc.next();//2nd String
System.out.println(A.length()+B.length());//1st string length Anudip=6,Add with the 2nd length Java=4,then sum =10
System.out.println((A.compareTo(B)>0)?"yes":"no");
System.out.println(A.substring(0,4).toUpperCase()+A.substring(2)+" "+B.substring(0,1).toLowerCase()+B.substring(1));
}
public static void main(String[] args) {
	StringTest t=new StringTest();
	t.show();
}	
}
