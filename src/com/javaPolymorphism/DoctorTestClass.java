package com.javaPolymorphism;

public class DoctorTestClass {

	public static void main(String[] args) {
		
		Doctor doctor1 = new Doctor();
		System.out.println(doctor1.getDoctor());
		
		System.out.println("----------------------------------------------");
		
		Doctor doctor2 = new Doctor();
		System.out.println(doctor2.getDoctor());
		
		System.out.println("======================================================================");
		
		Doctor doctor3 = new Doctor("Dr.Gyaneshwar", "DNB MD, MBBS Padriatic");
		System.out.println(doctor3.getDoctor());
		
		System.out.println("----------------------------------------------");
		
		Doctor doctor4 = new Doctor("Dr.Rajeshwar", "DNB MD, MBBS Lungs Specialist");
		System.out.println(doctor4.getDoctor());

	}

}
