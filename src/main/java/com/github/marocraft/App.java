package com.github.marocraft;

/**
 * Hello world!
 */
public class App {
 public static NameFactory nameFactory = new NameFactory();
	
	public static void main(String... args) {
		
		System.out.println(nameFactory.sayName("housseine"));
		//sayMyName("housseine");
	}
	
	//@TestModeOnly
	public static String sayMyName(String name) {
		return name;
	}
}
