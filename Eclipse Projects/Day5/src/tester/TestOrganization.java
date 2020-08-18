package tester;

import java.util.Scanner;

import com.app.org.Employee;
import com.app.org.Manager;
import com.app.org.Worker;

public class TestOrganization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of Employees : ");
		Scanner sc=new Scanner(System.in);
		int employeeCount=sc.nextInt();
		Employee[] emp=new Employee[employeeCount];
		System.out.println("Select the option : \n 1.Hire Manager \n 2.Hire Worker \n 3.Display Information of all employees");
		int option=sc.nextInt();
		int k=0;
		while(option!=4)
		{
			switch(option)
			{
				case 1:
					if(k<employeeCount)
					{
					System.out.println("Enter the ID,Name,Department ID,Basic Pay and Performance bonus : \n");
					
					emp[k]=new Manager(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble());
					k++;
					}
					break;
				case 2:
					if(k<employeeCount)
					{
					System.out.println("Enter the ID,Name,Department ID,Basic Pay,Hourly Rate and Hours Worked  : \n");
					
					emp[k]=new Worker(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble(),sc.nextInt());
					k++;
					}
					break;
				case 3:
					for(Employee e : emp)
					{
						System.out.println(e.toString()+"\nComputed Net Salary : " + e.computeNetSalary());
						if(e instanceof Manager)
						System.out.println("\nPerformance Bonus : "+((Manager)e).getPerfBonus()+" \n------------------------------------------------\n");
						else if(e instanceof Worker)
						{
							System.out.println("\nHourly Rate : " + ((Worker)e).getHourlyRate()+" \n------------------------------------------------\n");
						}
					}
					
					break;
			}
			System.out.println("Enter 4 to exit or Select ant option Below : \n 1.Hire Manager \n 2.Hire Worker \n 3.Display Information of all employees\n");
			option=sc.nextInt();
			
		}
		sc.close();

	}

}
