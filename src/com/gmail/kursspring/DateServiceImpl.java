package com.gmail.kursspring;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateServiceImpl implements DateService {

	private LocalDate today = LocalDate.now();
	private final Locale locale = new Locale("en", "EN");
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", locale);
	
	public DateServiceImpl() {
		
	}
	
	public DateServiceImpl(LocalDate date) {
		this.today = date;
	}
	
	@Override
	public LocalDate getDate() {
		System.out.println("Today is " + today.format(formatter));
		return today.plus(2, ChronoUnit.WEEKS);
	}

}
