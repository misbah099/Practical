/*Find number is prime or not  */
package firstJava;

import java.util.Scanner;

public class prime1 {

	public static void main(String[] args) {
int num,i,count=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter num to check");
  num=sc.nextInt();//taking input
  for(i=2;i<num;i++) {
	  if(num%i==0) {
		  count++;
		  break;
	  }
  }
  if(count==0) {
	  System.out.println("it is a Prime number");
  }
  else {
	  System.out.println("it is not a Prime number");

  }
	}}
