import java.util.Scanner;
class Mod
{
	public static void main(String[] args)
	{	
	int sum=Integer.parseInt(args[0]);
	int count=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number : ");
	while(sc.hasNextInt())
	{
		count++;
		
		System.out.println("Enter The Number : ");
		
		sum+=sc.nextInt();	
			
	}
		System.out.println("Average of the two numbers : " + sum/count);
		
	}
}