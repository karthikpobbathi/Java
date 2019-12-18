package simple;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {
public static void main(String[] args) {
	LocalDate currentDate=LocalDate.now();
	LocalDate independanceDay=LocalDate.of(1947, Month.AUGUST, 15);
	System.out.println("Independence:"+independanceDay);
	System.out.println("today:"+currentDate);
	System.out.println("Tomorrow:"+currentDate.plusDays(1));
	System.out.println("Last Month:"+currentDate.minusMonths(1));
	System.out.println("Is Leap:"+ currentDate.isLeapYear());
	System.out.println("Move to 30th day of month:"+currentDate.withDayOfMonth(30));
	System.out.println("Number of days in this month:"+ currentDate.lengthOfMonth());
	
}
}
