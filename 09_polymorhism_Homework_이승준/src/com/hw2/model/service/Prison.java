package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	
	 private Prisoner[] prisoners;  
	 private int prisonerCount;    

	    public Prison(int size) {
	        prisoners = new Prisoner[size];  
	        prisonerCount = 0;               
	    }

	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePerson(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayAllPersons() {
		// TODO Auto-generated method stub
		
	}

	public int getPrisonerCount() {
		return prisonerCount;
	}

	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}
	
	

}
