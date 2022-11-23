package multiThreading;

public class CurrentThreadName extends Thread {
public void run() {
	System.out.println(Thread.currentThread().getName());//this line give the currentThread name
}
public static void main(String[] args) {
	CurrentThreadName c=new CurrentThreadName();
	CurrentThreadName c1=new CurrentThreadName();

			c.start();//thread 1
			c1.start();//thread 2
}
}
