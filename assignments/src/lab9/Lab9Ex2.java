package lab9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab9Ex2 {
	 Map<Character,Integer> countCharacter(char []a) {
		   HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		   int c=0;
		   for(int i=0;i<a.length;i++) {
			    int count=0;
		        for(int j=0;j<a.length;j++) 
		        if(a[j]==a[i])
		        count++;
		        for(int k=0;k<i;k++) 
		        if(a[k]==a[i])
		        c++;
		        c=0;
		        hm.put(a[i], count);
		        }
		   
		        return hm;
		    }
		   
		public static void main(String args[]) {
		    
			Scanner in=new Scanner(System.in);
		    System.out.println("Enter any String: ");
		    char []arr=in.next().toCharArray();
		    
		    Lab9Ex2  ca=new Lab9Ex2 ();
		    Map<Character,Integer> m=ca.countCharacter(arr);
		    System.out.println(m);
		    
		}
}
