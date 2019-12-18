package lab8;
import java.io.*;
public class Lab8Ex3 {
	
	
		
	    public static void main(String args[]) {
	        int c=0,words=0,lines=0;
	        
	        try {
	        BufferedReader ob=new BufferedReader(new FileReader("C:/Users/KPOBBATH/Desktop/kart/")); 
	        String n=ob.readLine();
	        
	        while(n!=null) {
	        	lines++;
	        	String []s=n.split(" ");
	        	words=words+s.length;
	        	
	        	for(String word:s) {
	        	c=c+word.length();
	        		}
	        		n=ob.readLine();
	        	}
	        	System.out.println("Characters = "+c);
	        	System.out.println("Words = "+words);
	        	System.out.println("Lines = "+lines);
	        	
	        }
	        	catch(IOException e) {
	        		
	        	}
	        	
	}
	}

