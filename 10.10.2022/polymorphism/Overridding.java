package polymorphism;


class TestOverridding{
	void run() {
		System.out.println("running mode on");
	}
}
public class Overridding {
void run() {
	System.out.println("running mode off");
}
public static void main(String[] args) {
	Overridding a=new Overridding();
	a.run();
}
}
