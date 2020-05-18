package com.gmail.kursspring;

public class PrintServiceImpl implements PrintService {
	
	public PrintServiceImpl() {
		System.out.println("Inside no-arg constructor - PrintServiceImpl");
	}
	
	@Override
	public void printData(String data) {
		System.out.println(data);
	}

}
