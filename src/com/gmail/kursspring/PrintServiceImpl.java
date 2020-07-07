package com.gmail.kursspring;

public class PrintServiceImpl implements PrintService {
	
	public PrintServiceImpl() {
	}
	
	@Override
	public void printData(String data) {
		System.out.println(data);
	}

}
