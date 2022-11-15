package exceptionHandling;

public class NullPointerExcep {
String str=null;
int arr[]=null;
String convert(String s) {
	return s.toUpperCase();
}
public static void main(String[] args) {
	NullPointerExcep ob=new NullPointerExcep();
	System.out.println(ob.convert(null));
	System.out.println(ob.arr.length);
	System.out.println(ob.str.equals("pallabi"));
}
}
