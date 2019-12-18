package simple;
import java.io.*;
public class Fleman {
public static void main(String[] args) throws IOException {
	FileOutputStream foh=new FileOutputStream("NewFile1.txt");
	String str="Hello";
	foh.write(str.getBytes());
	foh.close();
	FileInputStream fo=new FileInputStream("NewFile1.txt");
	int i;
	while((i=fo.read())!=-1){
		System.out.print((char)i);
	}
	fo.close();
	DataOutputStream f1=new DataOutputStream(new FileOutputStream("NewFile1.txt"));
	f1.write(100);
	f1.writeChars("adsdsdf");
	f1.writeInt(100000);;
	f1.close();
	DataInputStream f2=new DataInputStream(new FileInputStream("NewFile1.txt"));
	while((i=f2.read())!=-1){
		System.out.print(i);
	}
	f2.close();
}
}
