package fr.scholanova.group.java.enums;

public enum GenderEnum {
	MALE("M", "Male"), FEMALE("F", "Female");
	
	private String shortName;
	private String longName;

	private GenderEnum(String shortName, String longName) {
		this.shortName = shortName;
		this.longName = longName;
	}
	
	
}
