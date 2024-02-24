package com.javaPolymorphism;

//super/base/parent class
public class Department 
{
	
	//fields	
	private int departmentId;
	private String departmentName;
	
	//constructor
	public Department() {
		departmentId = 3039;
		departmentName = "CSE";
	}

	//method
	public String getDetails() 
	{
		return "Department [id=" + departmentId + ", name=" + departmentName + "]";
	}	
	

}
