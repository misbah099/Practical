package inheritance;
//Final keyword cannot change the value of final variable(NEVER)
//Final variable ,Final method.Final class
//EXAPLE OF FINAL CLASS
//FINAL CLASS CANNOT BE INHERITED OR EXTEND
final class FinalClass {}
class test extends FinalClass{//HERE it is giving error bcz FinalClass(Final) cannot be inherited 
	void show() {
		System.out.println("NOTHING");
	}

	public static void main(String[] args) {
test t=new test();
t.show();

	}}
