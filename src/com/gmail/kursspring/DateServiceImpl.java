package com.gmail.kursspring;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateServiceImpl implements DateService {

	private LocalDate today = LocalDate.now();
	private LocalDate renovationDate = today.plus(2, ChronoUnit.WEEKS);
	
	public DateServiceImpl() {
		
	}
	
	public DateServiceImpl(LocalDate date) {
		this.today = date;
	}
	
	@Override
	public LocalDate getDate() {
		String formattedDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
		String formattedRenovationDate = renovationDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
		System.out.println("Today is " + formattedDate);
		System.out.println("Renovation will start on " + formattedRenovationDate);
		return today.plus(2, ChronoUnit.WEEKS);
	}

}
