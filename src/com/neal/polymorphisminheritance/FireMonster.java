package com.neal.polymorphisminheritance;

public class FireMonster extends Monster{
	public FireMonster(String name) {
		super(name);
	}
	
	public String attack() {
		return "Attack with Fire!";
	}
}
