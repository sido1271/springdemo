package com.gmail.kursspring;

public enum SpecialistType {
	DECORATOR("Interior decorator"),
	ELECTRICIAN("Electrical designer");

	private String specType;

	SpecialistType(String specType) {
		this.specType = specType;
	}
	
	public String getSpecType() {
		return specType;
	}
}

