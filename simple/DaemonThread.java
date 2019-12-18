package simple;
class Dthread extends Thread{
	public void run(){
		for (int i = 0;i<5 ; i++) {
			System.out.println(this.getId());
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){}
		}
	}
}
public class DaemonThread {
	public static void main(String[] args) {
Dthread d1= new Dthread();
//Dthread d2= new Dthread();
Dthread d3= new Dthread();
d1.setDaemon(true);
d1.start();
//d2.start();

for (int i = 0; i < 2; i++) {
	
	try{
		Thread.sleep(2000);
	}
	catch(InterruptedException e){}
	System.out.println("main thread");
}d3.start();}
}
