import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	
	String time = sc.next();
	String not_time = sc.next();
	String[] time1 = time.split(":");
	int hr = Integer.parseInt(time1[0]);
	int min = Integer.parseInt(time1[1]);
	int min_to_add = Integer.parseInt(not_time);
	
	
	if(hr>=0 && hr<24)
	{
		if(min>=0 && min<=59){
			min=min + min_to_add;
		  System.out.println(hr+":"+min);
			
		}
		else
		{
			System.out.println("Notification cannot be sent for the day");
		}
	}
	else
	{
		System.out.println("Notification cannot be sent for the day");
	}
	
	}
	
}
