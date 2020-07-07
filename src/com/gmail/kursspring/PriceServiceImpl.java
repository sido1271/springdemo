package com.gmail.kursspring;

import java.util.Map;

public class PriceServiceImpl implements PriceService {
	
	private Map<SpecialistType, Double> tariff;
	
	public PriceServiceImpl(Map<SpecialistType, Double> tariff) {
		this.tariff = tariff;
	}
	
	@Override
	public double getPrice(SpecialistType type) {
		return tariff.get(type);
	}
	

}
