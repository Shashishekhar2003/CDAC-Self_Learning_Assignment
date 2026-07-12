package com.demo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Q13DataManupulator {

	public static Date stringToDate(String dateStr, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(dateStr);
	}

	public static String dateToString(Date date, String format) {
		 SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	public static long daysBetween(Date d1, Date d2) {
		long diffInMillis = Math.abs(d2.getTime() - d1.getTime());
		 return TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);
	}

	public static void main(String[] args) {
		try {
			 String dateStr1 = "01-08-2026";
			String dateStr2 = "16-12-2026";

			  Date date1 = stringToDate(dateStr1, "dd-MM-yyyy");
			Date date2 = stringToDate(dateStr2, "dd-MM-yyyy");

			   String formattedDate1 = dateToString(date1, "dd MMM yyyy");
			String formattedDate2 = dateToString(date2, "dd MMM yyyy");

			System.out.println("Date 1 (String to Date): " + formattedDate1);
			  System.out.println("Date 2 (String to Date): " + formattedDate2);

		     	long daysDiff = daysBetween(date1, date2);
		     	System.out.println("Number of days between: " + daysDiff);

		} catch (ParseException e) {
			System.out.println("Error parsing date: " + e.getMessage());
		}
	}
}