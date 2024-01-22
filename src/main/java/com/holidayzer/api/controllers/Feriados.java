package com.holidayzer.api.controllers;

public class Feriados {
    String date;
	String name;

	public Feriados(String date, String name) {
		this.date = date;
		this.name = name;
	}

	public String getDate() {
        return date;
    }

	public String getName() {
        return name;
    }
}
