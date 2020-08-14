package com.cdac.core;

public class Student {
	private int id;
	private static int idCounter;
	private String name;
	private String email;
	private int age;
	public double gpa;
	
	public Student(String nameByUser,String emailByUser,int ageByUser)
	{
		this.id=++(idCounter);
		name=nameByUser;
		email=emailByUser;
		age=ageByUser;
		
	}
	public String fetchDetails()
	{
		return "ID - "+id+" Name : "+name+" Email : "+email+" Age : "+age;
	}
	public double computeGPA(double scoreQuiz,double scoreTest,double scoreAssignments)
	{
		this.gpa=((20.00*scoreQuiz)/100.00) + ((50.00*scoreTest)/100.00) + ((30.00*scoreAssignments)/100.00);
		
		return gpa;
	}

}
