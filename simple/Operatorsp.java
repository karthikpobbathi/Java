package simple;

public class Operatorsp {
public static void main(String[] args) {	
	double number = 5.2;
	boolean flag = false;
	
	System.out.println("+number = " + +number);
	
	System.out.println("-number = " + -number);
	
	System.out.println("number = " + ++number);
	System.out.println("number = " + --number);
	System.out.println("!flag = " + !flag);
	relationalo();
	instanceofo();
	terinaryo();
	
}
static void relationalo(){
	int number1 = 5, number2 = 6;
	System.out.println("number1"+number1);
	System.out.println("number2"+number2);
	if (number1 > number2)
	{
		System.out.println("number1 is greater than number2.");
	}
	else
	{
		System.out.println("number2 is greater than number1.");
	}
	if (number1 < number2)
	{
		System.out.println("number1 is less than number2.");
	}
	else
	{
		System.out.println("number2 is less than number1.");
	}
	if (number1 >= number2)
	{
		System.out.println("number1 is greater than or equal to number2.");
	}
	else
	{
		System.out.println("number2 is greater than or equal to number1.");
	}
	if (number1 <= number2)
	{
		System.out.println("number1 is less than or equal number2.");
	}
	else
	{
		System.out.println("number2 is less than or equal number1.");
	}
	
	if (number1 == number2)
	{
		System.out.println("number1 is equal to number2.");
	}
	else
	{
		System.out.println("number2 is equal to number1.");
	}
}
static void instanceofo(){
	String test = "asdf";
	boolean result;
	
	result = test instanceof String;
	System.out.println(result);}
static void logicp(){
	int number1 = 1, number2 = 2, number3 = 9;
	boolean result;
	
	result = (number1 > number2) || (number3 > number1);
	System.out.println(result);
			
	result = (number1 > number2) && (number3 > number1);
	System.out.println(result);
}
static void terinaryo(){
	int februaryDays = 29;
	String result;
	
	result =  (februaryDays == 28) ? "Not a leap year" : "Leap year";
	System.out.println(result);
}

}

