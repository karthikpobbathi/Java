package lab10;
import java.util.Date;
public class Lab10Ex2 implements Runnable {
         Thread t=new Thread(this);
         
public Lab10Ex2() throws InterruptedException {
    t=new Thread(this);
    t.start();
   }

public void run() {
    Date d;
    while(true) {
    	
    try {
    	d=new Date();
        Thread.sleep(10000);
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        } catch(InterruptedException e) {
        	System.out.println(e);
        }
    }}}

