package com.datetimeapi;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeApiDemo {

	
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
//		LocalDate epochHistory=LocalDate.EPOCH.plus(18)
//		
//	System.out.println(africanHarareDate);
//		
		LocalTime timeNow1=LocalTime.of(02,54);
		System.out.println(timeNow1);
		
		LocalTime timeNow2=LocalTime.parse("01:30:40");
		System.out.println(timeNow2);
		
		
		System.out.println(timeNow2.minus(10,ChronoUnit.HOURS));
		LocalTime localTime=LocalTime.of(02,30);
		
		
		boolean isAfter =localTime.isAfter(localTime.parse("22:00"));
		boolean isBefore =localTime.isBefore(localTime.parse("22:00"));
		
		System.out.println(isAfter);
		System.out.println(isBefore);
		
		LocalDateTime timeStamp=LocalDateTime.now();
		System.out.println(timeStamp);
		
		
		Period p=Period.between(LocalDate.now(),today);
		System.out.println(p);
		
		
		Date newDate=null;
		
		try {
			newDate= simpleDate.parse("01.01.2001");
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		//		Period period=Period.between(bDay,LocalDate.now());
//		System.out.println("year" +period.getYears());
//				
//		
//		DayOfWeeky bDayminus1=bDay.minus(Period.ofDays(5)).getDayofweek();
//		System.out.println(bDayminus1);
//		
//		Duration timeDuration=
//				Duration.between(LocalTime.parse("09:09"),)
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
