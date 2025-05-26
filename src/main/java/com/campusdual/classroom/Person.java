package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;


	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public void getDetails(){
		StringBuilder sb = new StringBuilder();

		sb.append("El nombre es ");
		sb.append(name);
		sb.append(" y su apellido ");
		sb.append(surname);

		System.out.println(sb.toString());
	}
}
