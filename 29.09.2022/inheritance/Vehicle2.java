/* MULTILEVEL INHERITANCE EXAMPLE */
package inheritance;

public class Vehicle2 {//PARENT CLASS
void running() {
	System.out.println("running mode is on");
}}
class Bike2 extends Vehicle2{//1ST CHILD CLASS 
	void run() {
		System.out.println("bike mode is on");
	}}
class Car2 extends Bike2{//2ND CHILD CLASS
	void speed() {
		System.out.println("car speed is very high");
	}}
 class Multiplein{//MAIN CLASS
	public static void main(String[] args) {
		Car2 c=new Car2();//CREATING OBJ OF CAR2 CLASS BECAUSE ITS INHERITING ALL THE METHOD OF 1ST CHILD CLASS AND PARENT CLASS
		c.speed();//'c' OBJ CALLING ITS OWN METHOD
		c.run();//'c' OBJ CALLING THE METHOD OF BIKE2 CLASS 
		c.running();//'C' OBJ CALLING THE METHOD OF PARENT CLASS 'VEHIVLE2'
	}
}
