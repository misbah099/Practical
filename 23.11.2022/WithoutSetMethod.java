package multiThreading;

public class WithoutSetMethod {
public void run() {
	System.out.println("Misbah");
}
public static void main(String[] args) {
	Thread t=new Thread ("pallabi");//name given to thread with cinstructor
	Thread t1=new Thread ();
    t.start();
	t1.start();
    t1.setName("name 2");//name given to thread 2 using the setName() method
	System.out.println("Thread 0:"+t.getName());
	System.out.println("Thread 1:"+t1.getName());
}
}
