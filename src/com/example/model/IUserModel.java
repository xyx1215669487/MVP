package com.example.model;

public interface IUserModel {

	void setId(int id);
	
	void setFirstName(String firstName);
	
	void setLoadName(String loadName);
	
	int getId();
	
	User Load(int id);
}
