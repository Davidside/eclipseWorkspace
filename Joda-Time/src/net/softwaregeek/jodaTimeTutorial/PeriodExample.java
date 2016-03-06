package net.softwaregeek.jodaTimeTutorial;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class PeriodExample {

	public static void main(String[] args) {
		DateTimeFormatter formatter = ISODateTimeFormat.yearMonthDay();
		
		DateTime start = new DateTime(2013, 1, 1, 0, 0, DateTimeZone.UTC);
		DateTime end = new DateTime(2014, 8, 1, 0, 0, DateTimeZone.UTC);
		
		Period period = new Period(start, end);
		
		DateTime startMinusPeriod = start.minus(period);
		DateTime endPlusPeriod = end.plus(period);
		
		System.out.printf("before start: %s\n", formatter.print(startMinusPeriod));
		System.out.printf("period start: %s\n", formatter.print(start));
		System.out.printf("period end: %s\n", formatter.print(end));
		System.out.printf("after end: %s\n", formatter.print(endPlusPeriod));

	}

}
