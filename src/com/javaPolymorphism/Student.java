package com.javaPolymorphism;


//sub/derived/child class
//Inheritance
public class Student extends Department{
	
	//fields
	private int studentId;
	private String studentName;
	private double studentMarks;	
	
	//constructor
	public Student() {
		studentId = 2020;
		studentName = "Ganesh";
		studentMarks = 78.89;
	}

	//method
	public String getDetails()//overrides com.javaPolymorphism.Department.getDetails()
	{
		return "Student [id=" + studentId + ", name=" + studentName + ", marks=" + studentMarks + "]";
	}	

	public String getStudentDetails()
	{
		return "Student [id=" + studentId + ", name=" + studentName + ", marks=" + studentMarks + "]";
	}	
}
