package exercises;
import java.util.Scanner;
public class Lab1Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,count=0;
		Scanner myObj = new Scanner(System.in);
		System.out.println("enter the number: ");
		a=myObj.nextInt();
		myObj.close();
		if(a%2==0){
			while(count!=1){
			count=a/2;
			a=a/2;
			if(count==1){
				System.out.println( "number is power of 2");
				break;
			}
			if(count%2==0){
				continue;
			}
			else{
				System.out.println("number is not power of 2");
				break;
			}
		}
	}

}}
