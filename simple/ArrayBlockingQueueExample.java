package simple;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;


public class ArrayBlockingQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlockingQueue arrayBlockingQueue= new ArrayBlockingQueue(5);
		
		Producer p=new Producer(arrayBlockingQueue);
		Consumer c =new Consumer(arrayBlockingQueue);
		
		Thread producer=new Thread(p);
		Thread consumer=new Thread(c);
		
		producer.start();
		consumer.start();
	}

}
