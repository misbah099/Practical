//Different types of Exception
package exceptionHandling;
public class ExceptionExample {
public void show() {
	String a="i am Error";
	System.out.println(a);
	try {
		//int i=50/0;//Arthimetic exception
		int i=50/5;
		System.out.println(i);
		//String s="riya";
		String s="1234";
		System.out.println(s.length());
		int arr[]=new int[3];//new array
	//	arr[4]=24;
		arr[2]=24;//array index out of bound exception
		int m=Integer.parseInt(s);//number format exception
		System.out.println(m);
	}catch(Exception e){
	System.out.println(e);
	
	}
	String b="i cannot be handle";
	System.out.println(a+" "+b);}//i am error i can not handle
public static void main(String[] args) {
ExceptionExample ep=new ExceptionExample();
ep.show();
}
}

