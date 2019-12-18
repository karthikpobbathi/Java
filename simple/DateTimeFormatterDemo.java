package simple;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterDemo {
	public static void main(String[] args) {
DateTimeFormatter formatter= DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
DateTimeFormatter formatter1=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
DateTimeFormatter formatter2= DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
DateTimeFormatter formatter3= DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
LocalDate currentDate= LocalDate.now();
System.err.println(currentDate.format(formatter1));
System.err.println(currentDate.format(formatter2));
System.err.println(currentDate.format(formatter3));
System.err.println(currentDate.format(formatter));

	}}
