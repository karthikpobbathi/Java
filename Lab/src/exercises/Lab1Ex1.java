package exercises;

public class Lab1Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (calculateSum(10) );
	}
	public static int calculateSum(int input)
	{
		int i=1,sum=0;
		while(i<=input){
			if((i % 3 == 0) || (i % 5 == 0)) 
			{
				sum += i;
			}
			i++;
		}
		return sum;
	}
}
