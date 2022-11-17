
//UserDefined Exception Example
package exceptionHandling;
class UserDefinedException1 extends Exception{//Parent Creating exception class 
	public UserDefinedException1(String str) {
		super(str);//Calling the constructor of Super Class
	}
}
public class UserDefinedException {
public static void main(String[] args) {
	try {
		throw new UserDefinedException1("Userdefined Exception");
	}catch(UserDefinedException1 u){
		System.out.println("Exception mill gaya");
		System.out.println(u.getMessage());
	}
}
}
