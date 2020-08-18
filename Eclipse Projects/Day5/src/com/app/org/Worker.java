package com.app.org;

public class Worker extends Employee {
	private double hourlyRate;
	private int hoursWorked;
	public Worker(int id,String name,int deptId,double basic,double hr,int hw)
	{
		super(id,name,deptId,basic);
		this.hourlyRate=hr;
		this.hoursWorked=hw;
	}
	@Override
	public String toString()
	{
		return "Employee Details : " + super.toString() + "\nHours Worked : " + hoursWorked;
	}
	@Override
	public double computeNetSalary()
	{
		return basic+(hoursWorked*hourlyRate);
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	

}
