package String;
//Check the equality of the string
import java.util.Scanner;

public class StringEqualitiy {
public static void main(String[] args) {
	String str1,str2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 1st string");
	str1=sc.next();
	System.out.println("Enter the 2nd string");
    str2=sc.next();
	if(str1.equals(str2))
	{
		System.out.println("Equal String");
	}else {
		System.out.println("Not equal");
	}
}
}
