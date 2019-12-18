package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Multiple5 {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>(10);
	a1.add(10);
	a1.add(2);
	a1.add(5);
	Iterator<Integer> i= a1.iterator();
	while(i.hasNext()){
		Integer s=i.next();
		if(s %5!=0)i.remove();}System.out.println(a1);
	
}

}
