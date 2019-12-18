package exercises;
public class Lab1Ex2
{
	public static void main(String[] args) {
		System.out.println(calculateDifference(3));
	}
	static int  calculateDifference(int input){

		double i=1,squareSum=0,sumSquare=0;
		while(i <= input)
		{
			squareSum += Math.pow(i,2);
			sumSquare += i;
			i++;
		}
		int sum=(int)(squareSum - Math.pow(sumSquare,2));
		return sum;
	}
}
