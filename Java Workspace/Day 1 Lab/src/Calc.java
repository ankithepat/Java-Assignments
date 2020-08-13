import java.util.Scanner;
class Calc
{
	public static void main(String[] args)
	{	
	Scanner sc=new Scanner(System.in);
			
	System.out.println("Enter the operation you want to perform \n 1.Add \n 2.Sub \n 3.Mul \n 4.Div \n 5.Quit");

	String option = sc.next();
		

	while ( !option.equals("Quit") )
	{
		double number1 = Double.parseDouble(args[0]);
		double number2 = Double.parseDouble(args[1]);
	
	switch (option)
	{
		case "Add":
			System.out.println("Addition of two numbers : " + (number1+number2));
			break;
		case "Sub":
			System.out.println("Addition of two numbers : " + (number1-number2));
			break;
		case "Mul":
			System.out.println("Addition of two numbers : " + (number1*number2));
			break;
		case "Div":
			System.out.println("Addition of two numbers : " + (number1/number2));
			break;		

		default :
			System.out.println("Enter The Valid Option");				
			break;	
	}

	System.out.println("Enter the operation you want to perform \n 1.Add \n 2.Sub \n 3.Mul \n 4.Div \n 5.Quit");

	option = sc.next();
		
	}

	}
}