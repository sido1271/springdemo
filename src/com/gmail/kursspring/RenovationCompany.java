package com.gmail.kursspring;

public class RenovationCompany implements Company {
	
	private String compName;
	private String compNip;
	
	private PrintService printService;
	private PriceService priceService;
	private DateService dateService;
	
	public RenovationCompany(PrintService thePrintService, PriceService thePriceService, DateService theDateService) {
		System.out.println("Inside an argumented constructor - RenovationCompany(PrintService)");
		this.printService = thePrintService;
		this.priceService = thePriceService;
		this.dateService = theDateService;
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
		System.out.println(dateService.getDate());
	}

	@Override
	public void printPrice() {
		System.out.println("Decorator price: " + priceService.getPrice(SpecialistType.DECORATOR));
		System.out.println("Electrician price: " + priceService.getPrice(SpecialistType.ELECTRICIAN));
	}

}
