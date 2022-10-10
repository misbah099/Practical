//  Overloading typePromotion Example
package polymorphism;

public class Overloadingtypepromotion {
void add(int a,long b) {
	System.out.println(a+b);
}
void add(int a,int b,int c) {
	System.out.println(a+b+c);
}
public static void main(String[] args) {
	Overloadingtypepromotion ob=new Overloadingtypepromotion();
	ob.add(2, 3);
	ob.add(2, 3, 4);
}
}
