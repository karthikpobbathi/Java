package exercises;

public class Lab1Ex3
{

	public static void main(String[] args)
	{
		System.out.println(checkNumber(1243));	
	}


	static boolean checkNumber(int input)
	{
		int x;
		int y;
		while(input != 0)
		{
			x= input % 10;
			input= input / 10;
			y= input % 10;
			if (x<y)
			{
				return false;
			}
		}
		return true;
	}
}
