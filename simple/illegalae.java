package simple;

public class illegalae {
public static void main(String[] args) {
		met(2);
	
}
static void met(int a){
	try{
		if(a!=1){
		throw new IllegalArgumentException();
	}}
	catch(IllegalArgumentException i){
		System.out.println("IllegalArgumentException should be one");
	}
	
}
}
