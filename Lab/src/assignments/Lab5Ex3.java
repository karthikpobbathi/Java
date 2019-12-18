package assignments;

import java.util.Scanner;

public class Lab5Ex3 {
public static void main(String[] args) {
	int input;
	Scanner sc=new Scanner(System.in);
	input=sc.nextInt();
	sc.close();
	for(int i=2;i<input;i++){
		if(ifPrime(i)==true){
			System.out.println(i);
		}
	}
	
}
static boolean ifPrime(int num){
	for (int i = 2; i <= num/2; i++) {
		if(num%i==0){
			return false;
		}
	}return true;
}
}
