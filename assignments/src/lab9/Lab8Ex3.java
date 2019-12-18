package lab9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab8Ex3 {

	Map<Integer,Integer> getSquares(int []a) {
	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	int s=0;
	    
	for(int i=0;i<a.length;i++) {
	    s=a[i]*a[i];
	    hm.put(a[i],s);
	}
	     return hm;
	}
	     
public static void main(String args[]) {
	
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int n=in.nextInt();
    int []arr=new int[n];
    
    for(int i=0;i<n;i++) {
    arr[i]=in.nextInt();
  }
    
    Lab8Ex3 gs=new Lab8Ex3();
   Map<Integer,Integer> m=gs.getSquares(arr);
   System.out.println(m);
   
   }
}
