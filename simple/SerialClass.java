package simple;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialClass {
public static void main(String[] args) throws IOException,ClassNotFoundException {
	FileOutputStream f1=new FileOutputStream("Employee.ser");
Employee e=new Employee();
e.setEm_id(123);
e.setName("karthik");
e.setSalary(22000.00);
ObjectOutputStream f2= new ObjectOutputStream(f1);
f2.writeObject(e);
f2.close();
FileInputStream f3=new FileInputStream("Employee.ser");
ObjectInputStream f4=new ObjectInputStream(f3);
Employee e4=(Employee)f4.readObject();
System.out.println(e4);
f4.close();
}
}
