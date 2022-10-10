//2.Method Overloading by changing datatypes
package polymorphism;

public class ChangingDatatypeofArgs {
	static int sum(int a,int b) {//two parametarized
		return a+b;}
	 static double sum(double a,double b,double c) {//here we are overloading by changing DATATYPES
			 return a+b+c;
			 }
	 public static void main(String args[]) {
		System.out.println(ChangingDatatypeofArgs.sum(5, 6)); 
		System.out.println(ChangingDatatypeofArgs.sum(5.3,6.5,7.6)); 

	 
		 }
	}

