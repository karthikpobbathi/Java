package lab8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab8Ex6 {
	public static void main(String args[]) throws Exception{
		
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter the year: ");
		 int year=sc.nextInt();
		 System.out.println("Enter the month: ");
		 int month=sc.nextInt();
		 System.out.println("Enter the days: ");
		 int days=sc.nextInt();
		 
		 LocalDate inputDate = LocalDate.of(year, month, days);
		 LocalDate todayDate = LocalDate.now();
		 Period dif = Period.between(inputDate, todayDate);
		 System.out.println(dif.getYears()+"years "+dif.getMonths()+"months "+dif.getDays()+"days");
		         	        
		    }
}
