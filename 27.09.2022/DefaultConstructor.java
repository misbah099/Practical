/* Deafult constructor&Method */
package firstJava;

public class DefaultConstructor {
	int age;
	String name;
	void show() {
		System.out.println(age+ " "+name);}
	
	/*DefaultConstructor(){//Default constructor
		System.out.println("Constructor is Created:");}

	public static void main(String[] args) {
DefaultConstructor d=new DefaultConstructor();//calling default constructor*/
	
	public static void main(String[] args) {
		DefaultConstructor d=new DefaultConstructor();
		DefaultConstructor d1=new DefaultConstructor();
       d.show();
       d1.show();
       DefaultConstructor dd=new DefaultConstructor();
	   DefaultConstructor dd1=new DefaultConstructor();
	   dd.age=100;
	   dd1.age=23;
	   dd.show();
       dd1.show();
	}}
