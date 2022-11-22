package multiThreading;
//Thread(Runnable,obj,String name)
public class RunnableInterfaceEg2 implements Runnable {
public void run() {
	System.out.println("Thread running");
}
public static void main(String[] args) {
	RunnableInterfaceEg2 ri=new RunnableInterfaceEg2();
	Thread t=new Thread(ri,"Thread name");//passing the obj of the class expilicitly
	t.start();
	String s=t.getName();
	System.out.println(s);
}
}
