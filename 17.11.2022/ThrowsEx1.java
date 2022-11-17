package exceptionHandling;
import java.io.IOException;
public class ThrowsEx1 {
void show() throws IOException{
	throw new IOException("throw ecxeption");
}
void display()throws IOException{
	show();
}
void fetch() {
	try {
		display();
	}catch(Exception e) {
		System.out.println("exception solved");
	}
}
public static void main(String[] args)// throws IOException{
{
	ThrowsEx1 ob=new ThrowsEx1();
	ob.fetch();
/*	ob.show();//this method is calling because we are throwing the IOException in main method
	ob.display();//we have to throw the exception which is throw in method*/
	System.out.println("The End");
}
}
