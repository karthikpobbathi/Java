package beans;

public class Employee {
public String empId;
public String empName;
public String empDept;
public long empSalary;
public int empCell_No;
public String dateOfBirth;
public Employee (String empId,String empName,String empDept,long empSalary,int empCell_No,String dateOfBirth){
	this.empId=empId;
	this.empName=empName;
	this.empDept=empDept;
	this.empSalary=empSalary;
	this.empCell_No=empCell_No;
	this.dateOfBirth=dateOfBirth;
}
}
