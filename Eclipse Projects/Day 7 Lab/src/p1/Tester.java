package p1;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args)
	{
	Stack stk=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the stack to be implemented : \n 1.Fixed Stack \n 2.Growable Stack  \n");
	int option=sc.nextInt();
	
	while(option!=5)
	{
	
		switch(option)
		{
		case 1:
			if(stk==null)
			{
				System.out.println("Creating Fixed Stack!!");
				stk=new FixedStack();
			}
			else
			{
				System.out.println("Enter Other Option Stack Has Been Created Already");
			}
			
				
			break;
		case 2:
			if(stk==null)
			{
				System.out.println("Creating Growable Stack!!");
				stk=new GrowableStack();
			}
			else
			{
				System.out.println("Enter Other Option Stack Has Been Created Already");
			}
			
			break;
		case 3:
			if(stk==null)
			{
				System.out.println("The user has not selected the stack!!");
				break;
			}
			System.out.println("Enter Employee Details : ");
			Employee e=new Employee(sc.nextInt(),sc.next());
			stk.push(e);
			break;
		case 4:
			if(stk==null)
			{
				System.out.println("The user has not selected the stack!!");
				break;
			}
			System.out.println("Details of the employee popped out : \n"+stk.pop());
			break;
		}
		System.out.println("Enter : \n 3.To Push Data \n 4. To Pop Data & Display  \n 5. To Exit");
		option=sc.nextInt();
	
	
	}
	sc.close();
	}
}
