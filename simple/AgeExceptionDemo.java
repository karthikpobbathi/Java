package simple;

import java.util.Scanner;

public class AgeExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		AgeExceptionDemo aa=new AgeExceptionDemo();
		
		try{if(age<18){
			throw new AgeException();
		
		}
		else
		{
			System.out.println("Valid");
		}}
		catch(AgeException e){
			System.out.println("sdjklfhasdkf");
		}
		sc.close();
	}

}
