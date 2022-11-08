package String;
//Char[]work same as java string
public class StringExp2 {
public void show() {//Method 1
	char ch[]= {'j','a','v','a'};//Char type array
	String s=new String(ch);
	System.out.println("value is:"+s);
	System.out.println(ch);
}
public void myFunction() {//Method 2
	String m="Misbah";
	String m1="Chowdhury";
	String m2=new String(m1);
	System.out.println(m2);
}
public static void main(String[] args) {
	StringExp2 e=new StringExp2();
	e.show();
	e.myFunction();
}
}
