package lab8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab8Ex1 {


	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the line of Integers");
		String a=in.nextLine();

		int sum=0;

		StringTokenizer st=new StringTokenizer(a);

		while(st.hasMoreElements()) {
			int n=0;
			n=Integer.parseInt(st.nextToken());
			sum=sum+n;
		}

		System.out.println("Sum = "+sum);
		in.close();
	}
}


