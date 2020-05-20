package com.gmail.kursspring;

public class Decorator implements Specialist {

	private SpecialistType type;
	
	public Decorator() {
		
	}

	public Decorator(SpecialistType type) {
		this.type = type;
	}
	
	public void setType(SpecialistType type) {
		this.type = type;
	}
	
	@Override
	public String getSpecialistType() {
		return type.getSpecType();
	}

}
