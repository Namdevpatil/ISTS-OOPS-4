package com.javaPolymorphism;

public class OverridingTestClass {

	public static void main(String[] args) {
		
		Department department = new Department();
		System.out.println(department.getDetails());
		
		System.out.println("--------------------------------------------------------");
		
		Student student = new Student();
		System.out.println(student.getDetails());

	}

}
