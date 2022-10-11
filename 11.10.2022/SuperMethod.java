package inheritance;
//Super keyword: Reference variable which refer immediate parent class
//# usage of SUPER keyword
//2nd_Refer immediate parent class Method
class Shape1{//PARENT CLASS
	void print() {//CALLING METHOD
		System.out.println("Print Circle");
	}}
class Size1 extends Shape1{
	void print() {
		System.out.println("Print Triangle");}
	void display() {
		System.out.println("Print nothing");}
	void show() {//Final method
		super.print();//SUPER.PRINT immediate refer the PRINT of Parent Class
		display();
	}
}
public class SuperMethod {

	public static void main(String[] args) {
Size1 obj=new Size1();
obj.show();
	}}
