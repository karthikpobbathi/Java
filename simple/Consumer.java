package simple;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
BlockingQueue blockingQueue;


	public Consumer(BlockingQueue blockingQueue) {
	super();
	this.blockingQueue = blockingQueue;
}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(blockingQueue.remainingCapacity()>=0){
			
			System.out.println("size is "+blockingQueue.size()+
					" remaining capacity is "+ blockingQueue.remainingCapacity());
			if(blockingQueue.remainingCapacity()==0){
		
				break;
			}
			try{
				Thread.sleep(400);
			}
			catch(InterruptedException e){
				
			}
			
		}

	}

}
