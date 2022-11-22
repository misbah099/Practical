//directly we use thread class without extends(we dont pass the run() method so its only show the thread name)
package multiThreading;

public class ThreadEg {
public static void main(String[] args) {
	Thread t=new Thread("Misbah Chowdhury");//getting the name of thread 'Misbah Chowdhury'
	t.start();
	String s=t.getName();
	System.out.println(s);
}
}
