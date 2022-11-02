package array;

public class CloneArray {

	public static void main(String[] args) {
int[] arr= {44,4,5,6};//declaring & initializing array
System.out.println("this is  actual array");
for(int i:arr)//foreach loop for printing value
	System.out.println(i);//Print
System.out.println("this is clone array");
int carr[]=arr.clone();//creating the clone
for(int i:carr)//for each loop for cloning array
	System.out.println(i);//
System.out.println("both are eual or not");
System.out.println(arr==carr);//Checking 
	}

}
