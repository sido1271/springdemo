package com.gmail.kursspring;

import java.util.ArrayList;
import java.util.List;

public class RenovationCompany implements Company {
	
	private String compName;
	private String compNip;
	
	private PrintService printService;
	private PriceService priceService;
	private DateService dateService;
	private List<Specialist> specialists;
	
	public RenovationCompany(PrintService thePrintService, PriceService thePriceService, DateService theDateService, List<Specialist> theSpecialists) {
		System.out.println("Inside an argumented constructor - RenovationCompany(PrintService)");
		this.printService = thePrintService;
		this.priceService = thePriceService;
		this.dateService = theDateService;
		this.specialists = theSpecialists;
	}

	public void setCompName(String companyName) {
		System.out.println("Inside setter of CompanyName");
		this.compName = companyName;
	}

	public void setCompNip(String companyNip) {
		System.out.println("Inside setter of CompanyNIP");
		this.compNip = companyNip;
	}

	@Override
	public void printInformations() {
		printService.printData(compName);
		printService.printData(compNip);
	}

	@Override
	public void printDate() {
		
	}

	@Override
	public void printPrice() {
		System.out.println("Decorator price: " + priceService.getPrice(SpecialistType.DECORATOR));
		System.out.println("Electrician price: " + priceService.getPrice(SpecialistType.ELECTRICIAN));
		
		// for (Specialist e : specialists) {
		//	System.out.println(priceService.getPrice(e));
	}
}


