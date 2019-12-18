package com.cg.eis.exception;

public class EmployeeException extends Exception {
	private int salary ;
	public EmployeeException(int a){
		salary = a;
	}
	public String toString(){
		return " salary is less than" +salary ;
	}
}
