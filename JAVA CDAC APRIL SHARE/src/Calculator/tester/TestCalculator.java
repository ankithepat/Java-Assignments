package tester;
import java.util.*;
public class TestCalculator{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            Double n,n1;
            System.out.println("Enter the first Number : ");
            n=sc.nextDouble();
            System.out.println("\nEnter the second number :");
            n1=sc.nextDouble();
            com.app.Calculator c=new com.app.Calculator();
            c.set1(n);
            c.set2(n1);
            System.out.println("Addition  : " + c.add());
            System.out.println("Subtraction  : " + c.sub());
            System.out.println("Multiplication  : " + c.mul());
            System.out.println("Division  : " + c.div());
            
            
        }
     }