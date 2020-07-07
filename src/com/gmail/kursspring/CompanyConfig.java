package com.gmail.kursspring;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:company.properties")
public class CompanyConfig {
	
	@Value("${decoratorPrice}")
	private double decoratorPrice;
	
	@Value("${electricianPrice}")
	private double electricianPrice;
	
	@Bean 
	public Map<SpecialistType, Double> tarriff() {
		Map<SpecialistType, Double> map = new TreeMap<>();
		map.put(SpecialistType.DECORATOR, decoratorPrice);
		map.put(SpecialistType.ELECTRICIAN, electricianPrice);
		
		return map;
	}
	


	@Bean
	public PrintService printServiceImpl() {
		return new PrintServiceImpl();
	}
	
	@Bean
	public PriceService priceServiceImpl() {
		return new PriceServiceImpl(tarriff());
	}
	
	@Bean
	public DateService dateServiceImpl() {
		return new DateServiceImpl();
	}
	
	@Bean
	public Specialist decorator() {
		return new Decorator(SpecialistType.DECORATOR , priceServiceImpl());
	}
	
	@Bean
	public Specialist electrician() {
		return new Electrician(SpecialistType.ELECTRICIAN, priceServiceImpl());
	}
	
	@Bean
	public List<Specialist> specialists() {
		List<Specialist> specList = new ArrayList<>();
		specList.add(decorator());
		specList.add(electrician());
		
		return specList;
	}
	
	@Bean
	public Company renovationCompany() {
		return new RenovationCompany(printServiceImpl(), dateServiceImpl(), specialists());
	}

}
