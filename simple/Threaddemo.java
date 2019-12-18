package simple;
import java.lang.Thread;
class MyThread extends Thread{
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("KARTHIK");
		}
	}
}
public class Threaddemo {
public static void main(String[] args) {
	Thread a= new MyThread();
	a.start();
	System.out.println("main Thread");
	for (int i = 0; i < 10; i++) {
		System.out.println("degfsdjdfh");
	}
}
}
