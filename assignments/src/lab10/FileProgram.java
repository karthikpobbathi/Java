package lab10;
import java.io.*;

public class FileProgram {
	
   public static void main(String args[]) {
	   
    try {
    	FileInputStream fis=new FileInputStream("C:/Users/KPOBBATH/Desktop/karthik/Demo.txt");
    	FileOutputStream fos=new FileOutputStream("C:/Users/KPOBBATH/Desktop/karthik/Target.txt");
    	CopyDataThread ob=new CopyDataThread(fis,fos);
    	ob.start();
    	    
    	 } catch(IOException e){
    		 System.out.println(e);
    	 }
     }
}