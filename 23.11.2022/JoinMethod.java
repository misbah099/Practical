package multiThreading;

public class JoinMethod extends Thread {
public void run() {
	for(int i=1;i<=3;i++) {
		try {
			Thread.sleep(1000);//sleep method gives delay of 1 sec here
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(i);
	}
}
public static void main(String[] args) {
	JoinMethod j=new JoinMethod();
	JoinMethod j1=new JoinMethod();
	JoinMethod j2=new JoinMethod();
    j.start();
    try {
    	j.join();//its gives to first complete the 'j' thread then j1,j2 both thread executes simultaneously at asame time
    }catch(Exception e) {
    	System.out.println(e);
    }
    j1.start();
    j2.start();
}
}
