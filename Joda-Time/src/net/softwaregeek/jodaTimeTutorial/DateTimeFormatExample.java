package net.softwaregeek.jodaTimeTutorial;

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;

import java.util.Locale;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.ISODateTimeFormat;

public class DateTimeFormatExample {

	public static void main(String[] args) {
		
		DateTime dateTime = new DateTime(2012, 12, 1, 11, 30, DateTimeZone.UTC);
		
		// using ISODateTimeFormat
		System.out.println("ISODateTimeFormat:");
		System.out.println(ISODateTimeFormat.yearMonthDay().print(dateTime));
		System.out.println(ISODateTimeFormat.hourMinuteSecond().print(dateTime));
		System.out.println(ISODateTimeFormat.dateHourMinuteSecond().print(dateTime));
		System.out.println();
		
		// Using pattern format with also locale specification
		DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy/MMMM/dd");
		DateTimeFormatter frenchFmt = fmt.withLocale(Locale.FRENCH);
		DateTimeFormatter germanFmt = fmt.withLocale(Locale.GERMAN);
		
		System.out.println("DateTimeFromat.forPattern:");
		System.out.println("Pattern witout Locale: " + fmt.print(dateTime));
		System.out.println("Pattern with French Locale: " + frenchFmt.print(dateTime));
		System.out.println("Pattern with German Locale: " + germanFmt.print(dateTime));
		System.out.println();
		
		// using custom format via builder class
		DateTimeFormatter customFormat = new DateTimeFormatterBuilder()
				.appendDayOfWeekText()
				.appendLiteral(", ")
				.appendDayOfMonth(2)
				.appendLiteral('-')
				.appendMonthOfYearText()
				.appendLiteral('-')
				.appendYear(4, 4)
				.appendLiteral(", ")
				.appendEraText()
				.toFormatter();
		
		System.out.println("Custom date formate via buider class:");
		System.out.println(customFormat.print(dateTime));
		System.out.println();

		// reading date from String, convert it to date and print it
		String strDateTime = "01.12.2012";
		DateTimeFormatter forStrFormatter = DateTimeFormat.forPattern("dd.MM.yyyy");
		DateTime fromStrDateTime = forStrFormatter.parseDateTime(strDateTime);
		
		System.out.println("Reading date from String, converting it to DateTime and print it");
		System.out.println("Simple String date: " + strDateTime);
		System.out.println("String date after being converted to DateTime: " + ISODateTimeFormat.yearMonthDay().print(fromStrDateTime));
	}

}
