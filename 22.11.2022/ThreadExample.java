package multiThreading;

public class ThreadExample extends Thread {
public void run() {//predefined method of thread class for running the thread method
	System.out.println("I am Thread ....thread is running");
}
public static void main(String[] args) {
	ThreadExample t=new ThreadExample();// creating the obj to form a new thread
	t.start();//Starting a NEW thread
	//String s=t.getName();//print the default thread name 'thread 0'
	t.setName("Misbah");//Set the own thread name
	String s=t.getName();
	System.out.println(s);
}
}
