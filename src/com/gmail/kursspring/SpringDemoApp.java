package com.gmail.kursspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Company company = context.getBean("myRenovationCompany", Company.class);
		Specialist decorSpec = context.getBean("myDecorator", Specialist.class);
		Specialist electricSpec = context.getBean("myElectrician", Specialist.class);

		company.printInformations();
		System.out.println(decorSpec.getSpecialistType());
		System.out.println(electricSpec.getSpecialistType());
		
		context.close();
	}

}
