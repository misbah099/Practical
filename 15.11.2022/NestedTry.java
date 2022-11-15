package exceptionHandling;

public class NestedTry {
public static void main(String[] args) {
	try {//outer try block
		try {//inner try block
		System.out.println("Going to divide by 0");
		int b=19/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}try {//inner try block 2
		int a[]=new int[5];
		a[6]=4;//assigning the value out of array index
		
		}catch(ArrayIndexOutOfBoundsException e ) {//catch block of inner try 2
			System.out.println(e);
		}
		System.out.println("Other statement");
		
	}catch(Exception e) {
		System.out.println("handled the exception (Outer catch)");
	}
	System.out.println("normal flow...");
}
}
