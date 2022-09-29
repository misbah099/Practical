/* USE OF THIS KEYWORD */
package firstJava;

public class Thiskeyword {
	int rollno;
	String name;
	float fee;
	Thiskeyword(int rollno,String name,float fee){//parameterized construtor/Local variable
		this.rollno=rollno;//this key word refer to the current object in a method 
		this.name=name;//'this' key word is eliminate the confusion b/w class attribute and parameter
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}
public class Test{
	public static void main(String[] args) {
Thiskeyword t=new Thiskeyword(11,"Sam",333);
Thiskeyword t1=new Thiskeyword(22,"Joy",555);
t.display();
t1.display();
	}
}}
