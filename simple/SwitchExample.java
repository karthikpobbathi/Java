package simple;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentDay=args[0];
		switch(currentDay){
		case "Monday":
			System.out.println("after sunday:)");
			break;
		case "Tuesday":
			System.out.println("Tuesday:)");
			break;
		case "Wednesday":
			System.out.println("Wednesday:)");
			break;
		default:
			System.out.println("other day");
		
		}
	}

}
