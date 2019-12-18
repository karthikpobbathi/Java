package simple;
import java.io.File;
import java.io.IOException;
public class IoFormat {
	public static void main(String[] args) throws IOException {
	File f=new File("NewFile.txt");
	f.createNewFile();
}}