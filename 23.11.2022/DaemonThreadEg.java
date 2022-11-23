package multiThreading;

public class DaemonThreadEg extends Thread {
public void run() {
	System.out.println("name :"+Thread.currentThread().getName());
	System.out.println("Daemon :"+Thread.currentThread().isDaemon());
	if(Thread.currentThread().isDaemon()) {
		System.out.println("i am daemon");
	}else {
		System.out.println("i am user");
	}
}
public static void main(String... args) {
	DaemonThreadEg t1=new DaemonThreadEg();
	DaemonThreadEg t2=new DaemonThreadEg();
	//t1.setDaemon(true);
t1.start();
t1.setDaemon(true);//this line give exception
t2.start();
}
}
