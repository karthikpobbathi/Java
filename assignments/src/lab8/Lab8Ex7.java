package lab8;

import java.util.Scanner;

public class Lab8Ex7 {
	static boolean validate(String name){
		
		if(name.length()<8) {
			System.out.println("Length should be 8");
			return false;
			}
		
		char ch[] = new char[name.length()];
		ch = name.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i] == '_') {
				
				if(ch.length>11 && ch[i+1] == 'j' && ch[i+2]=='o' && ch[i+3]=='b') {
					
					return true;
				}
			}
		}
		
		System.out.println("Entered name length should be minimum 8 and should end with \"_job\"");
		return false;
		
		}
		
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Name(ending with _job)");
			boolean b = false;
			
			while(!b){
			String name = in.next();
			b = validate(name);
			}
			
			System.out.println("Successful.");
		}
}
