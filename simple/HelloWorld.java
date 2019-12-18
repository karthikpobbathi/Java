package simple;

public class HelloWorld {
public static void main(String[] args){
	System.out.println("Hello World");
	HelloWorld a=new HelloWorld();
	a.add();
	Calculator b=new Calculator();
	b.add();
	b.subtract();
	b.multiplication();
	b.division();
	
}
public void add(){	
int a=0;int b=0;
	int c =a+b;
	System.out.println(c);
}
}
class Calculator{
	int a=1;
	int b=2;
	void add(){
		System.out.println(a+b);
	}
	void subtract(){
		System.out.println(a-b);	
	}void multiplication(){
		System.out.println(a*b);
	}
	void division(){
		System.out.println(a/b);
	}
}
