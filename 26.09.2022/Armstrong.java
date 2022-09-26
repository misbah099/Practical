import java.util.Scanner;

public class Armstrong {

public static void main(String[] args) {
int Ognum,rem,result=0;
int num = 0;
Ognum=num;
Scanner sc=new Scanner(System.in);
System.out.println("enter the num you want to check");
	    Ognum=sc.nextInt();
	    Ognum=num;
	    while(Ognum!=0) {
	    	rem=Ognum%10;//take the last digit og the num
	    	result=result+(rem*rem*rem);//find square of that digit
	    	Ognum=Ognum/10;//now removing the last dig to again check
	    }
	    if(result==num) {
	    	System.out.println("number is Armstrong");
	    }
	    else{
	    	System.out.println("number is not Armstrong");

	    	
	    }
	
	}
}
