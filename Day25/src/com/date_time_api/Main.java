package com.date_time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {
	
	public static void main(String[] args) {
		
		// Print Date
		
		LocalDate today = LocalDate.now();
		
		System.out.println("Today's Date: " + today);
		
		System.out.println("Month: " + today.getMonth());
		
		System.out.println("Month: " + today.getMonthValue());
		
		System.out.println("Day: " + today.getDayOfMonth());
		
		System.out.println("Year: " + today.getDayOfYear());
		
		System.out.println("Year: " + today.getYear());
		
		System.out.println("Era: " + today.getEra());
		
		System.out.println("Week: " + today.getDayOfWeek());
		
		System.out.println("====================");
		
		// Print Time
		
		LocalTime time = LocalTime.now();
		
		System.out.println("Time: " + time);
		
		System.out.println("Hour: " + time.getHour());
		
		System.out.println("Minute: " + time.getMinute());
		
		System.out.println("Second: " + time.getSecond());
		
		System.out.println("Nano-Second: " + time.getNano());
		
		System.out.println("=====================");
		
		// Print Date and Time
		
		LocalDateTime res = LocalDateTime.now();
		
		System.out.println(res);
//	    Can use combination of LocalDate and LocalTime also
		
		System.out.println("=====================");
		
		// Create Specific Date and Time
		
		LocalDateTime specificDateTime = LocalDateTime.of(2025, Month.DECEMBER, 25, 10, 30, 45);
		
		System.out.println("Specific Date and Time: " + specificDateTime);
		
		System.out.println("Plus 5 Days: " + specificDateTime.plusDays(5));
		
		System.out.println("Minus 2 Hours: " + specificDateTime.minusHours(2));
		
		System.out.println("With Year 2030: " + specificDateTime.withYear(2030));
		
		System.out.println("With Month FEBRUARY: " + specificDateTime.plusMonths(2));
		
//		Can use other methods like plusWeeks, minusMinutes, etc.
		
		
	}
	
	
}
