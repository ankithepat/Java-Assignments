package tester;
import java.util.*;
public class Store{
        public static void main(String[] args)
        {
            int quantity,price,total=0;
            int choice;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your Choice : \n 1.Dosa \n 2.Tea \n 3.Coffee \n 4.Paneer Tikka \n 5.ChocoIceCream \n 6.Generate Bill \n");
            choice=sc.nextInt();
            while(choice!=6)
            {
                
                switch(choice)
                {
                    case 1:
                        price=40;
                        System.out.println("Enter the quantity :");
                        quantity=sc.nextInt();
                        total+=quantity*price;
                        break;
                    case 2:
                        price=10;
                        System.out.println("Enter the quantity :");
                        quantity=sc.nextInt();
                        total+=quantity*price;
                        break;
                    case 3:
                        price=15;
                        System.out.println("Enter the quantity :");
                        quantity=sc.nextInt();
                        total+=quantity*price;
                        break;
                    case 4:
                        price=120;
                        System.out.println("Enter the quantity :");
                        quantity=sc.nextInt();
                        total+=quantity*price;
                        break;
                    case 5:
                        price=90;
                        System.out.println("Enter the quantity :");
                        quantity=sc.nextInt();
                        total+=quantity*price;
                        break;
                    default:
                        System.out.println("Please Enter A valid choice.");
                        break;

                        
                }
                System.out.println("Would You like to add anything to the order : ");
                
            System.out.println("Enter Your Choice : \n 1.Dosa \n 2.Tea \n 3.Coffee \n 4.Paneer Tikka \n 5.ChocoIceCream \n 6.Generate Bill \n");
                choice=sc.nextInt();
            }
            System.out.println("The total bill is : " + total);
            
        }
     }