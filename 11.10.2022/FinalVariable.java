package inheritance;
//Final keyword cannot change the value of final variable(NEVER)
//Final variable ,Final method.Final class
public class FinalVariable {
final int value=50;
void display() {
	System.out.println(value);	
}
	public static void main(String[] args) {
		FinalVariable obj=new FinalVariable();
		obj.display();
	}

}
