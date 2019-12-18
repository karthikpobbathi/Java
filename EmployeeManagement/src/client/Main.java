package client;
import beans.Employee;
import java.util.Scanner;
import service.*;
public class Main {
public static void main(String[] args) {
	 String empId;
	 String empName;
	 String empDept;
	 long empSalary;
	 int empCell_No;
	 String dateOfBirth;
	 Scanner sc=new Scanner (System.in);
	 System.out.println("Enter employee id");
	 empId=sc.next();
	 try{
		 int i=Integer.parseInt(empId);
	 }
	 catch(NumberFormatException e){
		 System.out.println("enter in numbers");
	 }
	 System.out.println("Enter employee nmae");
	 empName=sc.next();
	 System.out.println("Enter employee department");
	 empDept=sc.next();
	 System.out.println("Enter employee salary");
	 empSalary=sc.nextLong();
	 System.out.println("Enter employee cell no");
	 empCell_No=sc.nextInt();
	 System.out.println("Enter employee date of birth");
	 dateOfBirth=sc.next();
	 sc.close();
	 Employee e=new Employee( empId, empName, empDept, empSalary, empCell_No, dateOfBirth);
	 new EmpService().recieveObject(e);
}


}
