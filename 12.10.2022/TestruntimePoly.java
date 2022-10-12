package inheritance;
//Runtime Polymorphism
class Runtimepoly{
	int value=50;
	void show() {
		System.out.println("Show anything");
	}
}
public class TestruntimePoly extends Runtimepoly {
	int value=70;//DATA MEMERS CANNOT BE OVERDDIDE IN RUNTIME POLYMORPHISM
void show() {
	System.out.println("Show nothing");
}
	public static void main(String[] args) {
		//creating the object of the child class with the help of Parent class
Runtimepoly obj=new TestruntimePoly();//reference variable of parent class refers to the object of child class
obj.show();
System.out.println("value is: "+obj.value);//here we are tying to over ride the data but (CAN'T BECAUSE DATA  CANNOT BE OVERRIDE)
	}}
