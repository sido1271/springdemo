package com.gmail.kursspring;

public class Electrician implements Specialist {

	private SpecialistType type;
	
	public Electrician() {
		
	}
	
	public Electrician(SpecialistType type) {
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
