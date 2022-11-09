package String;

public class MutableExapleString {
public static void my(){
//    StringBuffer s=new StringBuffer("Hello");
//	s.append("World");
//	System.out.println("String is: "+s);//Hello World
//	s.insert(2, "Riya");
//	System.out.println("Insert is :"+s);//HeRiyalloWorld
//	s.replace(1, 3,"java");
//	System.out.println("Replace is :"+s);//HjavaiyalloWorld
//	System.out.println("Capacity is :"+s);//21 has formula to calculate value
StringBuilder s1=new StringBuilder("World");//String builder("World")
s1.replace(1, 3, "java");
System.out.println("Replace is :"+s1);//Wjavald
s1.delete(1, 3);
System.out.println("Delete is :"+s1);//Wvald
s1.reverse();
System.out.println("Reverse is :"+s1);//dlavw
}
public static void main(String[] args) {
	my();
}}
