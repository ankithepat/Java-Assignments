package com.app.org;

public class Manager extends Employee  {
	private double perfBonus;
	public Manager(int id,String name,int deptId,double basic,double pfb)
	{
		super(id,name,deptId,basic);
		this.perfBonus=pfb;
	}
	@Override
	public String toString()
	{
		return "Employee Details : " + super.toString();
	}
	@Override
	public double computeNetSalary()
	{
		return basic+perfBonus;
	}
	public double getPerfBonus() {
		return perfBonus;
	}

	
	

}
