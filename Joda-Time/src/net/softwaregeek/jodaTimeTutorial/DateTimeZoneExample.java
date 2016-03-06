package net.softwaregeek.jodaTimeTutorial;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class DateTimeZoneExample {

	public static void main(String[] args) {

		DateTimeZone localTimeZone = DateTimeZone.forID("Europe/Prague");
		
		DateTime utcTime = new DateTime(2012, 11, 29, 11, 40, DateTimeZone.UTC);
		DateTime localTime = utcTime.withZone(localTimeZone);
		
		System.out.println(utcTime);
		System.out.println(localTime);

	}

}
