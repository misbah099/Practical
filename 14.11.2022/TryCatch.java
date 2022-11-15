package exceptionHandling;

public class TryCatch {
public static void main(String[] args) {
	try {
		int num=25/2;
		System.out.println("Result");
	}catch(ArithmeticException e){
		System.out.println("Number can't divided by zero");
		//System.out.println(25/0);
	}catch(Exception e){
		System.out.println(25/5);
	}
	System.out.println("The End");
}
}
