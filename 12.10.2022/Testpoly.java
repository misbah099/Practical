//Runtime Polymorphism(Overriding)
package polymorphism;
class Bank{
	float rateOfInterest() {
		return 0;
	}}
class Axis extends Bank{
	float rateOfInterest() {
		return 2.3f;
	}}
class SBI extends Bank{
	float rateOfInterest() {
		return 7.3f;
	}}
class ICICI extends Bank{
	float RateOfInterest() {
		return 5.4f;
	}}

public class Testpoly {
	
public static void main(String[] args) {
	
Bank obj;
obj=new Axis();
System.out.println("Axis"+obj.rateOfInterest());
obj=new SBI();
System.out.println("SBI"+obj.rateOfInterest());
obj=new ICICI();
System.out.println("Axis"+obj.rateOfInterest());
	}}
