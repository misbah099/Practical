package inheritance;
//Primitive to WrapperClass(Autoboxing)
public class Autoboxing {
public static void main(String[] args) {
	int a=10;//Primitive data type
	Integer i=new Integer(a);//converting int into Integer
	Integer j=a;//now compiler will write Integer   .valueOf() Autoboxing
	System.out.println(a+" "+i+" "+j);
	
}
}
