/* CopyConstructor using Object */
package firstJava;

public class CopyCons1 {

	int age;
	String name;
	
	CopyCons1(int a,String n){
		age=a;
		name=n;}
CopyCons1(){
		}
	/*CopyCons1(CopyCons c){//Describing copy constructor and here 'c' is just object 
		age=c.age;
		name=c.name;
	}*/
	void show() {
		System.out.println(age+" "+name);}
	
/*	public static void main(String[] args) {
CopyCons c1=new CopyCons(12,"joy");
CopyCons c2=new CopyCons(c1);
c1.show();
c2.show();*/
	public static void main(String[] args) {
		CopyCons1 c1=new CopyCons1(12,"joyy");
		CopyCons1 c2=new CopyCons1();
		c2.age=c1.age;//storing c1 age value to c2 age
		c2.name=c1.name;//storing c2 name value to c2 name
		c1.show();
		c2.show();
		}}
