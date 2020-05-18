package com.gmail.kursspring;

public class RenovationCompany implements Company {
	
	private String compName;
	private String compNip;
	
	private PrintServiceImpl printService;
	
	public RenovationCompany(PrintServiceImpl thePrintService) {
		System.out.println("Inside an argumented constructor - RenovationCompany(PrintServiceImpl)");
		this.printService = thePrintService;
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

	}

}
