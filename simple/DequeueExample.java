package simple;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueExample {
public static void main(String[] args) {
	Deque<Integer> a=new LinkedList();
	a.add(100);
	a.add(200);
	a.addFirst(1000);
	a.addLast(22);
	System.out.println(a);
	System.out.println(a.peek());
	System.out.println(a.peekFirst());
	System.out.println(a.peekLast());
	System.out.println(a.getFirst());
	System.out.println(a.getLast());
	System.out.println(a.removeFirst());
	System.out.println(a);
}
}
