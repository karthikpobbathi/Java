package lab11;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


	class MicrosoftWord implements Runnable{
	    @Override
	    public void run() {
	        System.out.println("MS Word is running");
	        try {
	            Thread.sleep(300);
	        }catch(InterruptedException e) {
	            System.out.println(e);
	        }
	        System.out.println("MS Word is stop");
	    }
	}

	 

	class MediaPlayer implements Runnable{
	    public void run() {
	        System.out.println("Media player is running");
	        try {
	            Thread.sleep(300);
	        }catch(InterruptedException e) {
	            System.out.println(e);
	        }
	        System.out.println("Media player is stop");
	    }
	}public class Lab11Ex1 {
	public static void main(String args[]) {
        System.out.println("Choose option. \n 1. Executor \n 2.ExecutorService");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i==1)
        {
            Executor e = Executors.newSingleThreadExecutor();
            e.execute(new MicrosoftWord());
            e.execute(new MediaPlayer());
        }
        else if(i==1)
        {
            ExecutorService e1 = Executors.newSingleThreadExecutor();
            ExecutorService e2 = Executors.newFixedThreadPool(5);
            e1.execute(new MicrosoftWord());
            e1.execute(new MediaPlayer());
            e2.execute(new MicrosoftWord());
            e2.execute(new MediaPlayer());
            e1.shutdown();
            e2.shutdown();
        }
       
    }
}
