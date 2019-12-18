package lab8;

import java.util.Arrays;
import java.util.Scanner;

public class lab8Ex5 {
	boolean flag=false;
    boolean checkString(String s) {
    char []ch=new char[s.length()];
    
    for(int i=0;i<s.length();i++) {
        	ch[i]=s.charAt(i);
          }
    
        Arrays.sort(ch);
        for(int i=0;i<s.length();i++) {
        if(ch[i]!=s.charAt(i)) {
        flag=false;
        
         break;
        }
        	else
        	flag=true;
          }
        
        	return flag; 
          }
    
          public static void main(String args[]) {
        	  
        	  Scanner in=new Scanner(System.in);
        	  System.out.println("Enter any string :");
        	  String s=in.next();
        	  lab8Ex5 as=new lab8Ex5();
        	  boolean c=as.checkString(s);
        	  System.out.println(c);
        	 in.close();
          }
}
