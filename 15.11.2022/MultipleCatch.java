package exceptionHandling;

public class MultipleCatch {
static void mFunc() {
	try {
		//int i=50/0;//50/0
		int i=50/4;
		System.out.println(i);//arithmetic
		int arr[]=new int[3];//ArrayIndexOutOfBoundsException
		arr[3]=24;
	}catch(ArithmeticException e) {
		System.out.println(e);
	}catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println(ae);
	}finally {
		System.out.println("i am finallly block");
	}
	System.out.println("I am outside of try catch but inside the mFunc method");
}

public static void main(String[] args) {
	MultipleCatch m=new MultipleCatch();
	m.mFunc();
}
}
