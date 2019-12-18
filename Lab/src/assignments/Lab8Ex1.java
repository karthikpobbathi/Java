package assignments;


import java.util.StringTokenizer;

public class Lab8Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;int a;
		StringTokenizer str=new StringTokenizer("1 2 3 45 5"," ");
		
		while(str.hasMoreTokens()){
			
			System.out.println(a=Integer.parseInt(str.nextToken()));
			sum+=a;
		}
		
		System.out.println(sum);
	}

}
