package com.github.marocraft;

public class NameFactory {
	
	public String makeName(String name) {
		return name;
	}
	
	@TestModeOnly
	public String sayName(String name) {
		return makeName(name);
	}

}
