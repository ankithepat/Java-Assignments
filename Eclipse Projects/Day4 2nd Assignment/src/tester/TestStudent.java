package tester;
import java.util.*;

import com.cdac.core.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of students");
		Scanner sc=new Scanner(System.in);
		int numberOfStudents=sc.nextInt();
		Student[] class1= new Student[numberOfStudents];
		System.out.println("Enter the option : \n1.Admit New Student\n2.Assign Scores\n3.Display details of topper\n4.Exit");
		int option=sc.nextInt();
		int k=0;
		while(option!=4)
		{
			switch(option)
			{
			case 1:
				if(k>=numberOfStudents)
				{
					System.out.println("Class is full");
					return;
				}
				else
				{
				System.out.println("Enter the name,email and age of the student : ");
				String name=sc.next();
				String email=sc.next();
				int age=sc.nextInt();
				class1[k]=new Student(name,email,age);
				
				System.out.println("Details of the student added : "+class1[k].fetchDetails());
				k++;
				break;
				}
				
				
			case 2:
				System.out.println("Enter the ID and scores of quiz,test and assignment (out of 100) : ");
				int rollNo=sc.nextInt();
				
				double scoreQuiz=sc.nextDouble();
				double scoreT=sc.nextDouble();
				double scoreA=sc.nextDouble();
				if(rollNo<=numberOfStudents)
				{
				class1[rollNo-1].computeGPA(scoreQuiz, scoreT, scoreA);
				break;
				}
				else
				{
					System.out.println("Invalid Roll No.");
					break;
				}
				
			case 3:
				int index=0;
				double max1=class1[index].gpa;
				for(Student s : class1 )
				{
					if(max1<s.gpa)
					{
						max1=s.gpa;
					}
				}
				
				for(int i=0;i<numberOfStudents;i++)
				{
					if(max1==class1[i].gpa)
					{
						System.out.println("Topper Details : " + class1[i].fetchDetails()); 
					}
				}
				
				break;
				
			}
			option=sc.nextInt();
	
		}
	sc.close();
		
	}
}

