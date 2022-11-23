package multiThreading;

public class DaemonThread extends Thread {
public void run() {
	if(Thread.currentThread().isDaemon()) {
		System.out.println(Thread.currentThread().getName());
		System.out.println("i am daemon");
	}else {
		System.out.println("I am user thread");
	}
}
public static void main(String[] args) {
	DaemonThread t=new DaemonThread();
	DaemonThread t1=new DaemonThread();
	DaemonThread t2=new DaemonThread();
t1.setDaemon(true);
t.start();
t1.start();
t2.start();
}
}
