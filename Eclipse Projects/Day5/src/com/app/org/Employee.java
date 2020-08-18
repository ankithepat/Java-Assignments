package com.app.org;

public abstract class Employee {
	private int id;
	private String name;
	private int deptId;
	public double basic;
	Employee(int id,String name,int deptId,double basic)
	{
		this.basic=basic;
		this.deptId=deptId;
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString()
	{
		return "\nName : " + name + "\nID : " + id + "\nDepartment ID : " + deptId + "\nBasic Pay : " + basic ;
	}
	public abstract double computeNetSalary();
}
