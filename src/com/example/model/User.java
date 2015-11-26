package com.example.model;

public class User {

	private String FirstName;
	
	private String LoadName;

	
	
	public User(String firstName, String loadName) {
		super();
		FirstName = firstName;
		LoadName = loadName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLoadName() {
		return LoadName;
	}

	public void setLoadName(String loadName) {
		LoadName = loadName;
	}
	
	
}
