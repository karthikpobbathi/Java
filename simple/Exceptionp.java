package simple;

public class Exceptionp {
public static void main(String[] args) {
	try{
		divideByZero(1,0);
	}
	catch(ArithmeticException e){
		System.out.println(e);
	}
	finally{
		System.out.println("finally block");
	}
}
/*static void divideByZero(int a,int b){
	int c;
	c=a/b;
}*/
static void divideByZero(int a,int b)throws ArithmeticException {
	int c;
	c=a/b;
	throw new ArithmeticException();
}
}
