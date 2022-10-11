package inheritance;
//Final keyword cannot change the value of final variable(NEVER)
//Final variable ,Final method.Final class
//Here is the example of Final method
public class FinalMethod {//Creating final method
public final void display() {
	System.out.println("This is a final method");
}}
class Main extends FinalMethod{
	public final void display() {//'COMPILETIME ERROR' because we cannot override or change final Method
		System.out.println("This is a final method");
}
public static void main(String args[]) {
	Main obj=new Main();
	obj.display();
}}