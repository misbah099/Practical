package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExcep {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two number");
try {
	int x=sc.nextInt();
	int y=sc.nextInt();
	System.out.println(" "+x/y);
}catch(InputMismatchException e) {
	System.out.println(e);
}catch(Exception e) {
	System.out.println(e);
}
	}

}
