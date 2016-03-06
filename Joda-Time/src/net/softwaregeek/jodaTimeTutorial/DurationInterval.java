package net.softwaregeek.jodaTimeTutorial;

import org.joda.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.LocalTime;
import org.joda.time.format.ISODateTimeFormat;

public class DurationInterval {

	public static void main(String[] args) {

		DateTime today = new DateTime(DateTimeZone.UTC);
		
		Set<Interval> events = new TreeSet<Interval>(
				new Comparator<Interval>() {
					public int compare(Interval o1, Interval o2) {
						return o1.toDuration().compareTo(o2.toDuration());
					}
				});
		
		events.add(new Interval(
				new LocalTime(9, 0).toDateTime(today),
				new LocalTime(11, 0).toDateTime(today)));
		
		events.add(new Interval(
				new LocalTime(10, 0).toDateTime(today),
				new LocalTime(15, 0).toDateTime(today)));
		
		events.add(new Interval(
				new LocalTime(13, 0).toDateTime(today),
				new LocalTime(16, 0).toDateTime(today)));
		
		events.add(new Interval(
				new LocalTime(8, 0).toDateTime(today),
				new LocalTime(18, 0).toDateTime(today)));
		
		events.add(new Interval(
				new LocalTime(16, 0).toDateTime(today),
				new LocalTime(17, 0).toDateTime(today)));
		
		for (Interval event : events) {
			DateTimeFormatter formatter = ISODateTimeFormat.hourMinute();
			
			System.out.printf("event: %s-%s, duration: %d\n",
					formatter.print(event.getStart()),
					formatter.print(event.getEnd()),
					event.toDurationMillis()/60000);
		}

	}

}
