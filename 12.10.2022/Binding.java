package polymorphism;
//UNDERSTANDING BINDING=--1>variable type --int a=10;
//2>Reference type---
// class Bank
//psvm(String args[])
// Bank obj;(reference typr)
//3>Object type---- Bank obj=new Bank();
/*
public class Binding {//EXAMPLE OF STATIC BINDING(Private,Final,Static)is happened during *COMPILETIME*
	private void display() {
		System.out.println("samjhe?");
	}

	public static void main(String[] args) {
Binding obj=new Binding();//(OBJECT TYPE binding)
obj.display();
	}}  */
class TestBinding{//DYNAMIC BINDING (*RUNTIME*)
	void show() {
		System.out.println("ab samjhe??");
	}}
class Binding extends TestBinding{
	void show() {
		System.out.println("Override");
	}
public static void main(String args[]) {
	TestBinding obj=new Binding();//(REFRENCE TYPE)CREATING THE OBJ OF CHILD CLASS WITH THE REFERENCE OF PARENT CLASS
	obj.show();
	}}
