package firstJava;

public class Staticvar {
	int rollno;
	float fee;
	String name;
	static String college="MIT";
	Staticvar(int rollno,float d,String name){
	this.rollno=rollno;
	this.fee=d;
	this.name=name;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
public class Staticvariable{
	public static void main(String[] args) {
Staticvar s=new Staticvar(1,1223,"joy");
Staticvar s1=new Staticvar(2,1500,"Mike");
s.display();
s1.display();

	}

}
}