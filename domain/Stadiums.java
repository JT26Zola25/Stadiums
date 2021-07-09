package com.natwest.springsamprojectone.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Stadiums {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String location;
	private int capacity;
	private String teamAssociation;
	private String yearOfConstruction;

	public Stadiums() {}
	
	public Stadiums(String name, String location, int capacity, String teamAssociation, String yearOfConstruction) {
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.teamAssociation = teamAssociation;
		this.yearOfConstruction = yearOfConstruction;
		
	}
	
	public Stadiums(Long id, String name, String location, int capacity, String teamAssociation, String yearOfConstruction) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.teamAssociation = teamAssociation;
		this.yearOfConstruction = yearOfConstruction;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getTeamAssociation() {
		return teamAssociation;
	}
	public void setTeamAssociation(String teamAssociation) {
		this.teamAssociation = teamAssociation;
	}
	public String getYearOfConstruction() {
		return yearOfConstruction;
	}
	public void setYearOfConstruction(String yearOfConstruction) {
		this.yearOfConstruction = yearOfConstruction;
	}
	
}
