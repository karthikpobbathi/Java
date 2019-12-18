package simple;

import java.io.Serializable;

public class Employee implements Serializable {
private int em_id;
private String name;
//private double salary;
private transient double salary;
public int getEm_id() {
	return em_id;
}
public void setEm_id(int em_id) {
	this.em_id = em_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String toString(){
	return(em_id+name+salary);
}
}
