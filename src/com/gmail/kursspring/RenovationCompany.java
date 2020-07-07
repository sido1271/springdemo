package com.gmail.kursspring;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;

public class RenovationCompany implements Company {
	
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("en", "EN"));
	
	@Value("${foo.name}")
	private String compName;
	
	@Value("${foo.nip}")
	private String compNip;
	
	private PrintService printService;
	private DateService dateService;
	private List<Specialist> specialists;
	
	public RenovationCompany(PrintService thePrintService, DateService theDateService, List<Specialist> theSpecialists) {
		this.printService = thePrintService;
		this.dateService = theDateService;
		this.specialists = theSpecialists;
	}

	public void setCompName(String companyName) {
		this.compName = companyName;
	}

	public void setCompNip(String companyNip) {
		this.compNip = companyNip;
	}

	@Override
	public void printInformations() {
		System.out.println("Company informations: ");
		printService.printData("Company name: " + compName);
		printService.printData("Company NIP: " + compNip);
		
		System.out.println("Specialists: ");
		for (Specialist e : specialists) {
			printService.printData(e.introduceSpecialist());
		}
	}

	@Override
	public void printDate() {
		printService.printData("Renovation will start in " + dateService.getDate().format(formatter));
	}

	@Override
	public void printPrice() {
		double totalCost = 0;
		
		 for (Specialist e : specialists) {
			 System.out.print(e.getClass().getSimpleName() + " price: ");
			 printService.printData(e.getPrices().toString());
			 
			 totalCost += e.getPrices();
		 }
		 System.out.println("Total cost of renovation: " + totalCost);
	}
}


