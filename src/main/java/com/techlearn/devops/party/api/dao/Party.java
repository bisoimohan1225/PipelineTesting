package com.techlearn.devops.party.api.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Party {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String partyUID;
	private String firstName;
	private String lastName;
	private String location;
	private String email;

	public Party() {
	}
	public Party(int id, String partyUID, String firstName, String lastName, String location, String email) {
		super();
		this.id = id;
		this.partyUID = partyUID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.location = location;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPartyUID() {
		return partyUID;
	}
	public void setPartyUID(String partyUID) {
		this.partyUID = partyUID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
