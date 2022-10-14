package inheritance;
// create object without using new key word
class AnotherClass{//another Class
	String name;//data members of Another class
	int age;	
}
public class WithoutNew {//class

	public static void main(String[] args) {//main
		// TODO Auto-generated method stub
		try {//creating object usingnewInstance method
			        AnotherClass o1=AnotherClass.class.newInstance();
					AnotherClass o2=AnotherClass.class.newInstance();
					AnotherClass o3=AnotherClass.class.newInstance();
					AnotherClass o4=AnotherClass.class.newInstance();
					AnotherClass o5=AnotherClass.class.newInstance();
             o1.name="a";
			 o1.age=32;
			 o2.name="b";
			 o2.age=30;  
			 o3.name="c";
			 o3.age=34; 
			 o4.name="d";
			 o4.age=31; 
			 o5.name="e";
			 o5.age=18;  
				System.out.println("name="+o1.name+" Age="+o1.age);
				System.out.println("name="+o2.name+" Age="+o2.age);
				System.out.println("name="+o3.name+" Age="+o3.age);
				System.out.println("name="+o4.name+" Age="+o4.age);
				System.out.println("name="+o5.name+" Age="+o5.age);

		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
