package assignments;

import java.util.Scanner;


public class Lab5Ex5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		sc.close();
		try{if(age<15){
			throw new AgeException(age);
		
		}
		else
		{
			System.out.println("Valid");
		}}
		catch(AgeException e){
			System.out.println(e);
		}
		sc.close();
	}

}class AgeException extends Exception {
	private int age ;
	AgeException(int a){
		age = a;
	}
	public String toString(){
		return age +" is an invalid age";
	}
}
