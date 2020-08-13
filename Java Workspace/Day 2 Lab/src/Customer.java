

class Customer
{

	private String name;
	private String email;
	private int age;
	private double creditLimit;
	Customer(String n,String e,int a,double c)
	{
	name=n;
	email=e;
	age=a;
	creditLimit=c;	
	}
	Customer()
	{
	//name="Riya";
	//email="riya@gmail.com";
	//age=25;
	//creditLimit=10000;
	this("Riya","riya@gmail.com",25,10000);
	}
	Customer(String n,String e,int a)
	{
	this(n,e,a,15000);
	}
	String getDetails()
	{
		return "Name Of the customer : "+name+" and his credit limit : " +creditLimit;
	}
	double getCredit()
	{
		return creditLimit;
	}
	void setCredit(double c)
	{
		creditLimit+=c;
	}
	String displayDetails()
	{
		return name+" "+email+" "+age+" "+creditLimit;
	}
	
	
}