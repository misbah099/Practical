package multiThreading;

public class RunnableInterfaceEg implements Runnable {
	public void run() {
System.out.println("I am thread....I am running");		
	}
public static void main(String[] args) {
	RunnableInterfaceEg ri=new RunnableInterfaceEg();
	Thread t=new Thread(ri);//Explicitly passing the obj of the class bcz we do not exending the THREAD CLASS
	t.start();
}
}
