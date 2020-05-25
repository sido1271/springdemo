package com.gmail.kursspring;

import java.util.List;

public class RenovationCompany implements Company {
	
	private String compName;
	private String compNip;
	
	private PrintService printService;
	private DateService dateService;
	private List<Specialist> specialists;
	
	public RenovationCompany(PrintService thePrintService, DateService theDateService, List<Specialist> theSpecialists) {
		System.out.println("Inside an argumented constructor - RenovationCompany(PrintService)");
		this.printService = thePrintService;
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
		
		 for (Specialist e : specialists) {
			 System.out.println(e.getPrices());		
		 }
	}
}


