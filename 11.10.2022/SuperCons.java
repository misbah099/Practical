package inheritance;
//Super keyword: Reference variable which refer immediate parent class
//# usage of SUPER keyword
//3rd_Refer immediate parent class Constructor
class Shape2{//PARENT CLASS
	public Shape2() {//Default constructor
		System.out.println("hello");
	}}
class Size2 extends Shape2{
	Size2(){//Default constructor of Child class
		super();
		System.out.println("hi");
	}
}
public class SuperCons {

	public static void main(String[] args) {
Size2 obj=new Size2();//Creating obj of child class WE DONT NEED TO CALLED METHOD
	}

}
