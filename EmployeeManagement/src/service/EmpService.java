package service;
import beans.Employee;
public class EmpService {
public void recieveObject(Employee e){
	System.out.println("employee id "+ e.empId);
	System.out.println("employee nmae "+e.empName);
	System.out.println("employee department "+e.empDept);
	System.out.println("employee salary "+e.empSalary);
	System.out.println("employee number "+e.empCell_No);
	System.out.println("employee dateof birth "+e.dateOfBirth);}
}
