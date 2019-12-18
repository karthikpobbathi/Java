package assignments;

import java.util.Scanner;

public class Lab5Ex4 {
	static String  firstName;
	static String  lastName;

	public static void main(String[] args) {
		String fullName;
		Scanner sc=new Scanner(System.in);
		firstName=sc.next();
		lastName=sc.next();
		fullName=firstName+lastName;
		try{
			if(firstName==null && lastName==null){
				throw new NameException(firstName,lastName);
			}
			else{
				System.out.println(fullName);	
			}}
		catch(NameException e){
			System.out.println(e);
		}
	}
}



class NameException extends Exception{
	String  firstName;
	String  lastName;
	public NameException(String a,String b) {
		// TODO Auto-generated constructor stub
		firstName=a;
		lastName=b;

	}
	public String toString(){
		return "please enter the first name and last name";
	}
}
