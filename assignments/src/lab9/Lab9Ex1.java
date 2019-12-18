package lab9;
import java.util.*;
public class Lab9Ex1 {
	 List<String> getValues(HashMap<Integer,String> h) {
			ArrayList<String> a=new ArrayList<String>();
			Set<Integer> s=h.keySet();
			Iterator<Integer> i=s.iterator();
			
			while(i.hasNext()) {
					Integer key=i.next();
					String str=(String)h.get(key);
					a.add(str);
					Collections.sort(a);
				}
		        	return a;
		        }
		    
		public static void main(String args[]) {
		       HashMap<Integer,String> hm=new HashMap<Integer,String>();
		       
		       Scanner in=new Scanner(System.in);
		       System.out.println("Enter the number of elements: ");
		       int n=in.nextInt();
		        	   
		       for(int i=0;i<n;i++) {
		        	hm.put(in.nextInt(),in.next());
		        }
		        	   
		       Lab9Ex1  ehm=new Lab9Ex1 ();
		     List<String> l=ehm.getValues(hm);
		     System.out.println(l);
		        	
		    }
}
