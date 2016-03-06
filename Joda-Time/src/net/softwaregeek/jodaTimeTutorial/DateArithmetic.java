package net.softwaregeek.jodaTimeTutorial;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.format.ISODateTimeFormat;

public class DateArithmetic {
	public static void main(String args[]) {
		
		// set date to the first day of the next new year
		DateTime newYear = new DateTime(DateTimeZone.UTC).dayOfYear().withMaximumValue().plusDays(1);
		
		// find out how many days to plus to the first day of the year to get the wednesday
		DateTime firstWednesday = newYear.plusDays(DateTimeConstants.WEDNESDAY > newYear.getDayOfWeek() 
				? DateTimeConstants.WEDNESDAY - newYear.getDayOfWeek() 
				: 7 + DateTimeConstants.WEDNESDAY - newYear.getDayOfWeek()); // plus one week if first day of the year is greatet than wednesday
		
		// print the date of the first wednesday of the new year
		System.out.println(ISODateTimeFormat.date().print(firstWednesday));
	}
}
