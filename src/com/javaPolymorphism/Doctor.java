package com.javaPolymorphism;

public class Doctor 
{
	
	//fields
	private String doctorName;
	private String doctorSpecialization;
	
	
	//default constructor
	public Doctor() 
	{
		doctorName = "Dr. Raghav";
		doctorSpecialization="MD, MBBS, UK.";
	}

	//parameterized constructor
	public Doctor(String doctorName, String doctorSpecialization) {
		this.doctorName = doctorName;
		this.doctorSpecialization = doctorSpecialization;
	}

	//method
	public String getDoctor() //without parameters
	{
		return "Doctor [doctorName=" + doctorName + ", doctorSpecialization=" + doctorSpecialization + "]";
	}
	
	public String getDoctor(String doctorName) //with parameters
	{
		this.doctorName = doctorName;
			
		return "Doctor [doctorName=" + this.doctorName + "]";
	}

}
