package com.gmail.kursspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Company company = context.getBean("myRenovationCompany", Company.class);

		company.printInformations();
		
		context.close();
	}

}
