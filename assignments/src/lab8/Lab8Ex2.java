package lab8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab8Ex2 {
public static void main(String args[]) {
		
		try {
		int count=0;
		BufferedReader bufferReader=new BufferedReader(new FileReader("newfile.txt"));
		String str=bufferReader.readLine();
		
		while(str!=null) {
				count++;
				System.out.println(count+". "+str);
				str=bufferReader.readLine();
				
			}
		bufferReader.close();
		
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
