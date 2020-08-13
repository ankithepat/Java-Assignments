import java.util.Scanner;
class ExceptionHandle
{
	public static void main(String[] args)
	{	
	Scanner sc=new Scanner(System.in);
			
	System.out.println("Enter the two numbers : ");

	double number1,number2;
		
		if(sc.hasNextDouble())
		{
			number1 = sc.nextDouble();
		}
		else
		{	
			System.out.println("Invalid Input Type (must be a Double)");
			return ;
		}			
		if(sc.hasNextDouble())
		{
			number2 = sc.nextDouble();
		}
		else
		{	
			System.out.println("Invalid Input Type (must be a Double)");
			return;	
		}			
			System.out.println("Average of the two numbers : " + ((number1+number2)/2));
		

	}
}