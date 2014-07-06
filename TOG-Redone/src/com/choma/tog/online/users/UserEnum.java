package com.choma.tog.online.users;

public enum UserEnum {

	
	ASCENDING,DESCENDING;
	
	public UserEnum getValue(String value){
		if(value == null) return null;
		
		
		if(value.equalsIgnoreCase("asc"))return ASCENDING;
		if(value.equalsIgnoreCase("desc")) return DESCENDING;
	
		return null;
	
	}
	
}
