package lab13;
import java.util.Scanner;

interface Valids{
	boolean valid(String userName, String password);
}
public class LAb13Ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next(), pass = in.next();
		
		Valids v = (uName, uPass)->{
				if(uName.equalsIgnoreCase("Abhian007") && uPass.equalsIgnoreCase("abhids@007")) {
					return true;
				}
			return false; };
		
		System.out.println(v.valid(name, pass));
	}
}
