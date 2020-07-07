package com.gmail.kursspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(CompanyConfig.class);
		
		Company company = context.getBean("renovationCompany", Company.class);
		
		company.printInformations();
		company.printPrice();
		company.printDate();
		
		context.close();
	}

}
