/* Static method Exaple  */
package firstJava;

public class Staticmethod {
	int rollno;
	String name;
	float fee;
	static String college="MIT";
	static void change() {//Static method for changing stati variable
		college="ITI";//for
	}
	Staticmethod(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
public class Staticmethod1{
	public static void main(String[] args) {
		Staticmethod.change();//calling Static method for changing MIT to ITI which is (STATIC)
Staticmethod s=new Staticmethod(1,"Tomy",1300);
Staticmethod s1=new Staticmethod(2,"Raj",1400);
s.display();//display after changing STATIC college variable
s1.display();
	}

}
}