package assignments;

public class Cubesp {
public static void main(String[] args) {
	System.out.println(cubesOfDigit(123));
}
static int cubesOfDigit(int input){
	int sum=0;
	while(input!=0){
		sum+=Math.pow(input%10,3);
		input/=10;
	}
	return sum;
}
}
