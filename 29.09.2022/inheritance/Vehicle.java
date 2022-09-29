/* SINGLE INHERITANCE EXAMPLE */
package inheritance;

public class Vehicle {//PARENT CLASS
void running() {
	System.out.println("running mode on");
}}
class Bike extends Vehicle{//CHILD CLASS EXTENDING PARENT
	void run() {
		System.out.println("Bike run mode on");
	}}
 class Vehicle1{//ANOTHER 'MAIN CLASS'
	public static void main(String args[]) {
		Bike b=new Bike();//CREATING OBJ OF CHILD CLASS'BIKE'
		b.run();//OBJECT B IS CALLING ITS OWN METHOD
		b.running();//OBJECT B CALLING THE METHOD OF PARENT CLASS
	}
}