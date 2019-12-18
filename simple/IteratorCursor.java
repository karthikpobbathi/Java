package simple;

import java.util.ArrayList;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class IteratorCursor {
public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("java");
	a1.add("j2ee");
	a1.add("php");
	Iterator<String> i= a1.iterator();
	while(i.hasNext()){
		String s=i.next();
		if(s.equals("php")) 
			i.remove();
	}System.out.println(a1);
}
}
