package inheritance;
//collection framework
import java.util.ArrayList;

public class AutoboxCollection {
public static void main(String[] args) {
	ArrayList<Integer>a1=new ArrayList<Integer>();
	//creating empty arrayList of Integer type
	a1.add(1);//adding primitive type value by using add() method
	a1.add(2);
	a1.add(3);//autoboxing
	System.out.println("ArrayList"+a1);
}
}
