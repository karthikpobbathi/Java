package lab8;
import java.util.Scanner;
import java.io.*;
public class Lab8Ex4 {
	public static void main(String args[]) {
   	 
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter file name: ");
	    String s=in.next();
	    File f=new File("C:/Users/KPOBBATH/Desktop/kart/"+s);
	        
	    if(f.exists()) {
	        System.out.println("File "+f.getName()+" exists");
	     }
	        
	     else {
	         System.out.println("File Name "+f.getName()+" doesn't exist");
	        }
	        
	      if(f.canRead()) {
	         System.out.println("File "+f.getName()+" is Readable");
	        }
	        	 
	      if(f.canWrite()) {
	         System.out.println("File: "+f.getName()+" is Writable");
	        }
	        	 
	        System.out.println("The length of the file "+f.getName()+" is "+f.length());
	       
	      }
}
