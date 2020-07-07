package com.gmail.kursspring;

public class Decorator implements Specialist {

	private SpecialistType type;
	private PriceService priceService;
	
	/*
	public Decorator() {
		
	}
	*/

	public Decorator(SpecialistType type, PriceService priceService) {
		this.type = type;
		this.priceService = priceService;
	}
	
	public SpecialistType getType() {
		return type;
	}
	
	@Override
	public String introduceSpecialist() {
		return type.getSpecType();
	}

	@Override
	public Double getPrices() {
		return priceService.getPrice(getType());
	}

}
