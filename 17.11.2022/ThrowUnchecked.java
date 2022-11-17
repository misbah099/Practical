//Example of throw unchecked exception----Runtime
//using throw we can create our custom exception
package exceptionHandling;

public class ThrowUnchecked {
 public static void eligible(int age) {//to check whether the person is eligible or not
	 if(age<18) {
		 //throw ArithmeticExcepton if person is<18 year
		 throw new ArithmeticException("U are not eligible for voting");
	 }else {
		 System.out.println("person eligible for vote");
	 }
 }
 public static void main(String[] args) {
	eligible(12);
	System.out.println("Done");
}
}
