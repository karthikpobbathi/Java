package lab10;
import java.io.*;

public class CopyDataThread extends Thread {
          
FileInputStream fis;
FileOutputStream fos;
          
public CopyDataThread(FileInputStream fis,FileOutputStream fos) {
     this.fis=fis;
     this.fos=fos;
     }

public void run(){
	
    try {
        int c,i=0;
        while((c=fis.read())!=-1) {
        fos.write(c);
        i++;
        
        if(i%10==0) {
        System.out.println("characters are copied");
        try {
        sleep(5000);
        
        } catch(InterruptedException e) {
        System.out.println(e);
        }
        }
        }
        
    fis.close();
    fos.close();
    System.out.println("Copied Successfully");
    } catch(IOException e) {
    System.out.println(e);
}
}
}