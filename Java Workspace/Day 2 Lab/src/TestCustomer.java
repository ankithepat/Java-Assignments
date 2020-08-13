import java.util.Scanner;

class TestCustomer
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Name,Email,Age and CreditLimit For Customer 1 : ");
		String name=sc.nextLine();
		String email=sc.nextLine();
		int age=sc.nextInt();
		double credit=sc.nextDouble();
		Customer c1 = new Customer(name,email,age,credit);
		Customer c2 = new Customer();
		
		System.out.println("Name,Email,Age and CreditLimit of the first customer : " + c1.displayDetails());
		System.out.println("Name,Email,Age and CreditLimit of the second customer : " + c2.displayDetails());
		System.out.println("Enter the Name,Email,Age and CreditLimit For Customer 3 : ");
		
		name=sc.next();
		email=sc.next();
		age=sc.nextInt();
		Customer c3 = new Customer(name,email,age);
		System.out.println("Name,Email,Age and CreditLimit of the third customer : " + c3.displayDetails());
		System.out.println("Enter the credit limit that is to be set for customer 3 : ");
		credit=sc.nextDouble();
		c3.setCredit(credit);
		System.out.println("The new credit limit set for customer 3 is : " + c3.getCredit());
		
	}
}