package com.javaPolymorphism;

public class DoctorTestClass2 {

	public static void main(String[] args) 
	{		
		Doctor doctor = new Doctor();
		System.out.println(doctor.getDoctor());
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(doctor.getDoctor("Dr. Kiran Kumar"));

	}

}
