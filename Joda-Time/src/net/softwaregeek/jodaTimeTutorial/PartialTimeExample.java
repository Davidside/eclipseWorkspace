package net.softwaregeek.jodaTimeTutorial;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.format.ISODateTimeFormat;

public class PartialTimeExample {

	public static void main(String[] args) {
		LocalDate partialDate = new LocalDate(2012, 12, 3);
		LocalTime partialTime = new LocalTime(12, 50);
		
		DateTime dateTime = partialDate.toDateTime(partialTime, DateTimeZone.UTC);
		
		System.out.println(ISODateTimeFormat.dateHourMinuteSecond().print(dateTime));
		
		
		LocalTime partialTime2 = new LocalTime(23, 30);
		DateTime dateTime2 = partialTime2.toDateTime(new DateTime(DateTimeZone.UTC));
		
		System.out.println(ISODateTimeFormat.dateHourMinuteSecond().print(dateTime2));

	}

}
