/*  Copy Constructor using Parametarized constructor*/
package firstJava;

public class CopyCons {
	int age;
	String name;
	CopyCons(int a,String n){
		age=a;
		name=n;
	}
	CopyCons(CopyCons c){//Describing copy constructor and here 'c' is just object 
		age=c.age;
		name=c.name;
	}
	void show() {
		System.out.println(age+" "+name);
	}

	public static void main(String[] args) {
CopyCons c1=new CopyCons(12,"joy");
CopyCons c2=new CopyCons(c1);
c1.show();
c2.show();

	}

}
