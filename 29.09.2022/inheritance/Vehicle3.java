//Hirarchical HERITANCE EXAMPLE
package inheritance;

public class Vehicle3 {//PARENT CLASS
void running() {
	System.out.println("running mode on");
}}
class Car1 extends Vehicle3{//1ST CHILD CLASS
	void run() {
		System.out.println("car1 mode on");
	
	}}
class Bike1 extends Vehicle3{//2ND ANOTHER CHILD CLASS
	void speed() {
		System.out.println("Speed mode on");

	}}
class Hierarchiheritance{//MAIN CLASS
	public static void main(String[] args) {
		Car1 c=new Car1();//HERE CAR1 CLASS ONLY HERITING PARENT CLASS    
		c.run();//CALLING ITS OWN METHOD
		c.running();//CALLING METHOD OF PARENT CLASS
		Bike1 b=new Bike1();//BIKE1 CLASS ALSO HERITING THE PARENT CLASS
		b.speed();//CALLING THE ITS OWN METHOD
		b.running();//CALLING THE METHOD OF PARENT CLASS
	}}  /* HERE BOTH BIKE1 AND CAR1 CHILD CLASSES CLLING PARENT CLASS VEHICLE 3 *INDIVIDUALLY*   */