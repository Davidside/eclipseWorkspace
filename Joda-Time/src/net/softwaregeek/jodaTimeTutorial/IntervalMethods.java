package net.softwaregeek.jodaTimeTutorial;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.LocalTime;
import org.joda.time.format.ISODateTimeFormat;

public class IntervalMethods {
	public static void main(String args[]) {
		DateTime today = new DateTime(DateTimeZone.UTC);
		
		Interval firstMeeting = new Interval(
				new LocalTime(9, 0).toDateTime(today),
				new LocalTime(10, 0).toDateTime(today));
		
		Interval coffeeBreak = new Interval(
				new LocalTime(10, 0).toDateTime(today),
				new LocalTime(10, 30).toDateTime(today));
		
		Interval secondMeeting = new Interval(
				new LocalTime(10, 30).toDateTime(today),
				new LocalTime(12, 0).toDateTime(today));
		
		Interval lunchTime = new Interval(
				new LocalTime(13, 0).toDateTime(today),
				new LocalTime(14, 0).toDateTime(today));
		
		Interval thirdMeeting = new Interval(
				new LocalTime(16, 0).toDateTime(today),
				new LocalTime(18, 0).toDateTime(today));
		
		Interval sportEvent = new Interval(
				new LocalTime(17, 0).toDateTime(today),
				new LocalTime(19, 0).toDateTime(today));
		
		System.out.printf("First meeting abuts coffee break: %b\n", firstMeeting.abuts(coffeeBreak));
		System.out.printf("Lunch time is before second meeting: %b\n", lunchTime.isBefore(secondMeeting));
		System.out.printf("Sport event is after the lunch: %b\n", sportEvent.isAfter(lunchTime));
		
		Interval gapLunch = thirdMeeting.gap(lunchTime);
		System.out.printf("I have spare time after lunch to third meeting from %s to %s\n",
				ISODateTimeFormat.hourMinute().print(gapLunch.getStart()),
				ISODateTimeFormat.hourMinute().print(gapLunch.getEnd()));
		
		Interval overlapSport = thirdMeeting.overlap(sportEvent);
		System.out.printf("I will miss the part of sport event from %s to %s\n",
				ISODateTimeFormat.hourMinute().print(overlapSport.getStart()),
				ISODateTimeFormat.hourMinute().print(overlapSport.getEnd()));
	}
}
