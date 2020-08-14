package com.app.tester;

import com.app.geometry.Point2D;
import java.util.Scanner;

class TestPoints {
	public static void main(String[] args) {

		System.out.println("Enter the number of points to be plotted : ");
		Scanner sc = new Scanner(System.in);
		int points=sc.nextInt();
		Point2D[] p = new Point2D[points];
		System.out.println("Enter the option (10 to exit)  :/n 1. To add points on specific indexes /n 2.To show points plotted so far /n 3.To get the distance between the points. \n 10. Exit\n ");

		int option = sc.nextInt();
		while (option != 10) {
			switch (option) {
			case 1:
				System.out.println("Enter the Index,X and Y Coordinates : ");
				int index = sc.nextInt();
				if(index>points-1)
				{
					System.out.println("Invalid Index");
				}
				else
				{
				p[index] = new Point2D(sc.nextDouble(), sc.nextDouble());
				System.out.println("Showing Coordinates of " + index + "th index point\n" + p[index].getDetails());
				}
				break;
			case 2:
				for(Point2D point : p )
				{
					if(point!=null)
					{
					System.out.println("Printing all the details of points plotted so far : "+point.getDetails());
					}
					
				}
				break;
			case 3:
				System.out.println("Enter the indexes of the points whose differences is to be found : ");
				int firstIndex=sc.nextInt();
				int secondIndex=sc.nextInt();
				if(firstIndex>points-1 || secondIndex>points-1)
				{
					System.out.println("Invalid Index");
				}
				else
				{
				System.out.println("The difference between the points : "+p[firstIndex].calculateDistance(p[secondIndex]));
				}
				break;
			default:
				System.out.println("Enter Valid Option : ");
				
				
			}
			option = sc.nextInt();

			}
			sc.close();
		}
	

	}

