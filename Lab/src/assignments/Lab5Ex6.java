package assignments;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Lab5Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		sc.close();
		try{if(salary<3000){
			throw new EmployeeException(salary);
		
		}
		else
		{
			System.out.println("More than 3000");
		}}
		catch(EmployeeException e){
			System.out.println(e);
		}
		sc.close();
	
	}

}
