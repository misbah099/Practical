package exceptionHandling;
import java.lang.*;
import java.util.Scanner;

public class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);//Calling the constructor of Super Class
	}}
class CustomException{
public void checkAge(int age)throws InvalidAgeException{
	if(age<=18||age>=25) {
		throw new InvalidAgeException("invalid age for enrolling in java course");
	}else {
		System.out.println("proper age for enrolling in java code");
	}
}
public static void main(String[] args)throws InvalidAgeException {
	CustomException c=new CustomException();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
	int age=sc.nextInt();
	c.checkAge(age);
	
}
}

