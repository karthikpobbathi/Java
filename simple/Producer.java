package simple;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	BlockingQueue blockingQueue;



	public Producer(BlockingQueue blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <8; i++) {
			System.out.println("Trying to add "+ i+" "+blockingQueue.offer(i));
			try{
			Thread.sleep(500);
			}
			catch(InterruptedException e){}
		}
	}
	

}
