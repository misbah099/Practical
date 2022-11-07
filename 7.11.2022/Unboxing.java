package inheritance;
//Wrapper to Primitive
public class Unboxing {
public static void main(String[] args) {
	Integer a=new Integer(2);
	Integer i=a.intValue();//converting Integer into int using intValue() method
	Integer j=a;//now compiler will write int.value() unboxing
	System.out.println(a+" "+i+" "+j);
}
}
