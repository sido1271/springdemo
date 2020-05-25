package com.gmail.kursspring;

public class Electrician implements Specialist {

	private SpecialistType type;
	private PriceService priceService;
	
	public Electrician() {
		
	}
	
	public Electrician(SpecialistType type, PriceServiceImpl priceService) {
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
