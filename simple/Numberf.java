package simple;

public class Numberf {
public static void main(String[] args) {
	try{
		int num=Integer.parseInt("asd");
	}
	catch(NumberFormatException e){
		System.out.println(e.getMessage());
	}
}
}
