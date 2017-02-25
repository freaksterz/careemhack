package com.hacareem.enums;

public enum Size {
	LARGE("large"),
	MEDIUM("medium"),
	SMALL("small"),
	TINY("tiny");
	
	private String size;
	Size(String size) {
		this.size=size;
	}
	 public String Size() {
	        return size;
	   }
	
}
