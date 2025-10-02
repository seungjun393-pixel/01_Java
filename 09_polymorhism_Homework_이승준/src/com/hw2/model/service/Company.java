package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{

	 private Employee[] employee;    
	 private int employeeCount;    

	    public Company(int size) {
	        employee = new Employee[size]; 
	        employeeCount = 0;  
	    }


	@Override
	public void addPerson(Person person) {
		for(int i = 0; i<employee.length; i++) {
			if(employee[i] == null) {
				employee[i] = (Employee) person;
				System.out.println(employee[i].getInfo());
				break;
			}
		}
		employeeCount++;
	}

	@Override
	public void removePerson(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayAllPersons() {
		// TODO Auto-generated method stub
		
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	
	

}
